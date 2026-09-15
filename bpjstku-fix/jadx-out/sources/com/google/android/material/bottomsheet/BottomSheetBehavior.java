package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.view.BackEventCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    private static int b;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    ViewDragHelper viewDragHelper;
    WeakReference<V> viewRef;
    private static final byte[] $$c = {91, -9, 99, 11};
    private static final int $$f = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {108, -26, -110, 50, -10, 19, -45, 34, 16, -4, 17, -13, -23, 31, 6, 21, -1, 7, 11, -37, 38, 1, 11, -9, -1, 5, 17, -74, 66, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -61, 37, -7, 5, -61, 21, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, 67, -8, 23, -11, 17, -5, -4, 15, -58, 57, 16, 1, 7, 7, -64, 75, 3, -7, 7, 1, 15, -7, 0, 18, -65, 35, 24, 23, -11, 17, -5, -4, 15, -36, 57, -7, -9, 16, 0, -2, -28, 48, 1, 7, 7, 5, -75, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -44, 9, -1, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
    private static final int $$e = 177;
    private static final byte[] $$a = {107, 48, 57, 107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 14;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f798a = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    public static abstract class BottomSheetCallback {
        void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.$$a
            int r8 = 53 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void e(short s, int i, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 115 - i;
        int i3 = s + 4;
        byte[] bArr2 = new byte[s2 + 6];
        int i4 = s2 + 5;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (i4 + i3) - 4;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            int i8 = i3 + 1;
            i5 = i6;
            i2 = (i7 + bArr[i3]) - 4;
            i3 = i8;
        }
    }

    static /* synthetic */ void access$100(BottomSheetBehavior bottomSheetBehavior, View view, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = g + 91;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        bottomSheetBehavior.startSettling(view, i, z);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$1000(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 115;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = bottomSheetBehavior.marginTopSystemWindowInsets;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 61;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ int access$1102(BottomSheetBehavior bottomSheetBehavior, int i) {
        int i2 = 2 % 2;
        int i3 = f798a + 45;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        bottomSheetBehavior.gestureInsetBottom = i;
        int i6 = i4 + 5;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    static /* synthetic */ void access$1200(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        int i = 2 % 2;
        int i2 = f798a + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        bottomSheetBehavior.updatePeekHeight(z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = g + 77;
        f798a = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ boolean access$1300(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a + 117;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = bottomSheetBehavior.draggable;
        int i5 = i3 + 83;
        f798a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ boolean access$1400(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g + 51;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        boolean z = bottomSheetBehavior.fitToContents;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return z;
    }

    static /* synthetic */ int access$1500(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g + 23;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        int i5 = bottomSheetBehavior.significantVelocityThreshold;
        int i6 = i3 + 111;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return i5;
    }

    static /* synthetic */ boolean access$1600(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a + 15;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return bottomSheetBehavior.canBeHiddenByDragging();
        }
        bottomSheetBehavior.canBeHiddenByDragging();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int access$1900(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g + 111;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        int i5 = bottomSheetBehavior.peekHeight;
        if (i4 != 0) {
            int i6 = 43 / 0;
        }
        int i7 = i3 + 45;
        g = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ MaterialShapeDrawable access$200(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g + 63;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        MaterialShapeDrawable materialShapeDrawable = bottomSheetBehavior.materialShapeDrawable;
        int i5 = i3 + 65;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return materialShapeDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$2000(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 109;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = bottomSheetBehavior.skipCollapsed;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 41;
        g = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ int access$302(BottomSheetBehavior bottomSheetBehavior, int i) {
        int i2 = 2 % 2;
        int i3 = f798a;
        int i4 = i3 + 81;
        g = i4 % 128;
        int i5 = i4 % 2;
        bottomSheetBehavior.insetTop = i;
        int i6 = i3 + 19;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    static /* synthetic */ boolean access$400(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a + 41;
        g = i2 % 128;
        int i3 = i2 % 2;
        boolean z = bottomSheetBehavior.paddingBottomSystemWindowInsets;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return z;
    }

    static /* synthetic */ int access$500(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 63;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = bottomSheetBehavior.insetBottom;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 75;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ int access$502(BottomSheetBehavior bottomSheetBehavior, int i) {
        int i2 = 2 % 2;
        int i3 = g + 19;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        bottomSheetBehavior.insetBottom = i;
        if (i4 == 0) {
            return i;
        }
        throw null;
    }

    static /* synthetic */ boolean access$600(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a + 79;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = bottomSheetBehavior.paddingLeftSystemWindowInsets;
        int i5 = i3 + 49;
        f798a = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$700(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a + 93;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = bottomSheetBehavior.paddingRightSystemWindowInsets;
        int i5 = i3 + 61;
        f798a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ boolean access$800(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = g + 111;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        boolean z = bottomSheetBehavior.marginLeftSystemWindowInsets;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ boolean access$900(BottomSheetBehavior bottomSheetBehavior) {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 109;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = bottomSheetBehavior.marginRightSystemWindowInsets;
        int i5 = i2 + 33;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 8328), View.combineMeasuredStates(0, 0) + 1235, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, -653973969, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2763 - TextUtils.lastIndexOf("", '0', 0), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Gravity.getAbsoluteGravity(0, 0)), 253 - Color.red(0), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 65201);
                    int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2890;
                    int mode = 17 - View.MeasureSpec.getMode(0);
                    byte b6 = (byte) ($$f & 3);
                    byte b7 = (byte) (-b6);
                    String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i7, mode, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i3 = i2;
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
        int i = TuitionPaymentFragmentbindingInflater1 + 65;
        b = i % 128;
        int i2 = i % 2;
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                if (BottomSheetBehavior.this.state == 1 || BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (BottomSheetBehavior.this.state == 3 && BottomSheetBehavior.this.activePointerId == i) {
                    View view2 = BottomSheetBehavior.this.nestedScrollingChildRef != null ? BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                return BottomSheetBehavior.this.viewRef != null && BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.access$1300(BottomSheetBehavior.this)) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(View view) {
                return view.getTop() > (BottomSheetBehavior.this.parentHeight + BottomSheetBehavior.this.getExpandedOffset()) / 2;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x010d  */
            /* JADX WARN: Code duplicated, block: B:60:0x012c  */
            /* JADX WARN: Code duplicated, block: B:61:0x012e  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i;
                if (f2 < 0.0f) {
                    if (!BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        int top = view.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            if (!BottomSheetBehavior.this.shouldExpandOnUpwardDrag(jCurrentTimeMillis - j, (top * 100.0f) / BottomSheetBehavior.this.parentHeight)) {
                                i = 4;
                            }
                        } else if (top > BottomSheetBehavior.this.halfExpandedOffset) {
                            i = 6;
                        }
                    }
                    i = 3;
                } else if (BottomSheetBehavior.this.hideable && BottomSheetBehavior.this.shouldHide(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.access$1500(BottomSheetBehavior.this)) || releasedLow(view)) {
                        i = 5;
                    } else if (BottomSheetBehavior.access$1400(BottomSheetBehavior.this) || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        i = 3;
                    } else {
                        i = 6;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i = 3;
                        } else {
                            i = 4;
                        }
                    } else if (top2 < BottomSheetBehavior.this.halfExpandedOffset) {
                        if (top2 < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i = 3;
                        } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i = 4;
                        } else {
                            i = 6;
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        i = 4;
                    } else {
                        i = 6;
                    }
                } else {
                    if (!BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) && !BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i = 6;
                        }
                    }
                    i = 4;
                }
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                BottomSheetBehavior.access$100(bottomSheetBehavior, view, i, bottomSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.access$1600(BottomSheetBehavior.this)) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:30:0x010c  */
    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                if (BottomSheetBehavior.this.state == 1 || BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (BottomSheetBehavior.this.state == 3 && BottomSheetBehavior.this.activePointerId == i2) {
                    View view2 = BottomSheetBehavior.this.nestedScrollingChildRef != null ? BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                return BottomSheetBehavior.this.viewRef != null && BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.access$1300(BottomSheetBehavior.this)) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(View view) {
                return view.getTop() > (BottomSheetBehavior.this.parentHeight + BottomSheetBehavior.this.getExpandedOffset()) / 2;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x010d  */
            /* JADX WARN: Code duplicated, block: B:60:0x012c  */
            /* JADX WARN: Code duplicated, block: B:61:0x012e  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i2;
                if (f2 < 0.0f) {
                    if (!BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        int top = view.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            if (!BottomSheetBehavior.this.shouldExpandOnUpwardDrag(jCurrentTimeMillis - j, (top * 100.0f) / BottomSheetBehavior.this.parentHeight)) {
                                i2 = 4;
                            }
                        } else if (top > BottomSheetBehavior.this.halfExpandedOffset) {
                            i2 = 6;
                        }
                    }
                    i2 = 3;
                } else if (BottomSheetBehavior.this.hideable && BottomSheetBehavior.this.shouldHide(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.access$1500(BottomSheetBehavior.this)) || releasedLow(view)) {
                        i2 = 5;
                    } else if (BottomSheetBehavior.access$1400(BottomSheetBehavior.this) || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        i2 = 3;
                    } else {
                        i2 = 6;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    } else if (top2 < BottomSheetBehavior.this.halfExpandedOffset) {
                        if (top2 < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i2 = 3;
                        } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i2 = 4;
                        } else {
                            i2 = 6;
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        i2 = 4;
                    } else {
                        i2 = 6;
                    }
                } else {
                    if (!BottomSheetBehavior.access$1400(BottomSheetBehavior.this)) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) && !BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i2 = 6;
                        }
                    }
                    i2 = 4;
                }
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                BottomSheetBehavior.access$100(bottomSheetBehavior, view, i2, bottomSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i3) {
                return MathUtils.clamp(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.access$1600(BottomSheetBehavior.this)) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
            int i2 = 2 % 2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            int i3 = 2 % 2;
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            int i4 = g + 77;
            f798a = i4 % 128;
            if (i4 % 2 != 0) {
                setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
                throw null;
            }
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
            int i5 = 2 % 2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            int i6 = f798a + 67;
            g = i6 % 128;
            int i7 = i6 % 2;
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
            int i8 = 2 % 2;
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null) {
            int i9 = f798a + 105;
            g = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 94 / 0;
                if (typedValuePeekValue.data == -1) {
                    setPeekHeight(typedValuePeekValue.data);
                } else {
                    setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
                    i = g + 125;
                    f798a = i % 128;
                    if (i % 2 != 0) {
                        int i11 = 2 % 3;
                    } else {
                        int i12 = 2 % 2;
                    }
                }
            } else if (typedValuePeekValue.data == -1) {
                setPeekHeight(typedValuePeekValue.data);
            } else {
                setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
                i = g + 125;
                f798a = i % 128;
                if (i % 2 != 0) {
                    int i13 = 2 % 3;
                } else {
                    int i14 = 2 % 2;
                }
            }
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
            i = g + 125;
            f798a = i % 128;
            if (i % 2 != 0) {
                int i15 = 2 % 3;
            } else {
                int i16 = 2 % 2;
            }
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        } else {
            setExpandedOffset(typedValuePeekValue2.data);
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
        int i2 = g + 105;
        f798a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return savedState;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = f798a + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        if (savedState.state == 1 || savedState.state == 2) {
            this.state = 4;
            this.lastStableState = 4;
            int i4 = g + 105;
            f798a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = savedState.state;
        this.state = i6;
        this.lastStableState = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = g + 87;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
        int i4 = g + 91;
        f798a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        int i = 2 % 2;
        int i2 = f798a + 59;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
        int i4 = g + 111;
        f798a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = g + 37;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i8 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i8 + marginLayoutParams.rightMargin + i2, this.maxWidth, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i9 = marginLayoutParams.topMargin;
        v.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i9 + marginLayoutParams.bottomMargin + i4, this.maxHeight, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        int i10 = g + 35;
        f798a = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = g + 121;
        f798a = i6 % 128;
        if (i6 % 2 != 0) {
            ViewGroup.getChildMeasureSpec(i, i2, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            int i7 = f798a + 81;
            g = i7 % 128;
            int i8 = i7 % 2;
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), BasicMeasure.EXACTLY);
        }
        int i9 = g + 77;
        f798a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 36 / 0;
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
        } else if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        int i3 = f798a + 25;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            ViewCompat.setWindowInsetsAnimationCallback(v, new InsetsAnimationCallback(v));
            this.viewRef = new WeakReference<>(v);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    int i5 = g + 111;
                    f798a = i5 % 128;
                    int i6 = i5 % 2;
                    elevation = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int iMin = this.parentHeight;
        int i7 = this.insetTop;
        if (iMin - height < i7) {
            int i8 = g;
            int i9 = i8 + 77;
            int i10 = i9 % 128;
            f798a = i10;
            int i11 = i9 % 2;
            if (this.paddingTopSystemWindowInsets) {
                int i12 = i10 + 5;
                g = i12 % 128;
                if (i12 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i13 = this.maxHeight;
                if (i13 != -1) {
                    int i14 = i10 + 19;
                    g = i14 % 128;
                    if (i14 % 2 == 0) {
                        iMin = Math.min(iMin, i13);
                        int i15 = 68 / 0;
                    } else {
                        iMin = Math.min(iMin, i13);
                    }
                }
                this.childHeight = iMin;
            } else {
                int iMin2 = iMin - i7;
                int i16 = this.maxHeight;
                if (i16 != -1) {
                    int i17 = i8 + 43;
                    f798a = i17 % 128;
                    int i18 = i17 % 2;
                    iMin2 = Math.min(iMin2, i16);
                }
                this.childHeight = iMin2;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i19 = this.state;
        if (i19 == 3) {
            int i20 = g + 85;
            f798a = i20 % 128;
            int i21 = i20 % 2;
            ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i19 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.halfExpandedOffset);
        } else if (this.hideable) {
            int i22 = g + 119;
            f798a = i22 % 128;
            int i23 = i22 % 2;
            if (i19 == 5) {
                ViewCompat.offsetTopAndBottom(v, this.parentHeight);
            } else if (i19 == 4) {
                int i24 = g + 79;
                f798a = i24 % 128;
                int i25 = i24 % 2;
                ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
            } else if (i19 != 1 || i19 == 2) {
                ViewCompat.offsetTopAndBottom(v, top - v.getTop());
            }
        } else if (i19 == 4) {
            int i26 = g + 79;
            f798a = i26 % 128;
            int i27 = i26 % 2;
            ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
        } else if (i19 != 1) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        } else {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        for (int i28 = 0; i28 < this.callbacks.size(); i28++) {
            this.callbacks.get(i28).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int i;
        ViewDragHelper viewDragHelper;
        int i2 = 2 % 2;
        int i3 = g + 11;
        f798a = i3 % 128;
        if (i3 % 2 != 0) {
            v.isShown();
            throw null;
        }
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    int i4 = f798a + 73;
                    g = i4 % 128;
                    int i5 = i4 % 2;
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                    int i6 = f798a + 77;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (this.activePointerId != -1 || coordinatorLayout.isPointInChildBounds(v, x, this.initialY)) {
                int i8 = g + 75;
                f798a = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            } else {
                z = true;
            }
            this.ignoreEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                int i10 = g + 71;
                f798a = i10 % 128;
                int i11 = i10 % 2;
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null) {
            int i12 = f798a + 9;
            g = i12 % 128;
            int i13 = i12 % 2;
            if (viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                int i14 = f798a + 79;
                g = i14 % 128;
                int i15 = i14 % 2;
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        if (actionMasked == 2) {
            int i16 = g + 29;
            f798a = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            if (view2 != null && !this.ignoreEvents && this.state != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.viewDragHelper != null && (i = this.initialY) != -1) {
                int i17 = g + 1;
                f798a = i17 % 128;
                if (i17 % 2 == 0 ? Math.abs(i - motionEvent.getY()) > this.viewDragHelper.getTouchSlop() : Math.abs(i + motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
                    int i18 = g + 95;
                    f798a = i18 % 128;
                    return i18 % 2 == 0;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = g + 1;
        f798a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            v.isShown();
            obj.hashCode();
            throw null;
        }
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1) {
            int i3 = f798a + 35;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (actionMasked == 0) {
                return true;
            }
        }
        if (shouldHandleDraggingWithHelper()) {
            int i4 = f798a + 45;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                this.viewDragHelper.processTouchEvent(motionEvent);
                int i5 = 50 / 0;
            } else {
                this.viewDragHelper.processTouchEvent(motionEvent);
            }
        }
        if (actionMasked == 0) {
            int i6 = g + 97;
            f798a = i6 % 128;
            if (i6 % 2 != 0) {
                reset();
                int i7 = 90 / 0;
            } else {
                reset();
            }
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper()) {
            int i8 = g + 7;
            int i9 = i8 % 128;
            f798a = i9;
            int i10 = i8 % 2;
            if (actionMasked == 2) {
                int i11 = i9 + 65;
                g = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 27 / 0;
                    if (!this.ignoreEvents) {
                        if (Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
                            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
                        }
                    }
                } else if (!this.ignoreEvents) {
                    if (Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
                        this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
                    }
                }
            }
        }
        return !this.ignoreEvents;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g;
        int i5 = i4 + 107;
        f798a = i5 % 128;
        boolean z = true;
        if (i5 % 2 != 0) {
            this.lastNestedScrollDy = 1;
            this.nestedScrolled = true;
            if ((i & 5) != 0) {
                int i6 = i4 + 19;
                f798a = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            this.lastNestedScrollDy = 0;
            this.nestedScrolled = false;
            if ((i & 2) != 0) {
                int i8 = i4 + 19;
                f798a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                z = false;
            }
        }
        int i10 = f798a + 79;
        g = i10 % 128;
        if (i10 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r3.draggable != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r3.draggable == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r9[1] = r8;
        androidx.core.view.ViewCompat.offsetTopAndBottom(r5, -r8);
        setStateInternal(1);
        r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.g + 53;
        com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r6 % 128;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7, int r8, int[] r9, int r10) {
        /*
            r3 = this;
            r4 = 2
            int r7 = r4 % r4
            int r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.g
            int r7 = r7 + 17
            int r0 = r7 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r0
            int r7 = r7 % r4
            r7 = 1
            if (r10 == r7) goto Lb5
            java.lang.ref.WeakReference<android.view.View> r10 = r3.nestedScrollingChildRef
            if (r10 == 0) goto L1a
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L1b
        L1a:
            r10 = 0
        L1b:
            boolean r0 = r3.isNestedScrollingCheckEnabled()
            if (r0 == 0) goto L23
            if (r6 != r10) goto Lb5
        L23:
            int r10 = r5.getTop()
            int r0 = r10 - r8
            if (r8 <= 0) goto L60
            int r6 = r3.getExpandedOffset()
            if (r0 >= r6) goto L5b
            int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r6 = r6 + 51
            int r0 = r6 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r0
            int r6 = r6 % r4
            if (r6 != 0) goto L4b
            int r6 = r3.getExpandedOffset()
            int r10 = r10 % r6
            r9[r7] = r10
            int r6 = -r10
            androidx.core.view.ViewCompat.offsetTopAndBottom(r5, r6)
            r3.setStateInternal(r4)
            goto La9
        L4b:
            int r4 = r3.getExpandedOffset()
            int r10 = r10 - r4
            r9[r7] = r10
            int r4 = -r10
            androidx.core.view.ViewCompat.offsetTopAndBottom(r5, r4)
            r4 = 3
            r3.setStateInternal(r4)
            goto La9
        L5b:
            boolean r6 = r3.draggable
            if (r6 == 0) goto Lb5
            goto L97
        L60:
            if (r8 >= 0) goto La9
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.g
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r2
            int r1 = r1 % r4
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == r7) goto La9
            int r6 = r3.collapsedOffset
            if (r0 <= r6) goto L92
            boolean r6 = r3.canBeHiddenByDragging()
            if (r6 != 0) goto L92
            int r6 = r3.collapsedOffset
            int r10 = r10 - r6
            r9[r7] = r10
            int r6 = -r10
            androidx.core.view.ViewCompat.offsetTopAndBottom(r5, r6)
            r6 = 4
            r3.setStateInternal(r6)
            int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r6 = r6 + r7
            int r9 = r6 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r9
        L90:
            int r6 = r6 % r4
            goto La9
        L92:
            boolean r6 = r3.draggable
            if (r6 != 0) goto L97
            goto Lb5
        L97:
            r9[r7] = r8
            int r6 = -r8
            androidx.core.view.ViewCompat.offsetTopAndBottom(r5, r6)
            r3.setStateInternal(r7)
            int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.g
            int r6 = r6 + 53
            int r9 = r6 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r9
            goto L90
        La9:
            int r4 = r5.getTop()
            r3.dispatchOnSlide(r4)
            r3.lastNestedScrollDy = r8
            r3.nestedScrolled = r7
            return
        Lb5:
            int r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r5 = r5 + 19
            int r6 = r5 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r6
            int r5 = r5 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.getTop() == getExpandedOffset()) goto L10;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        int i = 2 % 2;
        if (isNestedScrollingCheckEnabled()) {
            int i2 = g + 17;
            f798a = i2 % 128;
            int i3 = i2 % 2;
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            if (weakReference != null && view == weakReference.get()) {
                int i4 = f798a + 89;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    if (this.state != 5) {
                        return true;
                    }
                } else if (this.state != 3) {
                    return true;
                }
                if (super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
                    return true;
                }
            }
        }
        int i5 = g + 41;
        f798a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean isFitToContents() {
        int i = 2 % 2;
        int i2 = f798a + 103;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = this.fitToContents;
        int i5 = i3 + 31;
        f798a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setFitToContents(boolean z) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 107;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        if (this.fitToContents == z) {
            int i6 = i3 + 55;
            f798a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            int i8 = i3 + 85;
            f798a = i8 % 128;
            int i9 = i8 % 2;
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            int i10 = f798a + 75;
            g = i10 % 128;
            if (i10 % 2 != 0) {
                i = 3;
            }
        } else {
            int i11 = this.state;
            int i12 = f798a + 15;
            g = i12 % 128;
            int i13 = i12 % 2;
            i = i11;
        }
        setStateInternal(i);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setMaxWidth(int i) {
        int i2 = 2 % 2;
        int i3 = f798a + 11;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.maxWidth = i;
        int i6 = i4 + 43;
        f798a = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getMaxWidth() {
        int i = 2 % 2;
        int i2 = g + 71;
        f798a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxWidth;
        }
        int i3 = 2 / 0;
        return this.maxWidth;
    }

    public void setMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = f798a;
        int i4 = i3 + 77;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.maxHeight = i;
        int i6 = i3 + 93;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    public int getMaxHeight() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 17;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxHeight;
        int i6 = i2 + 21;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
        return i5;
    }

    public void setPeekHeight(int i) {
        int i2 = 2 % 2;
        int i3 = g + 111;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        setPeekHeight(i, false);
        int i5 = f798a + 83;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setPeekHeight(int i, boolean z) {
        int i2 = 2 % 2;
        if (i == -1) {
            if (this.peekHeightAuto) {
                return;
            }
            int i3 = f798a + 87;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                this.peekHeightAuto = false;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
            int i4 = g + 25;
            f798a = i4 % 128;
            int i5 = i4 % 2;
        }
        updatePeekHeight(z);
    }

    private void updatePeekHeight(boolean z) {
        int i = 2 % 2;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4) {
                int i2 = f798a + 51;
                g = i2 % 128;
                int i3 = i2 % 2;
                V v = this.viewRef.get();
                if (v != null) {
                    if (z) {
                        setState(4);
                        return;
                    }
                    v.requestLayout();
                }
            }
        }
        int i4 = f798a + 49;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0269  */
    public int getPeekHeight() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 87;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b2, (byte) (b2 | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSizeAndState, offsetAfter, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{2207, 4218, 46166, 30056}, new char[]{40720, 47603, 46669, 2840}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0), new char[]{64097, 38936, 34713, 64010, 56617, 46951, 55429, 25927, 58981, 4818, 5324, 52949, 11010, 31751, 14325, 5478, 20397, 54605, 34909, 55910, 49135, 18711}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{2207, 4218, 46166, 30056}, new char[]{13197, 982, 40725, 5880}, (char) (63648 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 352572979 + (Process.myTid() >> 22), new char[]{20125, 17765, 10829, 60446, 17975, 58744, 26893, 22823, 36225, 16068, 38711, 59758, 42069, 22252, 63316}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) Color.red(0);
            int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, windowTouchSlop, i4, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 11;
                byte b5 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 89, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iLastIndexOf, iLastIndexOf2, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = 2029882472 + (((-102829100) | i5) * (-369)) + (((~((-952951701) | i5)) | (-912641472)) * (-369)) + (((~(iIdentityHashCode | 952951700)) | (-1055780800) | (~(i5 | (-809812373)))) * 369) + 568066445;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{6638, 33620, 27371, 11331}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17257), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{15169, 47536, 2128, 51450, 26589, 28722, 47901, 2493, 3351, 26250, 151, 48624, 12087, 22337, 41475, 50258, 24502, 3846, 38149, 63621, 54667, 43276, 'N', 36407, 44325, 18964}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{63476, 13347, 36431, 26319}, (char) (53134 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{49224, 38511, 7997, 17407, 10444, 49543, 50161, 55733, 14829, 49802, 28360, 58255, 52514, 56068, 21523, 63616, 28799, 24626}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = f798a + 95;
                    g = i9 % 128;
                    int i10 = i9 % 2;
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
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{21193, 2918, 44571, 20824}, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 22702), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{14751, 64670, 53823, 32601, 7837, 49388, 57312, 11082, 367, 31275, 62452, 6231, 57365, 31151, 30211, 63978}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{11162, 26454, 21030, 43601}, (char) (20818 - (ViewConfiguration.getLongPressTimeout() >> 16)), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{65124, 20776, 21017, 36573, 16974, 24789, 13271, 13964, 43252, 47584, 10910, 44633, 55141, 44560, 5459, 17979}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 568066445};
                byte[] bArr = $$d;
                Object[] objArr13 = new Object[1];
                e((short) 77, bArr[29], bArr[66], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e(bArr[170], bArr[13], (byte) (bArr[43] - 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte b6 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        c((byte) 89, b6, b6, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, tapTimeout, edgeSlop, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(new char[]{2207, 4218, 46166, 30056}, new char[]{40720, 47603, 46669, 2840}, (char) View.getDefaultSize(0, 0), TextUtils.getOffsetBefore("", 0), new char[]{64097, 38936, 34713, 64010, 56617, 46951, 55429, 25927, 58981, 4818, 5324, 52949, 11010, 31751, 14325, 5478, 20397, 54605, 34909, 55910, 49135, 18711}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(new char[]{2207, 4218, 46166, 30056}, new char[]{13197, 982, 40725, 5880}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 63646), KeyEvent.getDeadChar(0, 0) + 352572979, new char[]{20125, 17765, 10829, 60446, 17975, 58744, 26893, 22823, 36225, 16068, 38711, 59758, 42069, 22252, 63316}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr18 = new Object[1];
                            c(b7, b8, b8, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, keyRepeatTimeout, packedPositionChild, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
                            byte b9 = $$a[7];
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, b9, (byte) (b9 | 15), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iKeyCodeFromString, iCombineMeasuredStates, -1650998592, false, (String) objArr19[0], null);
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 != i11) {
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i14 = i13 + 1635081778 + (((-22595787) | iIdentityHashCode2) * (-381)) + (((~((~iIdentityHashCode2) | (-259574011))) | 514266677) * 381) + 19059874;
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        Object obj = objArr20[1];
        ((int[]) obj)[0] = i16 ^ (i16 << 5);
        if (!this.peekHeightAuto) {
            return this.peekHeight;
        }
        int i17 = ((int[]) obj)[0];
        int i18 = i17 * i17;
        int i19 = -(654574909 * i17);
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        int i21 = -(i17 * 52293883);
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = ((i22 | (-238032112)) << 1) - ((-238032112) ^ i22);
        int i24 = i23 >> 23;
        int i25 = ((i24 ^ (-1023)) + ((i24 & (-1023)) << 1)) / 512;
        int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
        int i27 = (i23 & i26) + (i26 | i23);
        int i28 = i23 >> 15;
        int i29 = (((-262143) & i28) + (i28 | (-262143))) / 131072;
        int i30 = -(((i29 ^ 1) + ((i29 & 1) << 1)) ^ i27);
        int i31 = (i30 ^ 2) + ((i30 & 2) << 1);
        int i32 = ((i31 >> 20) - 8191) / 4096;
        int i33 = (i32 & 1) + (i32 | 1);
        return (-402) / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i31) * 201);
    }

    public void setHalfExpandedRatio(float f) {
        int i = 2 % 2;
        int i2 = f798a + 25;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0 ? f > 0.0f : f > 0.0f) {
            if (f < 1.0f) {
                int i4 = i3 + 31;
                f798a = i4 % 128;
                int i5 = i4 % 2;
                this.halfExpandedRatio = f;
                if (this.viewRef != null) {
                    int i6 = i3 + 15;
                    f798a = i6 % 128;
                    if (i6 % 2 != 0) {
                        calculateHalfExpandedOffset();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    calculateHalfExpandedOffset();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public float getHalfExpandedRatio() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        float f = this.halfExpandedRatio;
        int i5 = i2 + 27;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setExpandedOffset(int i) {
        int i2 = 2 % 2;
        int i3 = f798a;
        int i4 = i3 + 11;
        g = i4 % 128;
        int i5 = i4 % 2;
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        int i6 = i3 + 87;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            this.expandedOffset = i;
            updateDrawableForTargetState(this.state, false);
        } else {
            this.expandedOffset = i;
            updateDrawableForTargetState(this.state, true);
        }
        int i7 = g + 113;
        f798a = i7 % 128;
        int i8 = i7 % 2;
    }

    public int getExpandedOffset() {
        int i;
        int i2 = 2 % 2;
        if (this.fitToContents) {
            int i3 = g + 61;
            f798a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.fitToContentsOffset;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.expandedOffset;
        if (this.paddingTopSystemWindowInsets) {
            int i5 = g + 37;
            f798a = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int i7 = this.insetTop;
            int i8 = g + 63;
            f798a = i8 % 128;
            int i9 = i8 % 2;
            i = i7;
        }
        return Math.max(i4, i);
    }

    public float calculateSlideOffset() {
        int i = 2 % 2;
        int i2 = f798a + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            int i4 = g + 125;
            f798a = i4 % 128;
            int i5 = i4 % 2;
            return -1.0f;
        }
        int i6 = g + 43;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public void setHideable(boolean z) {
        int i = 2 % 2;
        int i2 = g + 43;
        int i3 = i2 % 128;
        f798a = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.hideable != z) {
            int i4 = i3 + 19;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                this.hideable = z;
                int i5 = 24 / 0;
                if (!z) {
                    if (this.state == 5) {
                        setState(4);
                    }
                }
            } else {
                this.hideable = z;
                if (!z) {
                    if (this.state == 5) {
                        setState(4);
                    }
                }
            }
            updateAccessibilityActions();
        }
        int i6 = g + 49;
        f798a = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isHideable() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 47;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hideable;
        int i5 = i2 + 111;
        f798a = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setSkipCollapsed(boolean z) {
        int i = 2 % 2;
        int i2 = f798a + 49;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.skipCollapsed = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 65;
        f798a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public boolean getSkipCollapsed() {
        int i = 2 % 2;
        int i2 = g + 67;
        int i3 = i2 % 128;
        f798a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.skipCollapsed;
        int i4 = i3 + 39;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void setDraggable(boolean z) {
        int i = 2 % 2;
        int i2 = f798a + 69;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.draggable = z;
        int i5 = i3 + 49;
        f798a = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isDraggable() {
        int i = 2 % 2;
        int i2 = g + 43;
        int i3 = i2 % 128;
        f798a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.draggable;
        int i4 = i3 + 23;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void setSignificantVelocityThreshold(int i) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 63;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        this.significantVelocityThreshold = i;
        if (i5 != 0) {
            int i6 = 71 / 0;
        }
        int i7 = i3 + 93;
        f798a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public int getSignificantVelocityThreshold() {
        int i = 2 % 2;
        int i2 = f798a + 113;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.significantVelocityThreshold;
        int i6 = i3 + 37;
        f798a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSaveFlags(int i) {
        int i2 = 2 % 2;
        int i3 = f798a + 73;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.saveFlags = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getSaveFlags() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.saveFlags;
        int i6 = i2 + 115;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
        }
        return i5;
    }

    public void setHideFriction(float f) {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 33;
        g = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.hideFriction = f;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 115;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public float getHideFriction() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 93;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.hideFriction;
        int i4 = i2 + 31;
        g = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        int i = 2 % 2;
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            int i2 = f798a + 87;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.callbacks.add(bottomSheetCallback);
            int i4 = g + 79;
            f798a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        int i = 2 % 2;
        int i2 = g + 49;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        int i4 = f798a + 69;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            this.callbacks.add(bottomSheetCallback);
            int i5 = 60 / 0;
        } else {
            this.callbacks.add(bottomSheetCallback);
        }
        int i6 = g + 71;
        f798a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        int i = 2 % 2;
        int i2 = f798a + 89;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.callbacks.remove(bottomSheetCallback);
            throw null;
        }
        this.callbacks.remove(bottomSheetCallback);
        int i3 = g + 73;
        f798a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    public void setState(int i) {
        String str;
        int i2 = 2 % 2;
        if (i != 1) {
            int i3 = f798a;
            int i4 = i3 + 71;
            g = i4 % 128;
            if (i4 % 2 != 0 ? i != 2 : i != 2) {
                if (!this.hideable && i == 5) {
                    int i5 = i3 + 71;
                    g = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                final int i6 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
                WeakReference<V> weakReference = this.viewRef;
                if (weakReference != null) {
                    int i7 = g + 87;
                    f798a = i7 % 128;
                    int i8 = i7 % 2;
                    if (weakReference.get() != null) {
                        final V v = this.viewRef.get();
                        runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                            @Override // java.lang.Runnable
                            public void run() {
                                BottomSheetBehavior.access$100(BottomSheetBehavior.this, v, i6, false);
                            }
                        });
                        return;
                    }
                }
                setStateInternal(i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
            int i9 = f798a + 121;
            g = i9 % 128;
            int i10 = i9 % 2;
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    private void runAfterLayout(V v, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f798a + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isLayouting(v))) {
            int i4 = f798a + 65;
            g = i4 % 128;
            int i5 = i4 % 2;
            v.post(runnable);
            return;
        }
        runnable.run();
        int i6 = g + 71;
        f798a = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 android.view.ViewParent) = (r1v4 android.view.ViewParent), (r1v12 android.view.ViewParent) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean isLayouting(V v) {
        ViewParent parent;
        int i = 2 % 2;
        int i2 = g + 97;
        f798a = i2 % 128;
        if (i2 % 2 != 0) {
            parent = v.getParent();
            int i3 = 91 / 0;
            if (parent != null) {
                if (parent.isLayoutRequested()) {
                    int i4 = g + 117;
                    f798a = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(!ViewCompat.isAttachedToWindow(v))) {
                        return true;
                    }
                }
            }
        } else {
            parent = v.getParent();
            if (parent != null) {
                if (parent.isLayoutRequested()) {
                    int i6 = g + 117;
                    f798a = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(!ViewCompat.isAttachedToWindow(v))) {
                        return true;
                    }
                }
            }
        }
        int i8 = g + 61;
        f798a = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 45;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        this.gestureInsetBottomIgnored = z;
        int i5 = i2 + 79;
        f798a = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isGestureInsetBottomIgnored() {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        boolean z = this.gestureInsetBottomIgnored;
        int i5 = i3 + 13;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        int i = 2 % 2;
        int i2 = f798a + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
            int i4 = g + 89;
            f798a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
        int i6 = f798a + 91;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public boolean isShouldRemoveExpandedCorners() {
        int i = 2 % 2;
        int i2 = g + 81;
        int i3 = i2 % 128;
        f798a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.shouldRemoveExpandedCorners;
        int i4 = i3 + 29;
        g = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public int getState() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 111;
        f798a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.state;
        int i5 = i2 + 3;
        f798a = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    void setStateInternal(int i) {
        V v;
        int i2 = 2 % 2;
        int i3 = g + 17;
        int i4 = i3 % 128;
        f798a = i4;
        int i5 = i3 % 2;
        if (this.state != i) {
            this.state = i;
            if (i == 4 || i == 3) {
                this.lastStableState = i;
                int i6 = g + 7;
                f798a = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = i4 + 29;
                g = i8 % 128;
                if (i8 % 2 != 0 ? i == 6 : i == 33) {
                    this.lastStableState = i;
                    int i9 = g + 7;
                    f798a = i9 % 128;
                    int i10 = i9 % 2;
                } else if (this.hideable) {
                    int i11 = i4 + 101;
                    g = i11 % 128;
                    if (i11 % 2 != 0 ? i == 5 : i == 2) {
                        this.lastStableState = i;
                        int i12 = g + 7;
                        f798a = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                updateImportantForAccessibility(true);
            } else if (i == 6 || i == 5 || i == 4) {
                updateImportantForAccessibility(false);
            }
            updateDrawableForTargetState(i, true);
            for (int i14 = 0; i14 < this.callbacks.size(); i14++) {
                this.callbacks.get(i14).onStateChanged(v, i);
            }
            updateAccessibilityActions();
        }
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean zIsExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        int i2 = 2 % 2;
        if (i != 2) {
            int i3 = f798a + 123;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners();
                int i4 = 21 / 0;
                if (this.expandedCornersRemoved == zIsExpandedAndShouldRemoveCorners) {
                    return;
                }
            } else {
                zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners();
                if (this.expandedCornersRemoved == zIsExpandedAndShouldRemoveCorners) {
                    return;
                }
            }
            if (this.materialShapeDrawable != null) {
                this.expandedCornersRemoved = zIsExpandedAndShouldRemoveCorners;
                float fCalculateInterpolationWithCornersRemoved = 1.0f;
                if (!z || (valueAnimator = this.interpolatorAnimator) == null) {
                    ValueAnimator valueAnimator2 = this.interpolatorAnimator;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.interpolatorAnimator.cancel();
                    }
                    this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
                    return;
                }
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                float interpolation = this.materialShapeDrawable.getInterpolation();
                if (zIsExpandedAndShouldRemoveCorners) {
                    int i5 = g + 47;
                    f798a = i5 % 128;
                    int i6 = i5 % 2;
                    fCalculateInterpolationWithCornersRemoved = calculateInterpolationWithCornersRemoved();
                }
                this.interpolatorAnimator.setFloatValues(interpolation, fCalculateInterpolationWithCornersRemoved);
                this.interpolatorAnimator.start();
            }
        }
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        int i = 2 % 2;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null) {
            return 0.0f;
        }
        int i2 = f798a + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v = this.viewRef.get();
        if (!isAtTopOfScreen()) {
            return 0.0f;
        }
        int i4 = g + 99;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        WindowInsets rootWindowInsets = v.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return 0.0f;
        }
        float fMax = Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
        int i6 = g + 93;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return fMax;
    }

    private float calculateCornerInterpolation(float f, RoundedCorner roundedCorner) {
        int i = 2 % 2;
        int i2 = g + 95;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f) {
                int i4 = f798a + 25;
                g = i4 % 128;
                if (i4 % 2 != 0 ? f > 0.0f : f > 1.0f) {
                    return radius / f;
                }
            }
        }
        return 0.0f;
    }

    private boolean isAtTopOfScreen() {
        int i = 2 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return false;
        }
        int i2 = f798a + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        int i4 = f798a + 97;
        int i5 = i4 % 128;
        g = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 79;
        f798a = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        int i = 2 % 2;
        int i2 = f798a + 79;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.state != 5) {
                return false;
            }
        } else if (this.state != 3) {
            return false;
        }
        if (!this.shouldRemoveExpandedCorners && !isAtTopOfScreen()) {
            return false;
        }
        int i3 = f798a + 55;
        g = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private int calculatePeekHeight() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 115;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.peekHeightAuto) {
            int iMin = Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
            int i4 = g + 117;
            f798a = i4 % 128;
            int i5 = i4 % 2;
            return iMin;
        }
        if ((!this.gestureInsetBottomIgnored) && !this.paddingBottomSystemWindowInsets) {
            int i6 = i2 + 7;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = this.gestureInsetBottom;
            if (i7 > 0) {
                int iMax = Math.max(this.peekHeight, i7 + this.peekHeightGestureInsetBuffer);
                int i8 = f798a + 31;
                g = i8 % 128;
                int i9 = i8 % 2;
                return iMax;
            }
        }
        return this.peekHeight + this.insetBottom;
    }

    private void calculateCollapsedOffset() {
        int i = 2 % 2;
        int iCalculatePeekHeight = calculatePeekHeight();
        if (!this.fitToContents) {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
            return;
        }
        int i2 = f798a + 95;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.collapsedOffset = Math.max(this.parentHeight % iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        }
        int i3 = g + 27;
        f798a = i3 % 128;
        int i4 = i3 % 2;
    }

    private void calculateHalfExpandedOffset() {
        int i = 2 % 2;
        int i2 = g + 63;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        float f = this.parentHeight;
        this.halfExpandedOffset = (int) (i3 != 0 ? f + (2.0f % this.halfExpandedRatio) : f * (1.0f - this.halfExpandedRatio));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float expandedOffset;
        int i2 = 2 % 2;
        int i3 = this.collapsedOffset;
        if (i <= i3) {
            int i4 = g + 83;
            f798a = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != getExpandedOffset()) {
                int i6 = this.collapsedOffset;
                f = i6 - i;
                expandedOffset = i6 - getExpandedOffset();
                int i7 = f798a + 67;
                g = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = this.collapsedOffset;
                f = i9 - i;
                expandedOffset = this.parentHeight - i9;
            }
        } else {
            int i10 = this.collapsedOffset;
            f = i10 - i;
            expandedOffset = this.parentHeight - i10;
        }
        return f / expandedOffset;
    }

    private void reset() {
        int i = 2 % 2;
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            int i2 = g + 99;
            f798a = i2 % 128;
            int i3 = i2 % 2;
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        int i4 = f798a + 113;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    private void restoreOptionalState(SavedState savedState) {
        int i;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 9;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.saveFlags;
        if (i6 != 0) {
            if (i6 != -1) {
                int i7 = i3 + 83;
                f798a = i7 % 128;
                int i8 = i7 % 2;
                if ((i6 & 1) == 1) {
                    this.peekHeight = savedState.peekHeight;
                }
            } else {
                this.peekHeight = savedState.peekHeight;
            }
            int i9 = this.saveFlags;
            if (i9 != -1) {
                int i10 = f798a + 19;
                g = i10 % 128;
                int i11 = i10 % 2;
                if ((i9 & 2) == 2) {
                    this.fitToContents = savedState.fitToContents;
                    i = g + 9;
                    f798a = i % 128;
                    if (i % 2 != 0) {
                        int i12 = 2 % 5;
                    }
                }
            } else {
                this.fitToContents = savedState.fitToContents;
                i = g + 9;
                f798a = i % 128;
                if (i % 2 != 0) {
                    int i13 = 2 % 5;
                }
            }
            int i14 = this.saveFlags;
            if (i14 != -1) {
                int i15 = f798a + 91;
                g = i15 % 128;
                if (i15 % 2 != 0 ? (i14 & 4) == 4 : (i14 & 3) == 4) {
                    this.hideable = savedState.hideable;
                }
            } else {
                this.hideable = savedState.hideable;
            }
            int i16 = this.saveFlags;
            if (i16 != -1) {
                int i17 = f798a + 53;
                g = i17 % 128;
                if (i17 % 2 == 0) {
                    if ((i16 & 84) != 25) {
                        return;
                    }
                } else if ((i16 & 8) != 8) {
                    return;
                }
            }
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    boolean shouldHide(View view, float f) {
        int i = 2 % 2;
        if (!(!this.skipCollapsed)) {
            int i2 = g + 119;
            f798a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!isHideableWhenDragging()) {
            return false;
        }
        if (view.getTop() < this.collapsedOffset) {
            int i4 = f798a + 39;
            g = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Math.abs((view.getTop() + (f * this.hideFriction)) - this.collapsedOffset) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        int i5 = g + 37;
        f798a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return false;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(BackEventCompat backEventCompat) {
        int i = 2 % 2;
        int i2 = f798a + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
        int i4 = f798a + 63;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1.updateBackProgress(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 75;
        com.google.android.material.bottomsheet.BottomSheetBehavior.g = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // com.google.android.material.motion.MaterialBackHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateBackProgress(androidx.view.BackEventCompat r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.g
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.google.android.material.motion.MaterialBottomContainerBackHelper r1 = r4.bottomContainerBackHelper
            r3 = 53
            int r3 = r3 / 0
            if (r1 != 0) goto L23
            goto L1b
        L17:
            com.google.android.material.motion.MaterialBottomContainerBackHelper r1 = r4.bottomContainerBackHelper
            if (r1 != 0) goto L23
        L1b:
            int r2 = r2 + 75
            int r5 = r2 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r5
            int r2 = r2 % r0
            return
        L23:
            r1.updateBackProgress(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.updateBackProgress(androidx.activity.BackEventCompat):void");
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        int i = 2 % 2;
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        int i2 = 4;
        if (backEventCompatOnHandleBackInvoked != null) {
            int i3 = f798a + 103;
            g = i3 % 128;
            if (i3 % 2 != 0 ? Build.VERSION.SDK_INT >= 34 : Build.VERSION.SDK_INT >= 76) {
                Object obj = null;
                if (!this.hideable) {
                    this.bottomContainerBackHelper.finishBackProgressPersistent(backEventCompatOnHandleBackInvoked, null);
                    setState(4);
                    return;
                }
                this.bottomContainerBackHelper.finishBackProgressNotPersistent(backEventCompatOnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        BottomSheetBehavior.this.setStateInternal(5);
                        if (BottomSheetBehavior.this.viewRef == null || BottomSheetBehavior.this.viewRef.get() == null) {
                            return;
                        }
                        BottomSheetBehavior.this.viewRef.get().requestLayout();
                    }
                });
                int i4 = g + 41;
                f798a = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (this.hideable) {
            int i5 = f798a + 113;
            g = i5 % 128;
            int i6 = i5 % 2;
            i2 = 5;
        }
        setState(i2);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        int i = 2 % 2;
        int i2 = f798a + 65;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
        int i3 = g + 25;
        f798a = i3 % 128;
        int i4 = i3 % 2;
    }

    MaterialBottomContainerBackHelper getBackHelper() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[80], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, threadPriority, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{2207, 4218, 46166, 30056}, new char[]{40720, 47603, 46669, 2840}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{64097, 38936, 34713, 64010, 56617, 46951, 55429, 25927, 58981, 4818, 5324, 52949, 11010, 31751, 14325, 5478, 20397, 54605, 34909, 55910, 49135, 18711}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{2207, 4218, 46166, 30056}, new char[]{13197, 982, 40725, 5880}, (char) (63695 - AndroidCharacter.getMirror('0')), 352572979 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{20125, 17765, 10829, 60446, 17975, 58744, 26893, 22823, 36225, 16068, 38711, 59758, 42069, 22252, 63316}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (Color.blue(0) + 31533);
            int mirror = 969 - AndroidCharacter.getMirror('0');
            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, mirror, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 52, b4, (byte) (b4 | 15), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, minimumFlingVelocity, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = (~((-206764571) | i2)) | 1092122;
            int i4 = ~(iIdentityHashCode | (-1361642626));
            int i5 = ((((-1930787396) + ((i3 | i4) * (-713))) + (i4 * 1426)) + ((~((-1567315074) | i2)) * 713)) - 2032299523;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{6638, 33620, 27371, 11331}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17258), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{15169, 47536, 2128, 51450, 26589, 28722, 47901, 2493, 3351, 26250, 151, 48624, 12087, 22337, 41475, 50258, 24502, 3846, 38149, 63621, 54667, 43276, 'N', 36407, 44325, 18964}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{63476, 13347, 36431, 26319}, (char) (AndroidCharacter.getMirror('0') + 53086), Color.rgb(0, 0, 0) + 16777216, new char[]{49224, 38511, 7997, 17407, 10444, 49543, 50161, 55733, 14829, 49802, 28360, 58255, 52514, 56068, 21523, 63616, 28799, 24626}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = g + 125;
                f798a = i8 % 128;
                int i9 = i8 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{21193, 2918, 44571, 20824}, (char) (TextUtils.indexOf("", "", 0, 0) + 22702), View.resolveSize(0, 0), new char[]{14751, 64670, 53823, 32601, 7837, 49388, 57312, 11082, 367, 31275, 62452, 6231, 57365, 31151, 30211, 63978}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{2207, 4218, 46166, 30056}, new char[]{11162, 26454, 21030, 43601}, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 20818), ViewConfiguration.getTapTimeout() >> 16, new char[]{65124, 20776, 21017, 36573, 16974, 24789, 13271, 13964, 43252, 47584, 10910, 44633, 55141, 44560, 5459, 17979}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = g + 125;
            f798a = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2032299523};
                byte[] bArr2 = $$d;
                short s = bArr2[66];
                byte b5 = (byte) s;
                Object[] objArr13 = new Object[1];
                e(s, b5, (byte) (b5 | 20), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e(bArr2[170], bArr2[13], (byte) (bArr2[43] - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                    int iBlue = Color.blue(0) + 921;
                    int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte b6 = $$a[7];
                    Object[] objArr16 = new Object[1];
                    c((byte) 52, b6, (byte) (b6 | 15), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iBlue, iLastIndexOf2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new char[]{2207, 4218, 46166, 30056}, new char[]{40720, 47603, 46669, 2840}, (char) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{64097, 38936, 34713, 64010, 56617, 46951, 55429, 25927, 58981, 4818, 5324, 52949, 11010, 31751, 14325, 5478, 20397, 54605, 34909, 55910, 49135, 18711}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new char[]{2207, 4218, 46166, 30056}, new char[]{13197, 982, 40725, 5880}, (char) (63648 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 352572980, new char[]{20125, 17765, 10829, 60446, 17975, 58744, 26893, 22823, 36225, 16068, 38711, 59758, 42069, 22252, 63316}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr19 = new Object[1];
                        c(b7, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, scrollBarSize, scrollDefaultDelay, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr3[7], bArr3[80], (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iIndexOf, offsetBefore, -1048449946, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i14 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = (-979112667) + (((~((-905150949) | iIdentityHashCode2)) | 70320448 | (~(868928695 | iIdentityHashCode2))) * (-754));
        int i16 = ~((-70320449) | iIdentityHashCode2);
        int i17 = ~iIdentityHashCode2;
        int i18 = i14 + i15 + ((i16 | (~(939249143 | i17))) * (-754)) + ((i17 | (-905150949)) * 754);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        int i21 = f798a + 11;
        g = i21 % 128;
        if (i21 % 2 != 0) {
            return materialBottomContainerBackHelper;
        }
        obj.hashCode();
        throw null;
    }

    View findScrollingChild(View view) {
        ViewGroup viewGroup;
        int childCount;
        int i;
        int i2 = 2 % 2;
        int i3 = f798a + 69;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            view.getVisibility();
            obj.hashCode();
            throw null;
        }
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i4 = g + 5;
            f798a = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup = (ViewGroup) view;
                childCount = viewGroup.getChildCount();
                i = 1;
            } else {
                viewGroup = (ViewGroup) view;
                childCount = viewGroup.getChildCount();
                i = 0;
            }
            while (i < childCount) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (viewFindScrollingChild != null) {
                    int i5 = g + 101;
                    f798a = i5 % 128;
                    int i6 = i5 % 2;
                    return viewFindScrollingChild;
                }
                i++;
            }
        }
        return null;
    }

    private boolean shouldHandleDraggingWithHelper() {
        int i = 2 % 2;
        if (this.viewDragHelper != null) {
            int i2 = g;
            int i3 = i2 + 87;
            f798a = i3 % 128;
            int i4 = i3 % 2;
            if (this.draggable || this.state == 1) {
                int i5 = i2 + 99;
                f798a = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        }
        int i6 = g + 113;
        f798a = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        int i = 2 % 2;
        if (this.shapeAppearanceModelDefault == null) {
            int i2 = g + 123;
            f798a = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList == null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        } else {
            this.materialShapeDrawable.setFillColor(colorStateList);
            int i3 = g + 75;
            f798a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 47;
        f798a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        int i4 = i2 + 65;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        return materialShapeDrawable;
    }

    private void createShapeValueAnimator() {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.access$200(BottomSheetBehavior.this) != null) {
                    BottomSheetBehavior.access$200(BottomSheetBehavior.this).setInterpolation(fFloatValue);
                }
            }
        });
        int i2 = g + 43;
        f798a = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    private void setWindowInsetsListener(View view) {
        final boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) {
            z = false;
        } else {
            int i4 = g + 81;
            f798a = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (!this.paddingBottomSystemWindowInsets) {
            int i6 = f798a + 83;
            int i7 = i6 % 128;
            g = i7;
            if (i6 % 2 == 0) {
                int i8 = 91 / 0;
                if (!this.paddingLeftSystemWindowInsets) {
                    int i9 = i7 + 119;
                    i = i9 % 128;
                    f798a = i;
                    int i10 = i9 % 2;
                    if (!this.paddingRightSystemWindowInsets && !this.marginLeftSystemWindowInsets && !this.marginRightSystemWindowInsets && !this.marginTopSystemWindowInsets) {
                        i2 = i + 29;
                        g = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i11 = 53 / 0;
                            if (!z) {
                                return;
                            }
                        } else if (!z) {
                            return;
                        }
                    }
                }
            } else if (!this.paddingLeftSystemWindowInsets) {
                int i12 = i7 + 119;
                i = i12 % 128;
                f798a = i;
                int i13 = i12 % 2;
                if (!this.paddingRightSystemWindowInsets) {
                    i2 = i + 29;
                    g = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i14 = 53 / 0;
                        if (!z) {
                            return;
                        }
                    } else if (!z) {
                        return;
                    }
                }
            }
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                boolean z2;
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
                BottomSheetBehavior.access$302(BottomSheetBehavior.this, insets.top);
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                int paddingBottom = view2.getPaddingBottom();
                int paddingLeft = view2.getPaddingLeft();
                int paddingRight = view2.getPaddingRight();
                if (BottomSheetBehavior.access$400(BottomSheetBehavior.this)) {
                    BottomSheetBehavior.access$502(BottomSheetBehavior.this, windowInsetsCompat.getSystemWindowInsetBottom());
                    paddingBottom = relativePadding.bottom + BottomSheetBehavior.access$500(BottomSheetBehavior.this);
                }
                if (BottomSheetBehavior.access$600(BottomSheetBehavior.this)) {
                    paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + insets.left;
                }
                if (BottomSheetBehavior.access$700(BottomSheetBehavior.this)) {
                    paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + insets.right;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                boolean z3 = true;
                if (!BottomSheetBehavior.access$800(BottomSheetBehavior.this) || marginLayoutParams.leftMargin == insets.left) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = insets.left;
                    z2 = true;
                }
                if (!BottomSheetBehavior.access$900(BottomSheetBehavior.this) || marginLayoutParams.rightMargin == insets.right) {
                    z3 = z2;
                } else {
                    marginLayoutParams.rightMargin = insets.right;
                }
                if (BottomSheetBehavior.access$1000(BottomSheetBehavior.this) && marginLayoutParams.topMargin != insets.top) {
                    marginLayoutParams.topMargin = insets.top;
                } else {
                    if (z3) {
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                        BottomSheetBehavior.access$1102(BottomSheetBehavior.this, insets2.bottom);
                    }
                    if (BottomSheetBehavior.access$400(BottomSheetBehavior.this) && !z) {
                        return windowInsetsCompat;
                    }
                    BottomSheetBehavior.access$1200(BottomSheetBehavior.this, false);
                    return windowInsetsCompat;
                }
                view2.setLayoutParams(marginLayoutParams);
                view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                if (z) {
                    BottomSheetBehavior.access$1102(BottomSheetBehavior.this, insets2.bottom);
                }
                if (BottomSheetBehavior.access$400(BottomSheetBehavior.this)) {
                }
                BottomSheetBehavior.access$1200(BottomSheetBehavior.this, false);
                return windowInsetsCompat;
            }
        });
    }

    class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    if (BottomSheetBehavior.this.viewDragHelper != null && BottomSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                    } else if (BottomSheetBehavior.this.state == 2) {
                        BottomSheetBehavior.this.setStateInternal(StateSettlingTracker.this.targetState);
                    }
                }
            };
        }

        void continueSettlingToState(int i) {
            if (BottomSheetBehavior.this.viewRef == null || BottomSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ViewCompat.postOnAnimation(BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = BottomSheetBehavior.access$1900(bottomSheetBehavior);
            this.fitToContents = BottomSheetBehavior.access$1400(bottomSheetBehavior);
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = BottomSheetBehavior.access$2000(bottomSheetBehavior);
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r2.computeCurrentVelocity(1000, r4.maximumVelocity);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return r4.velocityTracker.getYVelocity(r4.activePointerId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 5;
        r2 = r1 % 128;
        com.google.android.material.bottomsheet.BottomSheetBehavior.g = r2;
        r1 = r1 % 2;
        r2 = r2 + 41;
        com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float getYVelocity() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r2 = r1 + 3
            int r3 = r2 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            android.view.VelocityTracker r2 = r4.velocityTracker
            r3 = 59
            int r3 = r3 / 0
            if (r2 != 0) goto L32
            goto L1b
        L17:
            android.view.VelocityTracker r2 = r4.velocityTracker
            if (r2 != 0) goto L32
        L1b:
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r2
            int r1 = r1 % r0
            int r2 = r2 + 41
            int r1 = r2 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L2d
            r0 = 0
            return r0
        L2d:
            r0 = 0
            r0.hashCode()
            throw r0
        L32:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r1 = r4.maximumVelocity
            r2.computeCurrentVelocity(r0, r1)
            android.view.VelocityTracker r0 = r4.velocityTracker
            int r1 = r4.activePointerId
            float r0 = r0.getYVelocity(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.getYVelocity():float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r2.smoothSlideViewTo(r6, r6.getLeft(), r1) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void startSettling(android.view.View r6, int r7, boolean r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r2
            int r1 = r1 % r0
            int r1 = r5.getTopOffsetForState(r7)
            androidx.customview.widget.ViewDragHelper r2 = r5.viewDragHelper
            if (r2 == 0) goto L5e
            int r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.g
            int r3 = r3 + 107
            int r4 = r3 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.f798a = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 != 0) goto L5a
            r3 = 1
            r8 = r8 ^ r3
            if (r8 == 0) goto L2f
            int r8 = r6.getLeft()
            boolean r6 = r2.smoothSlideViewTo(r6, r8, r1)
            if (r6 == 0) goto L5e
            goto L42
        L2f:
            int r6 = r6.getLeft()
            boolean r6 = r2.settleCapturedViewAt(r6, r1)
            if (r6 == 0) goto L5e
            int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r6 = r6 + 17
            int r8 = r6 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r8
            int r6 = r6 % r0
        L42:
            r5.setStateInternal(r0)
            r5.updateDrawableForTargetState(r7, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$StateSettlingTracker r6 = r5.stateSettlingTracker
            r6.continueSettlingToState(r7)
            int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r6 = r6 + 53
            int r7 = r6 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L59
            return
        L59:
            throw r4
        L5a:
            r4.hashCode()
            throw r4
        L5e:
            r5.setStateInternal(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.startSettling(android.view.View, int, boolean):void");
    }

    private int getTopOffsetForState(int i) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 115;
        f798a = i4 % 128;
        int i5 = i4 % 2;
        if (i == 3) {
            return getExpandedOffset();
        }
        int i6 = i3 + 105;
        f798a = i6 % 128;
        if (i6 % 2 == 0 ? i == 4 : i == 5) {
            return this.collapsedOffset;
        }
        int i7 = i3 + 95;
        f798a = i7 % 128;
        int i8 = i7 % 2;
        if (i == 5) {
            return this.parentHeight;
        }
        int i9 = i3 + 107;
        f798a = i9 % 128;
        if (i9 % 2 == 0 ? i == 6 : i == 48) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: ".concat(String.valueOf(i)));
    }

    void dispatchOnSlide(int i) {
        int i2 = 2 % 2;
        int i3 = g + 99;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        V v = this.viewRef.get();
        if (v != null) {
            int i5 = f798a + 5;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                this.callbacks.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.callbacks.isEmpty()) {
                return;
            }
            int i6 = g + 33;
            f798a = i6 % 128;
            float fCalculateSlideOffsetWithTop = i6 % 2 != 0 ? calculateSlideOffsetWithTop(i) : calculateSlideOffsetWithTop(i);
            for (int i7 = 0; i7 < this.callbacks.size(); i7++) {
                this.callbacks.get(i7).onSlide(v, fCalculateSlideOffsetWithTop);
            }
        }
    }

    int getPeekHeightMin() {
        int i = 2 % 2;
        int i2 = g + 33;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        int i5 = this.peekHeightMin;
        int i6 = i3 + 5;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void disableShapeAnimations() {
        int i = 2 % 2;
        int i2 = g + 61;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.interpolatorAnimator = null;
        int i5 = i3 + 31;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private boolean canBeHiddenByDragging() {
        int i = 2 % 2;
        int i2 = g + 61;
        f798a = i2 % 128;
        int i3 = i2 % 2;
        if (!isHideable()) {
            return false;
        }
        int i4 = f798a + 37;
        g = i4 % 128;
        int i5 = i4 % 2;
        return isHideableWhenDragging();
    }

    public void setHideableInternal(boolean z) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 7;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        this.hideable = z;
        int i5 = i2 + 67;
        f798a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLastStableState() {
        int i = 2 % 2;
        int i2 = f798a + 57;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.lastStableState;
        int i6 = i3 + 109;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r4 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4;
        r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a + 97;
        com.google.android.material.bottomsheet.BottomSheetBehavior.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r4 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> from(V r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L55
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r1 = r1 + 65
            int r3 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L31
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            boolean r1 = r4 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            r3 = 8
            int r3 = r3 / 0
            if (r1 == 0) goto L4d
            goto L3b
        L31:
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            boolean r1 = r4 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r1 == 0) goto L4d
        L3b:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.f798a
            int r1 = r1 + 97
            int r3 = r1 % 128
            com.google.android.material.bottomsheet.BottomSheetBehavior.g = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L49
            return r4
        L49:
            r2.hashCode()
            throw r2
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with BottomSheetBehavior"
            r4.<init>(r0)
            throw r4
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            r4.<init>(r0)
            throw r4
        L5d:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.from(android.view.View):com.google.android.material.bottomsheet.BottomSheetBehavior");
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 37;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        this.updateImportantForAccessibilityOnSiblings = z;
        int i5 = i2 + 3;
        f798a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[PHI: r1 r2
  0x0035: PHI (r1v6 androidx.coordinatorlayout.widget.CoordinatorLayout) = (r1v5 androidx.coordinatorlayout.widget.CoordinatorLayout), (r1v11 androidx.coordinatorlayout.widget.CoordinatorLayout) binds: [B:12:0x0033, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r2v5 int) = (r2v4 int), (r2v7 int) binds: [B:12:0x0033, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    private void updateImportantForAccessibility(boolean z) {
        CoordinatorLayout coordinatorLayout;
        int childCount;
        int i = 2 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                int i2 = f798a + 91;
                g = i2 % 128;
                if (i2 % 2 == 0) {
                    coordinatorLayout = (CoordinatorLayout) parent;
                    childCount = coordinatorLayout.getChildCount();
                    int i3 = 8 / 0;
                    if (z) {
                        if (this.importantForAccessibilityMap == null) {
                            return;
                        } else {
                            this.importantForAccessibilityMap = new HashMap(childCount);
                        }
                    }
                } else {
                    coordinatorLayout = (CoordinatorLayout) parent;
                    childCount = coordinatorLayout.getChildCount();
                    if (z) {
                        if (this.importantForAccessibilityMap == null) {
                            return;
                        } else {
                            this.importantForAccessibilityMap = new HashMap(childCount);
                        }
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    int i5 = f798a + 41;
                    g = i5 % 128;
                    int i6 = i5 % 2;
                    View childAt = coordinatorLayout.getChildAt(i4);
                    if (childAt != this.viewRef.get()) {
                        int i7 = f798a;
                        int i8 = i7 + 79;
                        int i9 = i8 % 128;
                        g = i9;
                        int i10 = i8 % 2;
                        if (z) {
                            int i11 = i9 + 13;
                            f798a = i11 % 128;
                            int i12 = i11 % 2;
                            this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.updateImportantForAccessibilityOnSiblings) {
                                ViewCompat.setImportantForAccessibility(childAt, 4);
                            }
                        } else if (this.updateImportantForAccessibilityOnSiblings) {
                            int i13 = i7 + 97;
                            g = i13 % 128;
                            int i14 = i13 % 2;
                            Map<View, Integer> map = this.importantForAccessibilityMap;
                            if (map != null) {
                                int i15 = i7 + 121;
                                g = i15 % 128;
                                if (i15 % 2 == 0) {
                                    boolean zContainsKey = map.containsKey(childAt);
                                    int i16 = 9 / 0;
                                    if (zContainsKey) {
                                        ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                                    }
                                } else if (map.containsKey(childAt)) {
                                    ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                                }
                            }
                        }
                    }
                }
                if (z) {
                    if (!(!this.updateImportantForAccessibilityOnSiblings)) {
                        this.viewRef.get().sendAccessibilityEvent(8);
                        return;
                    }
                    return;
                }
                int i17 = f798a + 19;
                int i18 = i17 % 128;
                g = i18;
                int i19 = i17 % 2;
                this.importantForAccessibilityMap = null;
                int i20 = i18 + 91;
                f798a = i20 % 128;
                int i21 = i20 % 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x05d8, code lost:
    
        if (r4 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x05dd, code lost:
    
        if (r4 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x05df, code lost:
    
        r0 = r4.get();
        r3 = ((int[]) r3[0])[0];
        r4 = r3 * r3;
        r5 = -(1749803082 * r3);
        r6 = ((r4 | r5) << 1) - (r4 ^ r5);
        r3 = -(r3 * (-1851499876));
        r4 = (((r6 | r3) << 1) - (r3 ^ r6)) - (-2050179497);
        r3 = (r4 - (~((((r4 >> 29) - 15) / 8) + 1))) - 1;
        r4 = r4 >> 26;
        r5 = (((r4 | androidx.compose.runtime.ComposerKt.defaultsKey) << 1) - (r4 ^ androidx.compose.runtime.ComposerKt.defaultsKey)) / 64;
        r3 = -(r3 ^ ((r5 & 1) + (r5 | 1)));
        r4 = (r3 & 2) + (r3 | 2);
        r3 = r4 >> 18;
        r5 = (((r3 & (-32767)) + (r3 | (-32767))) / 16384) + 1;
        clearAccessibilityAction(r0, 876 / (((-((r5 ^ 1) + ((r5 & 1) << 1))) & r4) * 438));
        r25.accessibilityDelegateViewRef = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0644, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setAccessibilityDelegateView(android.view.View r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setAccessibilityDelegateView(android.view.View):void");
    }

    private void updateAccessibilityActions() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 49;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            int i5 = i2 + 83;
            f798a = i5 % 128;
            int i6 = i5 % 2;
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[PHI: r3
  0x002a: PHI (r3v1 int) = (r3v0 int), (r3v8 int) binds: [B:10:0x0028, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    private void updateAccessibilityActions(View view, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f798a + 55;
        int i5 = i4 % 128;
        g = i5;
        int i6 = i4 % 2;
        if (view != null) {
            int i7 = i5 + 119;
            f798a = i7 % 128;
            if (i7 % 2 != 0) {
                clearAccessibilityAction(view, i);
                i2 = 17;
                if (!this.fitToContents) {
                    if (this.state != 6) {
                        this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
                    }
                }
            } else {
                clearAccessibilityAction(view, i);
                i2 = 6;
                if (!this.fitToContents) {
                    if (this.state != 6) {
                        this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
                    }
                }
            }
            if (!(!this.hideable)) {
                int i8 = f798a + 5;
                g = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 93 / 0;
                    if (isHideableWhenDragging()) {
                        if (this.state != 5) {
                            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
                        }
                    }
                } else if (isHideableWhenDragging()) {
                    if (this.state != 5) {
                        replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
                    }
                }
            }
            int i10 = this.state;
            if (i10 == 3) {
                if (this.fitToContents) {
                    int i11 = f798a + 21;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    i2 = 4;
                }
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, i2);
                int i13 = f798a + 31;
                g = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i14 = g + 125;
            int i15 = i14 % 128;
            f798a = i15;
            if (i14 % 2 == 0 ? i10 != 4 : i10 != 2) {
                if (i10 != 6) {
                    return;
                }
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
                return;
            }
            if (this.fitToContents) {
                int i16 = i15 + 35;
                g = i16 % 128;
                i2 = i16 % 2 == 0 ? 5 : 3;
            }
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, i2);
        }
    }

    private void clearAccessibilityAction(View view, int i) {
        int i2 = 2 % 2;
        int i3 = f798a + 69;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (view != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            int i4 = this.expandHalfwayActionIds.get(i, -1);
            if (i4 != -1) {
                int i5 = f798a + 89;
                g = i5 % 128;
                if (i5 % 2 == 0) {
                    ViewCompat.removeAccessibilityAction(view, i4);
                    this.expandHalfwayActionIds.delete(i);
                    int i6 = 81 / 0;
                } else {
                    ViewCompat.removeAccessibilityAction(view, i4);
                    this.expandHalfwayActionIds.delete(i);
                }
            }
        }
        int i7 = f798a + 113;
        g = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private void replaceAccessibilityActionForState(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        int i2 = 2 % 2;
        int i3 = g + 109;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
        int i5 = g + 5;
        f798a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private int addAccessibilityActionForState(View view, int i, int i2) {
        int iAddAccessibilityAction;
        int i3 = 2 % 2;
        int i4 = f798a + 21;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            iAddAccessibilityAction = ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i2));
            int i5 = 52 / 0;
        } else {
            iAddAccessibilityAction = ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i2));
        }
        int i6 = g + 67;
        f798a = i6 % 128;
        int i7 = i6 % 2;
        return iAddAccessibilityAction;
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        int i2 = 2 % 2;
        AccessibilityViewCommand accessibilityViewCommand = new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
        int i3 = g + 27;
        f798a = i3 % 128;
        int i4 = i3 % 2;
        return accessibilityViewCommand;
    }

    public boolean isHideableWhenDragging() {
        int i = 2 % 2;
        int i2 = g + 115;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        int i = 2 % 2;
        int i2 = g + 105;
        int i3 = i2 % 128;
        f798a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6 = 2 % 2;
        int i7 = g + 97;
        f798a = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 115;
        g = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 55;
        g = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        int i = 2 % 2;
        int i2 = f798a;
        int i3 = i2 + 23;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        g = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        int i = 2 % 2;
        int i2 = g + 35;
        f798a = i2 % 128;
        return i2 % 2 == 0;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3308358857218093650L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    private static String $$g(int i, short s, int i2) {
        int i3 = i2 * 4;
        int i4 = i + 102;
        byte[] bArr = $$c;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i3;
            i5 = i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i5 + 1;
            i4 = (-bArr[i8]) + i4;
            i5 = i8;
            i6 = i7;
        }
    }
}
