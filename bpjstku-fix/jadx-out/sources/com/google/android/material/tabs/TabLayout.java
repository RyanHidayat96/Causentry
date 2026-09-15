package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static byte[] b;
    private static int g;
    private static final Pools.Pool<Tab> tabPool;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final Pools.Pool<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;
    private int viewPagerScrollState;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 107, -36, -112, 13, -1, -62, 52, 14, -9, 15, -2, -5, -4, -53, 73, -6, -2, 1, -6, 21, -74, 20, 51, 7, -10, -10, -16, 20, 13, 5, -15, 15, 2, -34, 37, -15, 17, -15, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -65};
    private static final int $$e = 151;
    private static final byte[] $$a = {58, 66, -14, -31, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 239;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f809a = 0;
    private static int asInterface = 1;
    private static int d = 0;

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.tabs.TabLayout.$$a
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 35
            int r7 = r7 + 4
            int r5 = r5 * 17
            int r0 = 53 - r5
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r1 = com.google.android.material.tabs.TabLayout.$$d
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = -1
            if (r1 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2c
        L19:
            r3 = r2
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2a:
            r4 = r1[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + r2
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f(int, int, int, java.lang.Object[]):void");
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence contentDesc;
        private View customView;
        private Drawable icon;
        public TabLayout parent;
        private Object tag;
        private CharSequence text;
        public TabView view;
        private static final byte[] $$c = {109, 48, -62, 38};
        private static final int $$d = 102;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {58, -51, 54, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 100;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-1587985474, 1516142912, -2134739416, 1914376895, -2081659098, -1436847101, 758696787, 1242172308, -1029267643, 1385157463, 901981277, 109160241, 433664819, -275665342, -306963444, 1290206673, -386971488, -767990332};
        private int position = -1;
        private int labelVisibilityMode = 1;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f810id = -1;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r0 = r7 + 53
                int r6 = r6 * 4
                int r6 = r6 + 84
                byte[] r1 = com.google.android.material.tabs.TabLayout.Tab.$$a
                int r5 = r5 * 2
                int r5 = r5 + 4
                byte[] r0 = new byte[r0]
                int r7 = r7 + 52
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r1[r5]
                int r3 = r3 + 1
            L2a:
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                int r5 = r5 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.Tab.b(byte, int, int, java.lang.Object[]):void");
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = -1870535734;
            float f = 0.0f;
            int i5 = 1;
            char c = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 25;
                    $10 = i7 % 128;
                    if (i7 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[c] = Integer.valueOf(iArr2[i6]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 1;
                                byte b2 = (byte) (b - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 3291, 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i6 %= 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 1;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 3291 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i6++;
                    }
                    i2 = 2;
                    i4 = -1870535734;
                    f = 0.0f;
                    c = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), TextUtils.lastIndexOf("", '0', 0, 0) + 3292, 31 - (KeyEvent.getMaxKeyCode() >> 16), 1948206109, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i8++;
                    iArr5 = iArr5;
                    i5 = 1;
                }
                iArr5 = iArr6;
            }
            char c2 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i9 = 17;
                for (int i10 = 1; i9 > i10; i10 = 1) {
                    int i11 = $11 + 121;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i9];
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2559, TextUtils.indexOf("", "", 0, 0) + 29, 683220507, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i9 += 35;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i9];
                        Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) Color.alpha(0), 2559 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 29, 683220507, false, $$e(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i9--;
                    }
                }
                int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr7 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 396 - AndroidCharacter.getMirror('0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static /* synthetic */ int access$000(Tab tab) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = tab.f810id;
            if (i3 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$1500(Tab tab) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = tab.labelVisibilityMode;
            if (i4 == 0) {
                int i6 = 17 / 0;
            }
            int i7 = i3 + 59;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            return i5;
        }

        static /* synthetic */ CharSequence access$300(Tab tab) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequence = tab.contentDesc;
            if (i3 == 0) {
                return charSequence;
            }
            throw null;
        }

        static /* synthetic */ CharSequence access$400(Tab tab) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequence = tab.text;
            if (i3 == 0) {
                int i4 = 48 / 0;
            }
            return charSequence;
        }

        public Object getTag() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.tag;
            }
            throw null;
        }

        public Tab setTag(Object obj) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            Object obj2 = null;
            this.tag = obj;
            if (i4 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = i3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 com.google.android.material.tabs.TabLayout$TabView) = (r1v4 com.google.android.material.tabs.TabLayout$TabView), (r1v7 com.google.android.material.tabs.TabLayout$TabView) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        public Tab setId(int i) {
            TabView tabView;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f810id = i;
                tabView = this.view;
                int i4 = 64 / 0;
                if (tabView != null) {
                    tabView.setId(i);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                this.f810id = i;
                tabView = this.view;
                if (tabView != null) {
                    tabView.setId(i);
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            return this;
        }

        public int getId() {
            int i;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1;
            int i4 = i3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                i = this.f810id;
                int i5 = 95 / 0;
            } else {
                i = this.f810id;
            }
            int i6 = i3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw null;
        }

        public View getCustomView() {
            View view;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                view = this.customView;
                int i4 = 24 / 0;
            } else {
                view = this.customView;
            }
            int i5 = i2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return view;
        }

        public Tab setCustomView(View view) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.customView = view;
                updateView();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.customView = view;
            updateView();
            int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public Tab setCustomView(int i) {
            LayoutInflater layoutInflaterFrom;
            TabView tabView;
            boolean z;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                layoutInflaterFrom = LayoutInflater.from(this.view.getContext());
                tabView = this.view;
                z = true;
            } else {
                layoutInflaterFrom = LayoutInflater.from(this.view.getContext());
                tabView = this.view;
                z = false;
            }
            Tab customView = setCustomView(layoutInflaterFrom.inflate(i, tabView, z));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return customView;
        }

        public Drawable getIcon() {
            Drawable drawable;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 35;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                drawable = this.icon;
                int i4 = 42 / 0;
            } else {
                drawable = this.icon;
            }
            int i5 = i2 + 51;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return drawable;
        }

        public int getPosition() throws Throwable {
            CharSequence charSequence;
            int iIntValue;
            CharSequence charSequence2;
            int i;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, (ViewConfiguration.getLongPressTimeout() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            int i6 = 0;
            long j = 0;
            Object[] objArr = new Object[1];
            a(new int[]{1279209272, 1218559080, 1765695865, -598688223, 838120655, 1942241805, -275286246, -1902458934, 1977627689, 1143258438, -202607168, -955896525, 225883796, 1684069856}, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new int[]{1892053507, 1785600533, -234922007, -1668931325, -753558982, 72347315, -242249256, -418016842, -226722050, -1244122196}, TextUtils.indexOf((CharSequence) "", '0') + 16, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j2 = -721;
            CharSequence charSequence3 = "";
            long jIdentityHashCode = System.identityHashCode(this);
            long j3 = -1;
            long j4 = j3 ^ 15577055116741182L;
            long j5 = j3 ^ 2081680119625217805L;
            long j6 = 2087382417859018559L ^ j3;
            long j7 = (j2 * 15577055116741182L) + (j2 * 2081680119625217805L) + (((long) 1444) * ((jIdentityHashCode ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((jIdentityHashCode | 15577055116741182L) ^ j3) | ((jIdentityHashCode | 2081680119625217805L) ^ j3))) + (((long) 722) * ((j3 ^ (j5 | 15577055116741182L)) | ((j4 | 2081680119625217805L) ^ j3)));
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            try {
                while (i9 != 10) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37836), View.MeasureSpec.getSize(0) + 59, (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 17, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                        charSequence2 = charSequence3;
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            charSequence2 = charSequence3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getSize(0) + 37836), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, 17 - TextUtils.indexOf(charSequence2, '0', 0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        } else {
                            charSequence2 = charSequence3;
                        }
                        i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    }
                    while (true) {
                        for (int i11 = 0; i11 != 8; i11++) {
                            i = (((((int) (jLongValue >> i11)) & 255) + (i << 6)) + (i << 16)) - i;
                        }
                        if (i6 != 0) {
                            break;
                        }
                        i6++;
                        jLongValue = j7;
                    }
                    if (i == i5) {
                        return this.position;
                    }
                    int i12 = TuitionPaymentFragmentbindingInflater1 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    if (i12 % 2 == 0) {
                        jLongValue /= 1024;
                        i9 += 54;
                    } else {
                        jLongValue -= 1024;
                        i9++;
                    }
                    charSequence3 = charSequence2;
                    j = 0;
                }
                Object[] objArr3 = {642654749};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46038), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1134, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -1481534746, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) TextUtils.indexOf(charSequence, charSequence, 0);
                    int size = View.MeasureSpec.getSize(0) + 1031;
                    int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr5 = new Object[1];
                    b(b, b2, b2, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, size, scrollBarSize, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1117 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                }
                Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
                int i13 = ((int[]) objArr6[1])[0];
                int i14 = ((int[]) objArr6[3])[0];
                if (i14 != i13) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        while (i6 < strArr.length) {
                            arrayList.add(strArr[i6]);
                            i6++;
                        }
                    }
                    int[] iArr = new int[i14];
                    int i15 = i14 - 1;
                    iArr[i15] = 1;
                    Toast.makeText((Context) null, iArr[((i14 * i15) % 2) - 1], 1).show();
                }
                return this.position;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            charSequence = charSequence3;
            Object[] objArr7 = new Object[1];
            a(new int[]{-639629805, -26121274, -1063530488, 2096069667, -1163248142, 369192972, -1753237403, -932355439, 852634980, 160482192}, (ViewConfiguration.getScrollBarSize() >> 8) + 16, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(new int[]{1163917999, 1426689630, 2051136747, -407983501, 1147631289, -81836141, -1793297727, 1975587473, 810600141, 1499662848}, 16 - KeyEvent.normalizeMetaState(0), objArr8);
            iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
        }

        void setPosition(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.position = i;
            if (i4 != 0) {
                throw null;
            }
        }

        public CharSequence getText() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 111;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            CharSequence charSequence = this.text;
            int i4 = i2 + 77;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return charSequence;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001b  */
        public Tab setIcon(Drawable drawable) {
            int i = 2 % 2;
            this.icon = drawable;
            if (this.parent.tabGravity != 1) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                if (this.parent.mode == 2) {
                    this.parent.updateTabViews(true);
                }
            } else {
                this.parent.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                if (this.view.hasBadgeDrawable() && !(!this.view.badgeDrawable.isVisible())) {
                    this.view.invalidate();
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                    TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            return this;
        }

        public Tab setIcon(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            Tab icon = setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i));
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                return icon;
            }
            throw null;
        }

        public Tab setText(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 != 0) {
                    this.view.setContentDescription(charSequence);
                    int i5 = 3 / 0;
                } else {
                    this.view.setContentDescription(charSequence);
                }
            }
            this.text = charSequence;
            updateView();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Tab setText(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = i3 + 105;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int i6 = i3 + 27;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                return setText(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public BadgeDrawable getOrCreateBadge() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            TabView tabView = this.view;
            if (i3 != 0) {
                return tabView.getOrCreateBadge();
            }
            tabView.getOrCreateBadge();
            throw null;
        }

        public void removeBadge() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.view.removeBadge();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }

        public BadgeDrawable getBadge() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            BadgeDrawable badge = this.view.getBadge();
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            return badge;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:16:0x0043  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x006b  */
        /* JADX WARN: Code duplicated, block: B:9:0x0020  */
        public Tab setTabLabelVisibility(int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                this.labelVisibilityMode = i;
                if (this.parent.tabGravity != 1) {
                    if (this.parent.mode == 2) {
                    }
                }
                updateView();
                if (BadgeUtils.USE_COMPAT_PARENT) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                    int i6 = i5 % 2;
                    if (this.view.hasBadgeDrawable()) {
                        i2 = TuitionPaymentFragmentbindingInflater1 + 81;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i7 = 98 / 0;
                            if (this.view.badgeDrawable.isVisible()) {
                                this.view.invalidate();
                            }
                        } else if (this.view.badgeDrawable.isVisible()) {
                            this.view.invalidate();
                        }
                    }
                }
                return this;
            }
            this.labelVisibilityMode = i;
            if (this.parent.tabGravity != 1) {
                if (this.parent.mode == 2) {
                }
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                int i9 = i8 % 2;
                if (this.view.hasBadgeDrawable()) {
                    i2 = TuitionPaymentFragmentbindingInflater1 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i10 = 98 / 0;
                        if (this.view.badgeDrawable.isVisible()) {
                            this.view.invalidate();
                        }
                    } else if (this.view.badgeDrawable.isVisible()) {
                        this.view.invalidate();
                    }
                }
            }
            return this;
            this.parent.updateTabViews(true);
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                int i12 = i11 % 2;
                if (this.view.hasBadgeDrawable()) {
                    i2 = TuitionPaymentFragmentbindingInflater1 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i13 = 98 / 0;
                        if (this.view.badgeDrawable.isVisible()) {
                            this.view.invalidate();
                        }
                    } else if (this.view.badgeDrawable.isVisible()) {
                        this.view.invalidate();
                    }
                }
            }
            return this;
        }

        public int getTabLabelVisibility() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.labelVisibilityMode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void select() throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int i5 = i2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            tabLayout.selectTab(this);
            int i7 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        }

        public boolean isSelected() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != this.position) {
                return false;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            r0 = 70 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        
            r4 = setContentDescription(r1.getResources().getText(r4));
            r1 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1 + 73;
            com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(int r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 71
                int r2 = r1 % 128
                com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L16
                com.google.android.material.tabs.TabLayout r1 = r3.parent
                r2 = 2
                int r2 = r2 / 0
                if (r1 == 0) goto L36
                goto L1a
            L16:
                com.google.android.material.tabs.TabLayout r1 = r3.parent
                if (r1 == 0) goto L36
            L1a:
                android.content.res.Resources r1 = r1.getResources()
                java.lang.CharSequence r4 = r1.getText(r4)
                com.google.android.material.tabs.TabLayout$Tab r4 = r3.setContentDescription(r4)
                int r1 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1
                int r1 = r1 + 73
                int r2 = r1 % 128
                com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L35
                r0 = 70
                int r0 = r0 / 0
            L35:
                return r4
            L36:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.Tab.setContentDescription(int):com.google.android.material.tabs.TabLayout$Tab");
        }

        public Tab setContentDescription(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                this.contentDesc = charSequence;
                updateView();
                return this;
            }
            this.contentDesc = charSequence;
            updateView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        
            r1 = r2.getContentDescription();
            r2 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 93;
            com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.CharSequence getContentDescription() {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1
                int r2 = r1 + 15
                int r3 = r2 % 128
                com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L17
                com.google.android.material.tabs.TabLayout$TabView r2 = r4.view
                r3 = 99
                int r3 = r3 / 0
                if (r2 != 0) goto L24
                goto L1b
            L17:
                com.google.android.material.tabs.TabLayout$TabView r2 = r4.view
                if (r2 != 0) goto L24
            L1b:
                int r1 = r1 + 93
                int r2 = r1 % 128
                com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
                int r1 = r1 % r0
                r0 = 0
                return r0
            L24:
                java.lang.CharSequence r1 = r2.getContentDescription()
                int r2 = com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r2 = r2 + 111
                int r3 = r2 % 128
                com.google.android.material.tabs.TabLayout.Tab.TuitionPaymentFragmentbindingInflater1 = r3
                int r2 = r2 % r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.Tab.getContentDescription():java.lang.CharSequence");
        }

        void updateView() {
            int i = 2 % 2;
            TabView tabView = this.view;
            if (tabView != null) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                tabView.update();
                if (i3 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }

        void reset() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.f810id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
            int i5 = i2 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
        }

        private static String $$e(int i, short s, int i2) {
            byte[] bArr = $$c;
            int i3 = s * 2;
            int i4 = 4 - (i2 * 4);
            int i5 = 122 - (i * 56);
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i4++;
                i5 = i6 + i4;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i5;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                int i8 = bArr[i4];
                i4++;
                i5 += i8;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        f809a = i2 % 128;
        if (i2 % 2 == 0) {
            return generateLayoutParams(attributeSet);
        }
        generateLayoutParams(attributeSet);
        throw null;
    }

    static /* synthetic */ int access$1100(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = f809a + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = tabLayout.defaultTabTextAppearance;
        int i6 = i3 + 107;
        f809a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ int access$1200(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tabLayout.selectedTabTextAppearance;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int access$1300(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tabLayout.tabTextAppearance;
        if (i3 != 0) {
            int i5 = 38 / 0;
        }
        return i4;
    }

    static /* synthetic */ int access$1600(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tabLayout.viewPagerScrollState;
        if (i3 != 0) {
            int i5 = 54 / 0;
        }
        return i4;
    }

    static /* synthetic */ TabIndicatorInterpolator access$1700(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = f809a + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        TabIndicatorInterpolator tabIndicatorInterpolator = tabLayout.tabIndicatorInterpolator;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        f809a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return tabIndicatorInterpolator;
    }

    static /* synthetic */ TimeInterpolator access$1900(TabLayout tabLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        f809a = i3;
        int i4 = i2 % 2;
        TimeInterpolator timeInterpolator = tabLayout.tabIndicatorTimeInterpolator;
        int i5 = i3 + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return timeInterpolator;
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
        tabPool = new Pools.SynchronizedPool(16);
        int i = d + 83;
        g = i % 128;
        int i2 = i % 2;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 2315 - AndroidCharacter.getMirror('0'), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr = b;
                if (bArr != null) {
                    int i8 = $10 + 41;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int jumpTapTimeout = 3358 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 18;
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, jumpTapTimeout, iMakeMeasureSpec, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $10 + 43;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2267 - (ViewConfiguration.getTouchSlop() >> 8), 33 - (ViewConfiguration.getLongPressTimeout() >> 16), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i13 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j));
                if (z) {
                    int i14 = $11 + 115;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 55904);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 2855;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 14;
                    byte b8 = (byte) ($$f & 1);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, deadChar, bitsPerPixel, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i16 = 0; i16 < length3; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = b;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i19 = $11 + 73;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.indicatorPosition = -1;
        this.tabs = new ArrayList<>();
        this.selectedTabTextAppearance = -1;
        this.tabSelectedIndicatorColor = 0;
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.tabIndicatorHeight = -1;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.slidingTabIndicator = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.TabLayout, i, i2, R.styleable.TabLayout_tabTextAppearance);
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        slidingTabIndicator.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, this.tabPaddingStart);
        this.tabPaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        if (ThemeEnforcement.isMaterial3Theme(context2)) {
            this.defaultTabTextAppearance = R.attr.textAppearanceTitleSmall;
            int i3 = 2 % 2;
        } else {
            this.defaultTabTextAppearance = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.tabTextAppearance = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, androidx.appcompat.R.styleable.TextAppearance);
        try {
            this.tabTextSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.tabTextColors = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TabLayout_tabSelectedTextAppearance)) {
                this.selectedTabTextAppearance = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabSelectedTextAppearance, resourceId);
                int i4 = 2 % 2;
            }
            int i5 = this.selectedTabTextAppearance;
            if (i5 != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(i5, androidx.appcompat.R.styleable.TextAppearance);
                try {
                    this.selectedTabTextSize = typedArrayObtainStyledAttributes3.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, (int) this.tabTextSize);
                    ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes3, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
                    if (colorStateList != null) {
                        this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes3.recycle();
                    throw th;
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TabLayout_tabTextColor)) {
                int i6 = asInterface + 19;
                f809a = i6 % 128;
                int i7 = i6 % 2;
                this.tabTextColors = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabTextColor);
                int i8 = asInterface + 109;
                f809a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            if (!(!typedArrayObtainStyledAttributes.hasValue(R.styleable.TabLayout_tabSelectedTextColor))) {
                int i11 = f809a + 117;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.tabIconTint = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIconTint);
            this.tabIconTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.tabRippleColorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.tabIndicatorTimeInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.requestedTabMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.requestedTabMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.tabBackgroundResId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.contentInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.mode = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.tabGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.inlineLabel = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.unboundedRipple = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 29;
        f809a = i3 % 128;
        if (i3 % 2 != 0) {
            this.tabSelectedIndicatorColor = i;
            DrawableUtils.setTint(this.tabSelectedIndicator, i);
        } else {
            this.tabSelectedIndicatorColor = i;
            DrawableUtils.setTint(this.tabSelectedIndicator, i);
        }
        updateTabViews(false);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        f809a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.tabIndicatorHeight = i;
            this.slidingTabIndicator.setSelectedIndicatorHeight(i);
            throw null;
        }
        this.tabIndicatorHeight = i;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
        int i4 = f809a + 67;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setScrollPosition(int i, float f, boolean z) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f809a + 45;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            setScrollPosition(i, f, z, z2, false);
        } else {
            setScrollPosition(i, f, z, z2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    void setScrollPosition(int i, float f, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 2 % 2;
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            int i3 = f809a + 25;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                this.slidingTabIndicator.getChildCount();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iRound < this.slidingTabIndicator.getChildCount()) {
                if (z2) {
                    this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
                }
                ValueAnimator valueAnimator = this.scrollAnimator;
                if (valueAnimator != null && !(!valueAnimator.isRunning())) {
                    this.scrollAnimator.cancel();
                }
                int iCalculateScrollXForTab = calculateScrollXForTab(i, f);
                int scrollX = getScrollX();
                if (i < getSelectedTabPosition()) {
                    int i4 = asInterface + 85;
                    f809a = i4 % 128;
                    int i5 = i4 % 2;
                    if (iCalculateScrollXForTab >= scrollX) {
                        z4 = true;
                    } else if (i > getSelectedTabPosition()) {
                        int i6 = f809a + 25;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        if (iCalculateScrollXForTab > scrollX) {
                            z4 = true;
                        } else if (i == getSelectedTabPosition()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else if (i == getSelectedTabPosition()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (i > getSelectedTabPosition()) {
                    int i8 = f809a + 25;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    if (iCalculateScrollXForTab > scrollX) {
                        z4 = true;
                    } else if (i == getSelectedTabPosition()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (i == getSelectedTabPosition()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ViewCompat.getLayoutDirection(this) != 1) {
                    if (!z4) {
                        if (this.viewPagerScrollState != 1) {
                            int i10 = f809a + 69;
                            asInterface = i10 % 128;
                            int i11 = i10 % 2;
                            if (z3) {
                            }
                        }
                    }
                    if (z) {
                        setSelectedTabView(iRound);
                    }
                }
                int i12 = asInterface + 109;
                f809a = i12 % 128;
                int i13 = i12 % 2;
                if (i < getSelectedTabPosition()) {
                    int i14 = f809a + 119;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    if (iCalculateScrollXForTab > scrollX) {
                        if (i > getSelectedTabPosition()) {
                            if (i == getSelectedTabPosition()) {
                                if (this.viewPagerScrollState != 1) {
                                    int i16 = f809a + 69;
                                    asInterface = i16 % 128;
                                    int i17 = i16 % 2;
                                    if (z3) {
                                    }
                                }
                            }
                            if (z) {
                                setSelectedTabView(iRound);
                            }
                        }
                        int i18 = f809a + 33;
                        asInterface = i18 % 128;
                        int i19 = i18 % 2;
                        if (iCalculateScrollXForTab < scrollX) {
                            if (i == getSelectedTabPosition()) {
                                if (this.viewPagerScrollState != 1) {
                                    int i110 = f809a + 69;
                                    asInterface = i110 % 128;
                                    int i111 = i110 % 2;
                                    if (z3) {
                                    }
                                }
                            }
                            if (z) {
                                setSelectedTabView(iRound);
                            }
                        }
                    }
                } else {
                    if (i > getSelectedTabPosition()) {
                        if (i == getSelectedTabPosition()) {
                            if (this.viewPagerScrollState != 1) {
                                int i112 = f809a + 69;
                                asInterface = i112 % 128;
                                int i113 = i112 % 2;
                                if (z3) {
                                }
                            }
                        }
                        if (z) {
                            setSelectedTabView(iRound);
                        }
                    }
                    int i114 = f809a + 33;
                    asInterface = i114 % 128;
                    int i115 = i114 % 2;
                    if (iCalculateScrollXForTab < scrollX) {
                        if (i == getSelectedTabPosition()) {
                            if (this.viewPagerScrollState != 1) {
                                int i116 = f809a + 69;
                                asInterface = i116 % 128;
                                int i117 = i116 % 2;
                                if (z3) {
                                }
                            }
                        }
                        if (z) {
                            setSelectedTabView(iRound);
                        }
                    }
                }
                if (i < 0) {
                    iCalculateScrollXForTab = 0;
                }
                scrollTo(iCalculateScrollXForTab, 0);
                int i20 = asInterface + 25;
                f809a = i20 % 128;
                int i21 = i20 % 2;
                if (z) {
                    setSelectedTabView(iRound);
                }
            }
        }
    }

    public void addTab(Tab tab) throws Throwable {
        int i = 2 % 2;
        int i2 = f809a + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        addTab(tab, this.tabs.isEmpty());
        int i4 = asInterface + 97;
        f809a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void addTab(Tab tab, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f809a + 23;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        addTab(tab, i, this.tabs.isEmpty());
        int i5 = f809a + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public void addTab(Tab tab, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        int size = this.tabs.size();
        if (i3 == 0) {
            addTab(tab, size, z);
        } else {
            addTab(tab, size, z);
            throw null;
        }
    }

    public void addTab(Tab tab, int i, boolean z) throws Throwable {
        int i2 = 2 % 2;
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        int i3 = f809a + 89;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            configureTab(tab, i);
            addTabView(tab);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        configureTab(tab, i);
        addTabView(tab);
        if (z) {
            tab.select();
            int i4 = f809a + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void addTabFromItemView(TabItem tabItem) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        Tab tabNewTab = newTab();
        if (tabItem.text != null) {
            int i4 = f809a + 27;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                tabNewTab.setText(tabItem.text);
                int i5 = 37 / 0;
            } else {
                tabNewTab.setText(tabItem.text);
            }
        }
        if (tabItem.icon != null) {
            int i6 = f809a + 69;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            tabNewTab.setIcon(tabItem.icon);
            int i8 = asInterface + 109;
            f809a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (tabItem.customLayout != 0) {
            int i10 = f809a + 103;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                tabNewTab.setCustomView(tabItem.customLayout);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            tabNewTab.setCustomView(tabItem.customLayout);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    private boolean isScrollingEnabled() {
        int i = 2 % 2;
        int i2 = f809a + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (getTabMode() == 0 || getTabMode() == 2) {
            return true;
        }
        int i4 = asInterface + 121;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        if (!isScrollingEnabled() || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        int i2 = f809a + 117;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        f809a = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        if (motionEvent.getActionMasked() == 8) {
            int i2 = asInterface + 85;
            f809a = i2 % 128;
            int i3 = i2 % 2;
            if (!isScrollingEnabled()) {
                int i4 = asInterface + 57;
                f809a = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int i6 = f809a + 123;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return zOnTouchEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
        if (i3 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        int i = 2 % 2;
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        if (baseOnTabSelectedListener2 != null) {
            int i2 = f809a + 77;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                removeOnTabSelectedListener(baseOnTabSelectedListener2);
                throw null;
            }
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            int i3 = f809a + 107;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            addOnTabSelectedListener(baseOnTabSelectedListener);
            if (i4 == 0) {
                int i5 = 70 / 0;
            }
        }
    }

    public void addOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        int i = 2 % 2;
        int i2 = f809a + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void addOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        if (!this.selectedListeners.contains(baseOnTabSelectedListener)) {
            int i4 = asInterface + 123;
            f809a = i4 % 128;
            int i5 = i4 % 2;
            this.selectedListeners.add(baseOnTabSelectedListener);
        }
        int i6 = asInterface + 35;
        f809a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
    }

    public void removeOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        int i = 2 % 2;
        int i2 = f809a + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    @Deprecated
    public void removeOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        int i = 2 % 2;
        int i2 = f809a + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.selectedListeners.remove(baseOnTabSelectedListener);
        int i4 = asInterface + 121;
        f809a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public void clearOnTabSelectedListeners() {
        int i = 2 % 2;
        int i2 = f809a + 91;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.selectedListeners.clear();
            throw null;
        }
        this.selectedListeners.clear();
        int i3 = asInterface + 21;
        f809a = i3 % 128;
        int i4 = i3 % 2;
    }

    public Tab newTab() {
        int i = 2 % 2;
        Tab tabCreateTabFromPool = createTabFromPool();
        tabCreateTabFromPool.parent = this;
        tabCreateTabFromPool.view = createTabView(tabCreateTabFromPool);
        if (Tab.access$000(tabCreateTabFromPool) != -1) {
            int i2 = asInterface + 59;
            f809a = i2 % 128;
            int i3 = i2 % 2;
            tabCreateTabFromPool.view.setId(Tab.access$000(tabCreateTabFromPool));
        }
        int i4 = asInterface + 91;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        return tabCreateTabFromPool;
    }

    protected Tab createTabFromPool() {
        int i = 2 % 2;
        int i2 = f809a + 21;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tabPool.acquire();
            obj.hashCode();
            throw null;
        }
        Tab tabAcquire = tabPool.acquire();
        if (tabAcquire == null) {
            tabAcquire = new Tab();
        }
        int i3 = f809a + 53;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return tabAcquire;
        }
        obj.hashCode();
        throw null;
    }

    protected boolean releaseFromTabPool(Tab tab) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        boolean zRelease = tabPool.release(tab);
        int i4 = f809a + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return zRelease;
    }

    public int getTabCount() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        f809a = i2 % 128;
        if (i2 % 2 != 0) {
            this.tabs.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.tabs.size();
        int i3 = f809a + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    public Tab getTabAt(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        f809a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        Tab tab = this.tabs.get(i);
        int i4 = asInterface + 103;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        return tab;
    }

    public int getSelectedTabPosition() {
        int i = 2 % 2;
        int i2 = f809a + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        int i5 = i3 + 119;
        f809a = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    public void removeTab(Tab tab) throws Throwable {
        int i = 2 % 2;
        int i2 = f809a + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            TabLayout tabLayout = tab.parent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
        int i3 = asInterface + 57;
        f809a = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    public void removeTabAt(int i) throws Throwable {
        Tab tab;
        int i2 = 2 % 2;
        int i3 = f809a + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Tab tab2 = this.selectedTab;
        int position = tab2 != null ? tab2.getPosition() : 0;
        removeTabViewAt(i);
        Tab tabRemove = this.tabs.remove(i);
        if (tabRemove != null) {
            tabRemove.reset();
            releaseFromTabPool(tabRemove);
        }
        int size = this.tabs.size();
        int i5 = -1;
        for (int i6 = i; i6 < size; i6++) {
            int i7 = asInterface + 27;
            f809a = i7 % 128;
            int i8 = i7 % 2;
            if (this.tabs.get(i6).getPosition() == this.indicatorPosition) {
                i5 = i6;
            }
            this.tabs.get(i6).setPosition(i6);
        }
        this.indicatorPosition = i5;
        if (position == i) {
            int i9 = f809a + 33;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 0;
                if (this.tabs.isEmpty()) {
                    tab = null;
                } else {
                    tab = this.tabs.get(Math.max(0, i - 1));
                    int i11 = asInterface + 45;
                    f809a = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else if (this.tabs.isEmpty()) {
                tab = null;
            } else {
                tab = this.tabs.get(Math.max(0, i - 1));
                int i13 = asInterface + 45;
                f809a = i13 % 128;
                int i14 = i13 % 2;
            }
            selectTab(tab);
        }
    }

    public void removeAllTabs() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            int i4 = f809a + 47;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                Tab next = it.next();
                it.remove();
                next.reset();
                releaseFromTabPool(next);
                int i5 = 4 / 0;
            } else {
                Tab next2 = it.next();
                it.remove();
                next2.reset();
                releaseFromTabPool(next2);
            }
        }
        this.selectedTab = null;
        int i6 = asInterface + 33;
        f809a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setTabMode(int i) {
        int i2 = 2 % 2;
        if (i != this.mode) {
            int i3 = f809a + 21;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.mode = i;
            applyModeAndGravity();
            int i5 = asInterface + 13;
            f809a = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public int getTabMode() {
        int i = 2 % 2;
        int i2 = f809a + 107;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTabGravity(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 9;
        f809a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.tabGravity != i) {
            int i5 = i3 + 51;
            f809a = i5 % 128;
            if (i5 % 2 == 0) {
                this.tabGravity = i;
                applyModeAndGravity();
            } else {
                this.tabGravity = i;
                applyModeAndGravity();
                throw null;
            }
        }
    }

    public int getTabGravity() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 109;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.tabGravity;
        int i6 = i2 + 77;
        f809a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        int i2 = 2 % 2;
        if (this.tabIndicatorGravity != i) {
            int i3 = f809a + 61;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                this.tabIndicatorGravity = i;
                ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
                throw null;
            }
            this.tabIndicatorGravity = i;
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
            int i4 = asInterface + 93;
            f809a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 5;
            }
        }
    }

    public int getTabIndicatorGravity() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        int i3 = i2 % 128;
        f809a = i3;
        int i4 = i2 % 2;
        int i5 = this.tabIndicatorGravity;
        int i6 = i3 + 15;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTabIndicatorAnimationMode(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 103;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        this.tabIndicatorAnimationMode = i;
        if (i == 0) {
            this.tabIndicatorInterpolator = new TabIndicatorInterpolator();
            int i6 = f809a + 3;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i != 1) {
            int i7 = i3 + 79;
            f809a = i7 % 128;
            if (i7 % 2 == 0 ? i == 2 : i == 5) {
                this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
        this.tabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
    }

    public int getTabIndicatorAnimationMode() {
        int i = 2 % 2;
        int i2 = f809a + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.tabIndicatorAnimationMode;
        if (i3 == 0) {
            int i5 = 72 / 0;
        }
        return i4;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        f809a = i2 % 128;
        if (i2 % 2 == 0) {
            this.tabIndicatorFullWidth = z;
            this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        } else {
            this.tabIndicatorFullWidth = z;
            this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
            int i3 = 88 / 0;
        }
    }

    public boolean isTabIndicatorFullWidth() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        f809a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tabIndicatorFullWidth;
        }
        throw null;
    }

    public void setInlineLabel(boolean z) {
        int i = 2 % 2;
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            int i2 = asInterface + 7;
            f809a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (i4 < this.slidingTabIndicator.getChildCount()) {
                View childAt = this.slidingTabIndicator.getChildAt(i4);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
                i4++;
                int i5 = asInterface + 37;
                f809a = i5 % 128;
                int i6 = i5 % 2;
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        setInlineLabel(getResources().getBoolean(i));
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isInlineLabel() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.inlineLabel;
        int i5 = i2 + 19;
        f809a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return z;
    }

    public void setUnboundedRipple(boolean z) {
        int i = 2 % 2;
        int i2 = f809a + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i4 = 0; i4 < this.slidingTabIndicator.getChildCount(); i4++) {
                View childAt = this.slidingTabIndicator.getChildAt(i4);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                    int i5 = asInterface + 85;
                    f809a = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        int i2 = 2 % 2;
        int i3 = f809a + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setUnboundedRipple(getResources().getBoolean(i));
        int i5 = f809a + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
    }

    public boolean hasUnboundedRipple() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        f809a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.unboundedRipple;
        int i4 = i3 + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f809a + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
            int i4 = f809a + 9;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public ColorStateList getTabTextColors() {
        int i = 2 % 2;
        int i2 = f809a + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ColorStateList colorStateList = this.tabTextColors;
        int i4 = i3 + 55;
        f809a = i4 % 128;
        if (i4 % 2 == 0) {
            return colorStateList;
        }
        throw null;
    }

    public void setTabTextColors(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 87;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        setTabTextColors(createColorStateList(i, i2));
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f809a;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.tabIconTint != colorStateList) {
            int i5 = i2 + 69;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 31;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
        if (i4 != 0) {
            throw null;
        }
    }

    public ColorStateList getTabIconTint() {
        int i = 2 % 2;
        int i2 = f809a;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.tabIconTint;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getTabRippleColor() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList colorStateList = this.tabRippleColorStateList;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return colorStateList;
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        int i3 = i2 % 128;
        f809a = i3;
        int i4 = i2 % 2;
        if (this.tabRippleColorStateList != colorStateList) {
            int i5 = i3 + 23;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                this.tabRippleColorStateList = colorStateList;
            } else {
                this.tabRippleColorStateList = colorStateList;
            }
            for (int i6 = 0; i6 < this.slidingTabIndicator.getChildCount(); i6++) {
                View childAt = this.slidingTabIndicator.getChildAt(i6);
                if (!(!(childAt instanceof TabView))) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                    int i7 = asInterface + 75;
                    f809a = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = f809a + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        int i5 = asInterface + 9;
        f809a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Drawable getTabSelectedIndicator() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawable = this.tabSelectedIndicator;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return drawable;
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        int i = 2 % 2;
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        this.tabSelectedIndicator = drawableMutate;
        DrawableUtils.setTint(drawableMutate, this.tabSelectedIndicatorColor);
        int intrinsicHeight = this.tabIndicatorHeight;
        Object obj = null;
        if (intrinsicHeight == -1) {
            int i2 = asInterface + 19;
            f809a = i2 % 128;
            if (i2 % 2 == 0) {
                intrinsicHeight = this.tabSelectedIndicator.getIntrinsicHeight();
            } else {
                this.tabSelectedIndicator.getIntrinsicHeight();
                throw null;
            }
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(intrinsicHeight);
        int i3 = asInterface + 11;
        f809a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setSelectedTabIndicator(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = asInterface + 105;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
            int i6 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[37], bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iResolveSizeAndState, i6, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1807981620, View.resolveSizeAndState(0, 0, 0) - 90, (short) (View.resolveSize(0, 0) + 82), (byte) Color.alpha(0), (-1986155248) - TextUtils.lastIndexOf("", '0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(1807981625 - View.getDefaultSize(0, 0), (-90) - (ViewConfiguration.getScrollBarSize() >> 8), (short) (13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1986155225) - Color.green(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) (31533 - View.MeasureSpec.getSize(0));
            int iBlue = Color.blue(0) + 921;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (b2 & 52), bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iBlue, windowTouchSlop, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                Object[] objArr6 = new Object[1];
                c((byte) 51, (byte) ($$b & 53), $$a[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, packedPositionChild, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i7 = ((((~(i | 1080555967)) * TypedValues.CycleType.TYPE_EASING) - 1594372693) + (((~(1080555967 | (~i))) | 4608156) * TypedValues.CycleType.TYPE_EASING)) - 596105182;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            e(1807981621 - (ViewConfiguration.getPressedStateDuration() >> 16), (-91) - ImageFormat.getBitsPerPixel(0), (short) (63 - Color.alpha(0)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-1986155209) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(View.MeasureSpec.getSize(0) + 1807981623, ImageFormat.getBitsPerPixel(0) - 89, (short) ((-16777328) - Color.rgb(0, 0, 0)), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1986155184) - (ViewConfiguration.getEdgeSlop() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = asInterface + 81;
                f809a = i10 % 128;
                int i11 = i10 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -596105182};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[18];
                byte b4 = bArr3[44];
                Object[] objArr11 = new Object[1];
                f(b3, b4, b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[44];
                byte b6 = bArr3[18];
                Object[] objArr12 = new Object[1];
                f(b5, b6, b6, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int keyRepeatDelay2 = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i12 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr13 = new Object[1];
                    c((byte) 51, (byte) ($$b & 53), $$a[80], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, keyRepeatDelay2, i12, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(Color.red(0) + 1807981621, (-90) - (Process.myPid() >> 22), (short) (82 - Drawable.resolveOpacity(0, 0)), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (Process.myPid() >> 22) - 1986155247, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e((ViewConfiguration.getTouchSlop() >> 8) + 1807981625, (-90) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (12 - KeyEvent.normalizeMetaState(0)), (byte) KeyEvent.keyCodeFromString(""), (-1986155226) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cBlue = (char) (31533 - Color.blue(0));
                        int iResolveSizeAndState2 = 921 - View.resolveSizeAndState(0, 0, 0);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[37];
                        Object[] objArr16 = new Object[1];
                        c(b7, (byte) (b7 & 52), bArr4[80], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, iResolveSizeAndState2, scrollDefaultDelay, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                        int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                        int iResolveSize = View.resolveSize(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr5[37], bArr5[80], bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iRgb, iResolveSize, -1048449946, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i5 < strArr.length) {
                    int i15 = f809a + 77;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(strArr[i5]);
                        i5 += 57;
                    } else {
                        arrayList.add(strArr[i5]);
                        i5++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = (~((-188055489) | iIdentityHashCode)) | 167792320;
        int i18 = i16 + (-1996094901) + (i17 * 992) + ((i17 | (~((~iIdentityHashCode) | 1606287323))) * (-496)) + ((iIdentityHashCode | 1586024155) * 496);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[0])[0] = i20 ^ (i20 << 5);
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        f809a = i2 % 128;
        setupWithViewPager(viewPager, i2 % 2 == 0);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = f809a + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setupWithViewPager(viewPager, z, false);
        int i4 = f809a + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[PHI: r3
  0x001f: PHI (r3v9 com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener) = 
  (r3v8 com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener)
  (r3v14 com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener)
 binds: [B:10:0x001d, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) throws Throwable {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        int i = 2 % 2;
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            int i2 = f809a + 113;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                tabLayoutOnPageChangeListener = this.pageChangeListener;
                int i3 = 83 / 0;
                if (tabLayoutOnPageChangeListener != null) {
                    viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
                }
            } else {
                tabLayoutOnPageChangeListener = this.pageChangeListener;
                if (tabLayoutOnPageChangeListener != null) {
                    viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
                }
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null) {
                int i4 = f809a + 23;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                this.viewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.currentVpSelectedListener;
        if (baseOnTabSelectedListener != null) {
            int i6 = f809a + 121;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                removeOnTabSelectedListener(baseOnTabSelectedListener);
                this.currentVpSelectedListener = null;
                int i7 = 19 / 0;
            } else {
                removeOnTabSelectedListener(baseOnTabSelectedListener);
                this.currentVpSelectedListener = null;
            }
            int i8 = asInterface + 77;
            f809a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (viewPager != null) {
            int i10 = f809a + 87;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            viewPager.addOnPageChangeListener(this.pageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                int i12 = f809a + 7;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    setPagerAdapter(adapter, z);
                    int i13 = 61 / 0;
                } else {
                    setPagerAdapter(adapter, z);
                }
                int i14 = asInterface + 115;
                f809a = i14 % 128;
                int i15 = i14 % 2;
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z);
            viewPager.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f809a = i2 % 128;
        setPagerAdapter(pagerAdapter, i2 % 2 != 0);
        int i3 = asInterface + 27;
        f809a = i3 % 128;
        int i4 = i3 % 2;
    }

    void updateViewPagerScrollState(int i) {
        int i2 = 2 % 2;
        int i3 = f809a;
        int i4 = i3 + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.viewPagerScrollState = i;
        int i6 = i3 + 75;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        f809a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
            if (getTabScrollRange() > 0) {
                return true;
            }
        } else if (getTabScrollRange() > 0) {
            return true;
        }
        int i4 = asInterface + 3;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                int i4 = asInterface + 99;
                f809a = i4 % 128;
                int i5 = i4 % 2;
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
        int i6 = asInterface + 29;
        f809a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws Throwable {
        int i = 2 % 2;
        super.onDetachedFromWindow();
        Object obj = null;
        if (this.setupViewPagerImplicitly) {
            int i2 = f809a + 115;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
        int i4 = f809a + 89;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private int getTabScrollRange() {
        int i = 2 % 2;
        int i2 = f809a + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int width = this.slidingTabIndicator.getWidth();
        int width2 = getWidth();
        int iMax = Math.max(0, ((width - width2) - getPaddingLeft()) - getPaddingRight());
        int i4 = asInterface + 67;
        f809a = i4 % 128;
        if (i4 % 2 == 0) {
            return iMax;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 androidx.viewpager.widget.PagerAdapter) = (r1v4 androidx.viewpager.widget.PagerAdapter), (r1v7 androidx.viewpager.widget.PagerAdapter) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) throws Throwable {
        PagerAdapter pagerAdapter2;
        DataSetObserver dataSetObserver;
        int i = 2 % 2;
        int i2 = asInterface + 63;
        f809a = i2 % 128;
        if (i2 % 2 != 0) {
            pagerAdapter2 = this.pagerAdapter;
            int i3 = 70 / 0;
            if (pagerAdapter2 != null) {
                dataSetObserver = this.pagerAdapterObserver;
                if (dataSetObserver != null) {
                    pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
                }
            }
        } else {
            pagerAdapter2 = this.pagerAdapter;
            if (pagerAdapter2 != null) {
                dataSetObserver = this.pagerAdapterObserver;
                if (dataSetObserver != null) {
                    pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
                }
            }
        }
        this.pagerAdapter = pagerAdapter;
        if (z) {
            int i4 = asInterface + 89;
            f809a = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (pagerAdapter != null) {
                if (this.pagerAdapterObserver == null) {
                    this.pagerAdapterObserver = new PagerAdapterObserver();
                }
                pagerAdapter.registerDataSetObserver(this.pagerAdapterObserver);
            }
        }
        populateFromPagerAdapter();
    }

    void populateFromPagerAdapter() throws Throwable {
        int currentItem;
        int i = 2 % 2;
        int i2 = f809a + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            int i4 = f809a + 101;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
            for (int i6 = 0; i6 < count; i6++) {
                addTab(newTab().setText(this.pagerAdapter.getPageTitle(i6)), false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager != null) {
                int i7 = f809a + 33;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                if (count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                    return;
                }
                int i8 = asInterface + 25;
                f809a = i8 % 128;
                int i9 = i8 % 2;
                selectTab(getTabAt(currentItem));
                if (i9 != 0) {
                    throw null;
                }
            }
        }
    }

    private void updateAllTabs() {
        int i = 2 % 2;
        int size = this.tabs.size();
        int i2 = f809a + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < size) {
            this.tabs.get(i4).updateView();
            i4++;
            int i5 = f809a + 33;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private TabView createTabView(Tab tab) {
        TabView tabView;
        int i = 2 % 2;
        Pools.Pool<TabView> pool = this.tabViewPool;
        if (pool != null) {
            int i2 = f809a + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            tabView = pool.acquire();
            int i4 = asInterface + 123;
            f809a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(Tab.access$300(tab))) {
            tabView.setContentDescription(Tab.access$400(tab));
            return tabView;
        }
        tabView.setContentDescription(Tab.access$300(tab));
        return tabView;
    }

    private void configureTab(Tab tab, int i) {
        int size;
        int i2;
        int i3 = 2 % 2;
        int i4 = f809a + 53;
        asInterface = i4 % 128;
        int i5 = -1;
        if (i4 % 2 == 0) {
            tab.setPosition(i);
            this.tabs.add(i, tab);
            size = this.tabs.size();
            i2 = i + 22;
        } else {
            tab.setPosition(i);
            this.tabs.add(i, tab);
            size = this.tabs.size();
            i2 = i + 1;
        }
        while (i2 < size) {
            int i6 = f809a + 11;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (this.tabs.get(i2).getPosition() == this.indicatorPosition) {
                int i8 = asInterface + 55;
                f809a = i8 % 128;
                if (i8 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i5 = i2;
            }
            this.tabs.get(i2).setPosition(i2);
            i2++;
            int i9 = f809a + 107;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
        this.indicatorPosition = i5;
    }

    private void addTabView(Tab tab) {
        TabView tabView;
        SlidingTabIndicator slidingTabIndicator;
        int i = 2 % 2;
        int i2 = f809a + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            tabView = tab.view;
            tabView.setSelected(false);
            tabView.setActivated(false);
            slidingTabIndicator = this.slidingTabIndicator;
        } else {
            tabView = tab.view;
            tabView.setSelected(false);
            tabView.setActivated(false);
            slidingTabIndicator = this.slidingTabIndicator;
        }
        slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = f809a + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        addViewInternal(view);
        int i4 = f809a + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f809a + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        addViewInternal(view);
        int i5 = asInterface + 7;
        f809a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        addViewInternal(view);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 39;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        addViewInternal(view);
        int i5 = asInterface + 61;
        f809a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void addViewInternal(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        int i5 = i2 + 81;
        f809a = i5 % 128;
        if (i5 % 2 == 0) {
            addTabFromItemView((TabItem) view);
        } else {
            addTabFromItemView((TabItem) view);
            throw null;
        }
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        int i = 2 % 2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        int i2 = asInterface + 43;
        f809a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return layoutParams;
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        int i3 = i2 % 128;
        f809a = i3;
        int i4 = i2 % 2;
        if (this.mode == 1) {
            int i5 = i3 + 39;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.tabGravity == 0) {
                ((ViewGroup.LayoutParams) layoutParams).width = 0;
                layoutParams.weight = 1.0f;
                return;
            }
        }
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        layoutParams.weight = 0.0f;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        int i2 = f809a + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
        int i4 = f809a + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
        int i4 = f809a + 55;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < this.slidingTabIndicator.getChildCount()) {
            int i3 = asInterface + 81;
            f809a = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = this.slidingTabIndicator.getChildAt(i2) instanceof TabView;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View childAt = this.slidingTabIndicator.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
            i2++;
            int i4 = asInterface + 43;
            f809a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int iRound = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            int i4 = f809a + 63;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 92 / 0;
                if (mode == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), BasicMeasure.EXACTLY);
                }
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), BasicMeasure.EXACTLY);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            int i6 = f809a + 9;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i8 = f809a + 75;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            int iDpToPx = this.requestedTabMaxWidth;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.tabMaxWidth = iDpToPx;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i9 = this.mode;
            if (i9 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i9 != 1) {
                int i10 = asInterface + 113;
                f809a = i10 % 128;
                int i11 = i10 % 2;
                if (i9 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    private void removeTabViewAt(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
        int i5 = asInterface + 103;
        f809a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    private void animateToTab(int i) {
        int i2;
        int scrollX;
        int iCalculateScrollXForTab;
        int i3;
        int i4 = 2 % 2;
        int i5 = asInterface + 89;
        f809a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            int i6 = f809a + 15;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 88 / 0;
                if (ViewCompat.isLaidOut(this)) {
                    if (!this.slidingTabIndicator.childrenNeedLayout()) {
                        i2 = f809a + 53;
                        asInterface = i2 % 128;
                        if (i2 % 2 == 0 ? (scrollX = getScrollX()) != (iCalculateScrollXForTab = calculateScrollXForTab(i, 0.0f)) : (scrollX = getScrollX()) != (iCalculateScrollXForTab = calculateScrollXForTab(i, 2.0f))) {
                            ensureScrollAnimator();
                            this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                            this.scrollAnimator.start();
                        }
                        this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
                        i3 = f809a + 25;
                        asInterface = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                }
            } else if (ViewCompat.isLaidOut(this)) {
                if (!this.slidingTabIndicator.childrenNeedLayout()) {
                    i2 = f809a + 53;
                    asInterface = i2 % 128;
                    if (i2 % 2 == 0) {
                        ensureScrollAnimator();
                        this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                        this.scrollAnimator.start();
                    } else {
                        ensureScrollAnimator();
                        this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                        this.scrollAnimator.start();
                    }
                    this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
                    i3 = f809a + 25;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void ensureScrollAnimator() {
        int i = 2 % 2;
        int i2 = f809a + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
            int i4 = asInterface + 23;
            f809a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = f809a + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
        int i4 = f809a + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094 A[SYNTHETIC] */
    private void setSelectedTabView(int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 5;
        f809a = i4 % 128;
        int i5 = i4 % 2;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = this.slidingTabIndicator.getChildAt(i6);
                Object obj = null;
                if (i6 != i || childAt.isSelected()) {
                    if (i6 != i) {
                        int i7 = f809a + 109;
                        asInterface = i7 % 128;
                        if (i7 % 2 == 0) {
                            childAt.isSelected();
                            obj.hashCode();
                            throw null;
                        }
                        if (childAt.isSelected()) {
                            if (i6 == i) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            childAt.setSelected(z2);
                            childAt.setActivated(i6 == i);
                            if (childAt instanceof TabView) {
                                i2 = f809a + 51;
                                asInterface = i2 % 128;
                                if (i2 % 2 != 0) {
                                    ((TabView) childAt).updateTab();
                                    throw null;
                                }
                                ((TabView) childAt).updateTab();
                            } else {
                                continue;
                            }
                        }
                    }
                    childAt.setSelected(!(i6 != i));
                    if (i6 == i) {
                        int i8 = asInterface + 79;
                        f809a = i8 % 128;
                        z = i8 % 2 == 0;
                    }
                    childAt.setActivated(z);
                    int i9 = f809a + 31;
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 / 3;
                    }
                } else {
                    if (i6 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    childAt.setActivated(i6 == i);
                    if (childAt instanceof TabView) {
                        i2 = f809a + 51;
                        asInterface = i2 % 128;
                        if (i2 % 2 != 0) {
                            ((TabView) childAt).updateTab();
                            throw null;
                        }
                        ((TabView) childAt).updateTab();
                    } else {
                        continue;
                    }
                }
                i6++;
            }
        }
    }

    public void selectTab(Tab tab) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        selectTab(tab, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    public void selectTab(Tab tab, boolean z) throws Throwable {
        int position;
        int i = 2 % 2;
        Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            int i2 = f809a + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
        } else {
            if (tab != null) {
                int i4 = f809a + 113;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                position = tab.getPosition();
            } else {
                position = -1;
            }
            if (z) {
                if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                    setScrollPosition(position, 0.0f, true);
                    int i6 = f809a + 41;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    animateToTab(position);
                }
                if (position != -1) {
                    setSelectedTabView(position);
                }
            }
            this.selectedTab = tab;
            if (tab2 != null) {
                int i8 = asInterface + 87;
                f809a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 28 / 0;
                    if (tab2.parent != null) {
                        dispatchTabUnselected(tab2);
                    }
                } else if (tab2.parent != null) {
                    dispatchTabUnselected(tab2);
                }
            }
            if (tab != null) {
                int i10 = f809a + 41;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                dispatchTabSelected(tab);
                if (i11 == 0) {
                    int i12 = 27 / 0;
                }
                int i13 = asInterface + 19;
                f809a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = asInterface + 101;
        f809a = i15 % 128;
        int i16 = i15 % 2;
    }

    private void dispatchTabSelected(Tab tab) {
        int i = 2 % 2;
        int size = this.selectedListeners.size() - 1;
        int i2 = asInterface + 111;
        while (true) {
            f809a = i2 % 128;
            int i3 = i2 % 2;
            if (size < 0) {
                int i4 = f809a + 41;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return;
            } else {
                this.selectedListeners.get(size).onTabSelected(tab);
                size--;
                i2 = asInterface + 89;
            }
        }
    }

    private void dispatchTabUnselected(Tab tab) {
        int i = 2 % 2;
        int i2 = f809a + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            int i4 = asInterface + 79;
            f809a = i4 % 128;
            int i5 = i4 % 2;
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void dispatchTabReselected(Tab tab) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        f809a = i2 % 128;
        int size = i2 % 2 != 0 ? this.selectedListeners.size() : this.selectedListeners.size() - 1;
        while (size >= 0) {
            this.selectedListeners.get(size).onTabReselected(tab);
            size--;
            int i3 = f809a + 57;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        int i2 = 2 % 2;
        int i3 = this.mode;
        int width = 0;
        if (i3 != 0 && i3 != 2) {
            int i4 = f809a + 5;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        View childAt2 = this.slidingTabIndicator.getChildAt(i);
        if (childAt2 == null) {
            int i6 = asInterface + 35;
            f809a = i6 % 128;
            int i7 = i6 % 2;
            return 0;
        }
        int i8 = i + 1;
        Object obj = null;
        if (i8 < this.slidingTabIndicator.getChildCount()) {
            int i9 = f809a + 73;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                childAt = this.slidingTabIndicator.getChildAt(i8);
                int i10 = 63 / 0;
            } else {
                childAt = this.slidingTabIndicator.getChildAt(i8);
            }
        } else {
            childAt = null;
        }
        int width2 = childAt2.getWidth();
        if (childAt != null) {
            int i11 = asInterface + 91;
            f809a = i11 % 128;
            int i12 = i11 % 2;
            width = childAt.getWidth();
        }
        int left = (childAt2.getLeft() + (width2 / 2)) - (getWidth() / 2);
        int i13 = (int) ((width2 + width) * 0.5f * f);
        if (ViewCompat.getLayoutDirection(this) != 0) {
            return left - i13;
        }
        int i14 = left + i13;
        int i15 = f809a + 93;
        asInterface = i15 % 128;
        if (i15 % 2 != 0) {
            return i14;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    private void applyModeAndGravity() {
        int iMax;
        int i = 2 % 2;
        int i2 = this.mode;
        if (i2 != 0) {
            int i3 = f809a + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 2) {
                iMax = 0;
            } else {
                iMax = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
            }
        } else {
            iMax = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        }
        ViewCompat.setPaddingRelative(this.slidingTabIndicator, iMax, 0, 0, 0);
        int i5 = this.mode;
        if (i5 != 0) {
            int i6 = asInterface + 75;
            f809a = i6 % 128;
            if (i6 % 2 == 0 ? i5 == 1 : i5 == 1) {
                this.slidingTabIndicator.setGravity(1);
            } else if (i5 == 2) {
                this.slidingTabIndicator.setGravity(1);
            }
        } else {
            applyGravityForModeScrollable(this.tabGravity);
            int i7 = f809a + 17;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        updateTabViews(true);
    }

    private void applyGravityForModeScrollable(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 79;
        int i4 = i3 % 128;
        f809a = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            int i6 = i4 + 27;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (i == 1) {
                this.slidingTabIndicator.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.slidingTabIndicator.setGravity(GravityCompat.START);
    }

    void updateTabViews(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < this.slidingTabIndicator.getChildCount(); i4++) {
            int i5 = asInterface + 99;
            f809a = i5 % 128;
            if (i5 % 2 != 0) {
                View childAt = this.slidingTabIndicator.getChildAt(i4);
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
                throw null;
            }
            View childAt2 = this.slidingTabIndicator.getChildAt(i4);
            childAt2.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt2.getLayoutParams());
            if (!(!z)) {
                childAt2.requestLayout();
            }
        }
    }

    public final class TabView extends LinearLayout {
        private View badgeAnchorView;
        private BadgeDrawable badgeDrawable;
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateBackgroundDrawable(Context context) {
            GradientDrawable gradientDrawable;
            if (TabLayout.this.tabBackgroundResId != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, TabLayout.this.tabBackgroundResId);
                this.baseBackgroundDrawable = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                if (TabLayout.this.unboundedRipple) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                gradientDrawable = gradientDrawable2;
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, TabLayout.this.unboundedRipple ? null : gradientDrawable3);
            }
            ViewCompat.setBackground(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null && drawable.isStateful() && this.baseBackgroundDrawable.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean performClick() throws Throwable {
            boolean zPerformClick = super.performClick();
            if (this.tab == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.tab.select();
            return true;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfoCompatWrap.setContentDescription(this.badgeDrawable.getContentDescription());
            }
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.tab.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfoCompatWrap.setClickable(false);
                accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.textView);
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.mode != 1 || f <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        final void setTab(Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        final void reset() {
            setTab(null);
            setSelected(false);
        }

        final void updateTab() {
            ViewParent parent;
            Tab tab = this.tab;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view = this.customView;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(customView);
                }
                this.customView = customView;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.customIconView = (ImageView) customView.findViewById(android.R.id.icon);
            } else {
                View view2 = this.customView;
                if (view2 != null) {
                    removeView(view2);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = TextViewCompat.getMaxLines(this.textView);
                }
                TextViewCompat.setTextAppearance(this.textView, TabLayout.access$1100(TabLayout.this));
                if (isSelected() && TabLayout.access$1200(TabLayout.this) != -1) {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.access$1200(TabLayout.this));
                } else {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.access$1300(TabLayout.this));
                }
                if (TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(TabLayout.this.tabTextColors);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(Tab.access$300(tab))) {
                return;
            }
            setContentDescription(Tab.access$300(tab));
        }

        final void update() {
            updateTab();
            Tab tab = this.tab;
            setSelected(tab != null && tab.isSelected());
        }

        private void inflateAndAddDefaultIconView() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot, 0);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, viewGroup, false);
            this.iconView = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void inflateAndAddDefaultTextView() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, viewGroup, false);
            this.textView = textView;
            viewGroup.addView(textView);
        }

        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void addOnLayoutChangeListener(final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private void tryUpdateBadgeAnchor() {
            Tab tab;
            Tab tab2;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                    View view = this.badgeAnchorView;
                    ImageView imageView = this.iconView;
                    if (view != imageView) {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.iconView);
                        return;
                    } else {
                        tryUpdateBadgeDrawableBounds(imageView);
                        return;
                    }
                }
                if (this.textView != null && (tab = this.tab) != null && tab.getTabLabelVisibility() == 1) {
                    View view2 = this.badgeAnchorView;
                    TextView textView = this.textView;
                    if (view2 != textView) {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.textView);
                        return;
                    } else {
                        tryUpdateBadgeDrawableBounds(textView);
                        return;
                    }
                }
                tryRemoveBadgeFromAnchor();
            }
        }

        private void tryAttachBadgeToAnchor(View view) {
            if (!hasBadgeDrawable() || view == null) {
                return;
            }
            clipViewToPaddingForBadge(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
            this.badgeAnchorView = view;
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable()) {
                clipViewToPaddingForBadge(true);
                View view = this.badgeAnchorView;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
                    this.badgeAnchorView = null;
                }
            }
        }

        private void clipViewToPaddingForBadge(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView != null || this.customIconView != null) {
                updateTextAndIcon(textView, this.customIconView, false);
            } else {
                updateTextAndIcon(this.textView, this.iconView, true);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0063  */
        private void updateTextAndIcon(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Tab tab = this.tab;
            Drawable drawableMutate = (tab == null || tab.getIcon() == null) ? null : DrawableCompat.wrap(this.tab.getIcon()).mutate();
            if (drawableMutate != null) {
                DrawableCompat.setTintList(drawableMutate, TabLayout.this.tabIconTint);
                if (TabLayout.this.tabIconTintMode != null) {
                    DrawableCompat.setTintMode(drawableMutate, TabLayout.this.tabIconTintMode);
                }
            }
            Tab tab2 = this.tab;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(text);
            if (textView != null) {
                if (!zIsEmpty) {
                    z2 = Tab.access$1500(this.tab) == 1;
                }
                textView.setText(!zIsEmpty ? text : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (z2 && imageView.getVisibility() == 0) ? (int) ViewUtils.dpToPx(getContext(), 8) : 0;
                if (TabLayout.this.inlineLabel) {
                    if (iDpToPx != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            CharSequence charSequenceAccess$300 = tab3 != null ? Tab.access$300(tab3) : null;
            if (zIsEmpty) {
                text = charSequenceAccess$300;
            }
            TooltipCompat.setTooltipText(this, text);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        private FrameLayout getCustomParentForBadge(View view) {
            if ((view == this.iconView || view == this.textView) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        final int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        final int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public final Tab getTab() {
            return this.tab;
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        void setSelectedIndicatorHeight(int i) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        void setIndicatorPositionFromTabPosition(int i, float f) {
            TabLayout.this.indicatorPosition = Math.round(i + f);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i), getChildAt(i + 1), f);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                if (TabLayout.this.tabGravity == 1 || TabLayout.this.mode == 2) {
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt.getVisibility() == 0) {
                            iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
                    }
                    if (iMax > 0) {
                        if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                            boolean z = false;
                            for (int i4 = 0; i4 < childCount; i4++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                if (((ViewGroup.LayoutParams) layoutParams).width != iMax || layoutParams.weight != 0.0f) {
                                    ((ViewGroup.LayoutParams) layoutParams).width = iMax;
                                    layoutParams.weight = 0.0f;
                                    z = true;
                                }
                            }
                            if (!z) {
                                return;
                            }
                        } else {
                            TabLayout.this.tabGravity = 0;
                            TabLayout.this.updateTabViews(false);
                        }
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                jumpIndicatorToIndicatorPosition();
            }
        }

        private void jumpIndicatorToPosition(int i) {
            if (TabLayout.access$1600(TabLayout.this) == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                TabIndicatorInterpolator tabIndicatorInterpolatorAccess$1700 = TabLayout.access$1700(TabLayout.this);
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolatorAccess$1700.setIndicatorBoundsForTab(tabLayout, childAt, tabLayout.tabSelectedIndicator);
                TabLayout.this.indicatorPosition = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        private void jumpIndicatorToIndicatorPosition() {
            if (TabLayout.this.indicatorPosition == -1) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabIndicatorInterpolator tabIndicatorInterpolatorAccess$1700 = TabLayout.access$1700(TabLayout.this);
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolatorAccess$1700.updateIndicatorForOffset(tabLayout, view, view2, f, tabLayout.tabSelectedIndicator);
            } else {
                TabLayout.this.tabSelectedIndicator.setBounds(-1, TabLayout.this.tabSelectedIndicator.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        void animateIndicatorToPosition(int i, int i2) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i, i2);
        }

        private void updateOrRecreateIndicatorAnimation(boolean z, int i, int i2) {
            if (TabLayout.this.indicatorPosition == i) {
                return;
            }
            final View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.indicatorAnimator = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.access$1900(TabLayout.this));
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.start();
                return;
            }
            this.indicatorAnimator.removeAllUpdateListeners();
            this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i = TabLayout.this.tabIndicatorGravity;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        int i3 = 2 % 2;
        ColorStateList colorStateList = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
        int i4 = asInterface + 33;
        f809a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return colorStateList;
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            ViewPortBuilder.asInterface();
            try {
                TabLayout tabLayout = this.tabLayoutRef.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i2 = this.scrollState;
                    tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
                }
            } finally {
                ViewPortBuilder.d();
            }
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    private int getDefaultHeight() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 1;
        f809a = i3 % 128;
        int i4 = i3 % 2;
        int size = this.tabs.size();
        for (int i5 = 0; i5 < size; i5++) {
            Tab tab = this.tabs.get(i5);
            if (tab != null) {
                int i6 = f809a + 55;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 1 / 0;
                    if (tab.getIcon() != null) {
                        int i8 = f809a + 15;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        if (!TextUtils.isEmpty(tab.getText())) {
                            int i10 = f809a + 61;
                            i = i10 % 128;
                            asInterface = i;
                            int i11 = i10 % 2;
                            if (!this.inlineLabel) {
                                return 48;
                            }
                            int i12 = i + 21;
                            f809a = i12 % 128;
                            int i13 = i12 % 2;
                            return 72;
                        }
                    } else {
                        continue;
                    }
                } else if (tab.getIcon() != null) {
                    int i14 = f809a + 15;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    if (!TextUtils.isEmpty(tab.getText())) {
                        int i16 = f809a + 61;
                        i = i16 % 128;
                        asInterface = i;
                        int i17 = i16 % 2;
                        if (!this.inlineLabel) {
                            return 48;
                        }
                        int i18 = i + 21;
                        f809a = i18 % 128;
                        int i19 = i18 % 2;
                        return 72;
                    }
                } else {
                    continue;
                }
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = 2 % 2;
        int i2 = this.requestedTabMinWidth;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.mode;
        if (i3 != 0) {
            int i4 = f809a + 115;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                if (i3 != 4) {
                    return 0;
                }
            } else if (i3 != 2) {
                return 0;
            }
        }
        int i5 = this.scrollableTabMinWidth;
        int i6 = asInterface + 25;
        f809a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        f809a = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        int i4 = f809a + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    int getTabMaxWidth() {
        int i = 2 % 2;
        int i2 = f809a + 3;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.tabMaxWidth;
        int i6 = i3 + 23;
        f809a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -87093751;
        TuitionPaymentFragmentbindingInflater1 = -1934795585;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 412170442;
        b = new byte[]{91, 80, 68, 87, 49, 98, 80, 121, 73, 78, 50, 53, -113, 84, 9, -98, 79, 78, 77, 90, 66, 93, 80, 10, 30, 15, 26, 25, 22, -31, 4, 21, 0, 17, -27, 15, 29, 39, 34, 91, 82, 45, 51, 122, 32, 42, 82, 40, 80, 52, 5, 50, -103, 39, 54, 18, 109, 90, 93, 88, 41, 81, 40, 95, -119, -112, -125, 101, -120, -116, -117, -118, -106, 121, -37, -112, -97, -123, -106, -117, 100};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = com.google.android.material.tabs.TabLayout.$$c
            int r6 = r6 + 117
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.$$g(short, byte, byte):java.lang.String");
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }
    }

    class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Throwable {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Throwable {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;

        AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) throws Throwable {
            if (TabLayout.this.viewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.autoRefresh);
            }
        }

        void setAutoRefresh(boolean z) {
            this.autoRefresh = z;
        }
    }
}
