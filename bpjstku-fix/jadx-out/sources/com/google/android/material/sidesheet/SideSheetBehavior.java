package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.view.BackEventCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE;
    private static final int DEF_STYLE_RES;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ColorStateList backgroundTint;
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private WeakReference<View> coplanarSiblingViewRef;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    private VelocityTracker velocityTracker;
    private ViewDragHelper viewDragHelper;
    private WeakReference<V> viewRef;
    private static final byte[] $$c = {106, -93, -11, -74};
    private static final int $$f = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {67, -127, -109, 9, -26, 2, -7, -30, 4, 17, -47, 1, -17, -9, 4, -30, -7, -29, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 176;
    private static final byte[] $$a = {8, -36, 87, -65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 6;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.material.sidesheet.SideSheetBehavior.$$a
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r5 = 92 - r5
            int r6 = r6 * 3
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a(short, int, int, java.lang.Object[]):void");
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
    private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = 18 - r6
            int r5 = r5 * 38
            int r0 = r5 + 15
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r1 = com.google.android.material.sidesheet.SideSheetBehavior.$$d
            byte[] r0 = new byte[r0]
            int r5 = r5 + 14
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.d(int, byte, short, java.lang.Object[]):void");
    }

    static /* synthetic */ int access$000(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = sideSheetBehavior.state;
        if (i3 == 0) {
            int i5 = 78 / 0;
        }
        return i4;
    }

    static /* synthetic */ WeakReference access$100(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<V> weakReference = sideSheetBehavior.viewRef;
        int i5 = i2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return weakReference;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ SheetDelegate access$200(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        SheetDelegate sheetDelegate = sideSheetBehavior.sheetDelegate;
        int i5 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return sheetDelegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$300(SideSheetBehavior sideSheetBehavior, View view, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        sideSheetBehavior.dispatchOnSlide(view, i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean access$400(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = sideSheetBehavior.draggable;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int access$500(SideSheetBehavior sideSheetBehavior, View view, float f, float f2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iCalculateTargetStateOnViewReleased = sideSheetBehavior.calculateTargetStateOnViewReleased(view, f, f2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return iCalculateTargetStateOnViewReleased;
    }

    static /* synthetic */ void access$600(SideSheetBehavior sideSheetBehavior, View view, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        sideSheetBehavior.startSettling(view, i, z);
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ int access$700(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = sideSheetBehavior.childWidth;
        int i6 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ ViewDragHelper access$800(SideSheetBehavior sideSheetBehavior) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDragHelper viewDragHelper = sideSheetBehavior.viewDragHelper;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return viewDragHelper;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void addCallback(SheetCallback sheetCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        addCallback((SideSheetCallback) sheetCallback);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void removeCallback(SheetCallback sheetCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        removeCallback((SideSheetCallback) sheetCallback);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
        DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
        int i = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                return (SideSheetBehavior.access$000(SideSheetBehavior.this) == 1 || SideSheetBehavior.access$100(SideSheetBehavior.this) == null || SideSheetBehavior.access$100(SideSheetBehavior.this).get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.access$200(SideSheetBehavior.this).updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.access$300(SideSheetBehavior.this, view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.access$400(SideSheetBehavior.this)) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int iAccess$500 = SideSheetBehavior.access$500(SideSheetBehavior.this, view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                SideSheetBehavior.access$600(sideSheetBehavior, view, iAccess$500, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return MathUtils.clamp(i, SideSheetBehavior.access$200(SideSheetBehavior.this).getMinViewPositionHorizontal(), SideSheetBehavior.access$200(SideSheetBehavior.this).getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(View view) {
                return SideSheetBehavior.access$700(SideSheetBehavior.this) + SideSheetBehavior.this.getInnerMargin();
            }
        };
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                return (SideSheetBehavior.access$000(SideSheetBehavior.this) == 1 || SideSheetBehavior.access$100(SideSheetBehavior.this) == null || SideSheetBehavior.access$100(SideSheetBehavior.this).get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.access$200(SideSheetBehavior.this).updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.access$300(SideSheetBehavior.this, view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.access$400(SideSheetBehavior.this)) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int iAccess$500 = SideSheetBehavior.access$500(SideSheetBehavior.this, view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                SideSheetBehavior.access$600(sideSheetBehavior, view, iAccess$500, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return MathUtils.clamp(i, SideSheetBehavior.access$200(SideSheetBehavior.this).getMinViewPositionHorizontal(), SideSheetBehavior.access$200(SideSheetBehavior.this).getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(View view) {
                return SideSheetBehavior.access$700(SideSheetBehavior.this) + SideSheetBehavior.this.getInnerMargin();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
            TuitionPaymentFragmentbindingInflater1 = i % 128;
            int i2 = i % 2;
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
            int i3 = 2 % 2;
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setSheetEdge(V v, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0 ? GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity, i) != 3 : GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity, i) != 5) {
            i2 = 0;
        } else {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            i2 = 1;
        }
        setSheetEdge(i2);
    }

    private void setSheetEdge(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i) {
            if (i == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i == 1) {
                this.sheetDelegate = new LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            StringBuilder sb = new StringBuilder("Invalid sheet edge position value: ");
            sb.append(i);
            sb.append(". Must be 0 or 1.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private int getGravityFromSheetEdge() {
        int i = 2 % 2;
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null) {
            return 5;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            sheetDelegate.getSheetEdge();
            throw null;
        }
        if (sheetDelegate.getSheetEdge() != 0) {
            return 3;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return 5;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRed = (char) Color.red(i3);
                        int i9 = 1271 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                        int iBlue = Color.blue(i3) + 18;
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, i9, iBlue, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i13 = $11 + 7;
                $10 = i13 % 128;
                if (i13 % i11 == 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                        int iAxisFromString = 22 - MotionEvent.axisFromString("");
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, packedPositionChild, iAxisFromString, 387247676, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3225, 13 - KeyEvent.getDeadChar(0, 0), 2133916302, false, $$g((byte) 6, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i16 = $10 + 95;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 5 / 5;
                    }
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - TextUtils.lastIndexOf("", '0', 0)), View.combineMeasuredStates(0, 0) + 1705, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i11 = 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i18 = $11 + 25;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 1, cArr5, 1, i5);
                i = 0;
                System.arraycopy(cArr5, 0, cArr3, i5 >> i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i5 << i7);
            } else {
                i = 0;
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i19 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i19, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i19);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i5) {
                cArr7[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private boolean hasRightMargin() {
        int i = 2 % 2;
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams == null || ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin <= 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private boolean hasLeftMargin() {
        int i = 2 % 2;
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams == null || ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin <= 0) {
            return false;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CoordinatorLayout.LayoutParams getViewLayoutParams() {
        V v;
        int i = 2 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return null;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
            if (!(v.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                return null;
            }
        } else if (!(v.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) v.getLayoutParams();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return layoutParams;
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            materialShapeDrawable = this.materialShapeDrawable;
            int i3 = 76 / 0;
            if (materialShapeDrawable == null) {
                return;
            }
        } else {
            materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable == null) {
                return;
            }
        }
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void expand() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        setState(3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void hide() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        setState(5);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (SideSheetBehavior<?>) this);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r7
  0x0024: PHI (r7v2 com.google.android.material.sidesheet.SideSheetBehavior$SavedState) = 
  (r7v1 com.google.android.material.sidesheet.SideSheetBehavior$SavedState)
  (r7v5 com.google.android.material.sidesheet.SideSheetBehavior$SavedState)
 binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            savedState = (SavedState) parcelable;
            int i6 = 47 / 0;
            if (savedState.getSuperState() != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 != 0) {
                    super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
                    throw null;
                }
                super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i7 = 4 % 2;
                }
            }
        } else {
            savedState = (SavedState) parcelable;
            if (savedState.getSuperState() != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 != 0) {
                    super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
                    throw null;
                }
                super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i8 = 4 % 2;
                }
            }
        }
        if (savedState.state == 1 || savedState.state == 2) {
            i3 = 5;
        } else {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            i3 = savedState.state;
        }
        this.state = i3;
        this.lastStableState = i3;
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onAttachedToLayoutParams(layoutParams);
            this.viewRef = null;
            this.viewDragHelper = null;
            this.sideContainerBackHelper = null;
            throw null;
        }
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i8 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i8 + marginLayoutParams.rightMargin + i2, -1, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i9 = marginLayoutParams.topMargin;
        v.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i9 + marginLayoutParams.bottomMargin + i4, -1, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        int i10 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), BasicMeasure.EXACTLY);
            int i10 = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            if (i10 % 2 == 0) {
                return iMakeMeasureSpec;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 50 / 0;
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
        } else if (size != 0) {
            i3 = Math.min(size, i3);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
        return iMakeMeasureSpec2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                ViewCompat.getFitsSystemWindows(v);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!ViewCompat.getFitsSystemWindows(v)) {
                v.setFitsSystemWindows(true);
            }
        }
        int iCalculateInnerMargin = 0;
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            updateSheetVisibility(v);
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    ViewCompat.setImportantForAccessibility(v, 0);
                } else {
                    ViewCompat.setImportantForAccessibility(v, 1);
                }
            }
            ensureAccessibilityPaneTitleIsSet(v);
        }
        setSheetEdge(v, i);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            iCalculateInnerMargin = this.sheetDelegate.calculateInnerMargin(marginLayoutParams);
            int i5 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
        this.innerMargin = iCalculateInnerMargin;
        ViewCompat.offsetLeftAndRight(v, calculateCurrentOffset(outerEdge, v));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (!(!(sideSheetCallback instanceof SideSheetCallback))) {
                sideSheetCallback.onLayout(v);
            }
        }
        return true;
    }

    private void updateSheetVisibility(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = (i2 % 2 != 0 ? this.state != 5 : this.state != 3) ? 0 : 4;
        if (view.getVisibility() != i3) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            view.setVisibility(i3);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        int i = 2 % 2;
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        if (i3 % 2 == 0) {
            int i5 = 35 / 0;
            if (this.coplanarSiblingViewRef == null) {
                int i6 = i4 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                i = this.coplanarSiblingViewId;
                if (i != -1 && (viewFindViewById = coordinatorLayout.findViewById(i)) != null) {
                    this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
                }
            }
        } else if (this.coplanarSiblingViewRef == null) {
            int i8 = i4 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            i = this.coplanarSiblingViewId;
            if (i != -1) {
                this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
            }
        }
        int i10 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
    }

    int getChildWidth() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 121;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        if (i3 % 2 != 0) {
            i = this.childWidth;
            int i5 = 21 / 0;
        } else {
            i = this.childWidth;
        }
        int i6 = i4 + 73;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    int getParentWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.parentWidth;
        int i6 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    int getParentInnerEdge() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.parentInnerEdge;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    int getInnerMargin() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.innerMargin;
        int i6 = i3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    private int calculateCurrentOffset(int i, V v) {
        int i2 = 2 % 2;
        int i3 = this.state;
        if (i3 != 1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = i4 + 25;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0 ? i3 != 2 : i3 != 4) {
                if (i3 == 3) {
                    return 0;
                }
                int i6 = i4 + 77;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                if (i6 % 2 != 0 ? i3 == 5 : i3 == 4) {
                    return this.sheetDelegate.getHiddenOffset();
                }
                StringBuilder sb = new StringBuilder("Unexpected value: ");
                sb.append(this.state);
                throw new IllegalStateException(sb.toString());
            }
        }
        int outerEdge = i - this.sheetDelegate.getOuterEdge(v);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        return outerEdge;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i = 2 % 2;
        if (!shouldInterceptTouchEvent(v)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                this.velocityTracker = VelocityTracker.obtain();
                int i5 = 34 / 0;
            } else {
                this.velocityTracker = VelocityTracker.obtain();
            }
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
            int i6 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 != 0) {
                this.ignoreEvents = false;
                return true;
            }
            this.ignoreEvents = false;
            return false;
        }
        if (!this.ignoreEvents) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 57;
            int i10 = i9 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
            Object obj = null;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            ViewDragHelper viewDragHelper = this.viewDragHelper;
            if (viewDragHelper != null) {
                int i11 = i10 + 5;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                if (i11 % 2 == 0) {
                    viewDragHelper.shouldInterceptTouchEvent(motionEvent);
                    obj.hashCode();
                    throw null;
                }
                if (viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean shouldInterceptTouchEvent(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if ((!v.isShown() && ViewCompat.getAccessibilityPaneTitle(v) == null) || !this.draggable) {
            return false;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            v.isShown();
            throw null;
        }
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
            int i5 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
        int i = 2 % 2;
        if (!shouldHandleDraggingWithHelper()) {
            return false;
        }
        if (calculateDragDistance(this.initialX, motionEvent.getX()) > this.viewDragHelper.getTouchSlop()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private float calculateDragDistance(float f, float f2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        float fAbs = Math.abs(i2 % 2 == 0 ? f / f2 : f - f2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return fAbs;
    }

    public int getExpandedOffset() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int expandedOffset = this.sheetDelegate.getExpandedOffset();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return expandedOffset;
    }

    public void setDraggable(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.draggable = z;
        int i5 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isDraggable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.draggable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setHideFriction(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.hideFriction = f;
        int i5 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
    }

    public float getHideFriction() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        float f = this.hideFriction;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return f;
    }

    public void addCallback(SideSheetCallback sideSheetCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.callbacks.add(sideSheetCallback);
            int i3 = 77 / 0;
        } else {
            this.callbacks.add(sideSheetCallback);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    public void removeCallback(SideSheetCallback sideSheetCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.callbacks.remove(sideSheetCallback);
            obj.hashCode();
            throw null;
        }
        this.callbacks.remove(sideSheetCallback);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        String str;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (i != 1) {
            int i6 = i3 + 47;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0 ? i != 2 : i != 4) {
                WeakReference<V> weakReference = this.viewRef;
                if (weakReference == null || weakReference.get() == null) {
                    setStateInternal(i);
                    return;
                } else {
                    runAfterLayout(this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m7891xc0f1d0a9(i);
                        }
                    });
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 V extends android.view.View) = (r1v6 V extends android.view.View), (r1v11 V extends android.view.View) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: lambda$setState$0$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m7891xc0f1d0a9(int i) {
        V v;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            v = this.viewRef.get();
            int i4 = 37 / 0;
            if (v != null) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                startSettling(v, i, false);
            }
        } else {
            v = this.viewRef.get();
            if (v != null) {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                startSettling(v, i, false);
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        int i10 = i9 % 2;
    }

    private void runAfterLayout(V v, Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!isLayingOut(v)) {
            runnable.run();
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            v.post(runnable);
        } else {
            v.post(runnable);
            int i5 = 8 / 0;
        }
    }

    private boolean isLayingOut(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.state;
        int i6 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    void setStateInternal(int i) {
        V v;
        int i2 = 2 % 2;
        if (this.state != i) {
            this.state = i;
            if (i == 3 || i == 5) {
                this.lastStableState = i;
                int i3 = TuitionPaymentFragmentbindingInflater1 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && (v = weakReference.get()) != null) {
                updateSheetVisibility(v);
                Iterator<SideSheetCallback> it = this.callbacks.iterator();
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    it.next().onStateChanged(v, i);
                }
                updateAccessibilityActions();
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        int i10 = i9 % 2;
    }

    private void resetVelocity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            int i5 = i2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            } else {
                velocityTracker.recycle();
                this.velocityTracker = null;
                throw null;
            }
        }
    }

    boolean shouldHide(View view, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (i3 != 0) {
            return sheetDelegate.shouldHide(view, f);
        }
        sheetDelegate.shouldHide(view, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private boolean shouldHandleDraggingWithHelper() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
            if (this.viewDragHelper != null) {
                int i5 = i2 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                if (!this.draggable || this.state == 1) {
                    return true;
                }
            }
        } else if (this.viewDragHelper != null) {
            int i7 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            if (!this.draggable) {
            }
            return true;
        }
        return false;
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList == null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                this.materialShapeDrawable.setFillColor(colorStateList);
            } else {
                this.materialShapeDrawable.setFillColor(colorStateList);
                throw null;
            }
        }
    }

    float getXVelocity() {
        int i = 2 % 2;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
            float xVelocity = this.velocityTracker.getXVelocity();
            int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return xVelocity;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        return i4 % 2 != 0 ? 1.0f : 0.0f;
    }

    private void startSettling(View view, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            isSettling(view, i, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isSettling(view, i, z)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                setStateInternal(5);
                this.stateSettlingTracker.continueSettlingToState(i);
                return;
            } else {
                setStateInternal(2);
                this.stateSettlingTracker.continueSettlingToState(i);
                return;
            }
        }
        setStateInternal(i);
    }

    private boolean isSettling(View view, int i, boolean z) {
        int i2 = 2 % 2;
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i);
        ViewDragHelper viewDragHelper = getViewDragHelper();
        if (viewDragHelper == null) {
            return false;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z) {
            if (!viewDragHelper.settleCapturedViewAt(outerEdgeOffsetForState, view.getTop())) {
                return false;
            }
        } else if (!viewDragHelper.smoothSlideViewTo(view, outerEdgeOffsetForState, view.getTop())) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    int getOuterEdgeOffsetForState(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0 ? i == 3 : i == 2) {
            return getExpandedOffset();
        }
        int i5 = i3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0 ? i == 5 : i == 2) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: ".concat(String.valueOf(i)));
    }

    ViewDragHelper getViewDragHelper() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        int i4 = i2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return viewDragHelper;
    }

    private int calculateTargetStateOnViewReleased(View view, float f, float f2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (isExpandingOutwards(f)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return 3;
        }
        if (shouldHide(view, f)) {
            return (this.sheetDelegate.isSwipeSignificant(f, f2) || this.sheetDelegate.isReleasedCloseToInnerEdge(view)) ? 5 : 3;
        }
        if (f == 0.0f || !SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) >= Math.abs(left - this.sheetDelegate.getHiddenOffset())) {
                return 5;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            return 3;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
        return 5;
    }

    private boolean isExpandingOutwards(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsExpandingOutwards = this.sheetDelegate.isExpandingOutwards(f);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return zIsExpandingOutwards;
    }

    private void dispatchOnSlide(View view, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.callbacks.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.callbacks.isEmpty())) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, fCalculateSlideOffset);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void setCoplanarSiblingViewId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.coplanarSiblingViewId = i;
            clearCoplanarSiblingView();
            obj.hashCode();
            throw null;
        }
        this.coplanarSiblingViewId = i;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i != -1) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                if (ViewCompat.isLaidOut(v)) {
                    v.requestLayout();
                }
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void setCoplanarSiblingView(View view) {
        int i = 2 % 2;
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                ViewCompat.isLaidOut(weakReference.get());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            V v = weakReference.get();
            if (ViewCompat.isLaidOut(v)) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                v.requestLayout();
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public View getCoplanarSiblingView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        Object obj = null;
        if (weakReference == null) {
            return null;
        }
        int i5 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        View view = weakReference.get();
        if (i6 != 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    private void clearCoplanarSiblingView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getLastStableState() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lastStableState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7892xe5f914a3();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        StateSettlingTracker() {
        }

        /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-sidesheet-SideSheetBehavior$StateSettlingTracker, reason: not valid java name */
        /* synthetic */ void m7892xe5f914a3() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.access$800(SideSheetBehavior.this) != null && SideSheetBehavior.access$800(SideSheetBehavior.this).continueSettling(true)) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.access$000(SideSheetBehavior.this) == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        void continueSettlingToState(int i) {
            if (SideSheetBehavior.access$100(SideSheetBehavior.this) == null || SideSheetBehavior.access$100(SideSheetBehavior.this).get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ViewCompat.postOnAnimation((View) SideSheetBehavior.access$100(SideSheetBehavior.this).get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = SideSheetBehavior.access$000(sideSheetBehavior);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01f6  */
    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(BackEventCompat backEventCompat) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 89, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, offsetAfter, longPressTimeout, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 189, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int i2 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr[7], bArr[28], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, offsetBefore, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                int iRgb = Color.rgb(0, 0, 0) + 16777226;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b3, b3, bArr2[28], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iNormalizeMetaState, iRgb, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i3 = ~((int) Runtime.getRuntime().freeMemory());
            int i4 = ~(711526822 | i3);
            int i5 = (((1602694828 + ((i4 | (-671216594)) * 764)) + (((~(i3 | (-671216594))) | 671154560) * (-1528))) + (((-40434296) | i4) * 764)) - 1568229825;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 181, 11}, false, new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    int i11 = i10 % 2;
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
            c(new int[]{81, 16, 0, 6}, false, new byte[]{1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 42, 13}, true, null, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1568229825};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[21];
                byte b5 = bArr3[11];
                Object[] objArr13 = new Object[1];
                d(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[11];
                byte b7 = bArr3[21];
                Object[] objArr14 = new Object[1];
                d(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iBlue = Color.blue(0) + 876;
                        int defaultSize = View.getDefaultSize(0, 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b8, b8, bArr4[28], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iBlue, defaultSize, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 189, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                            int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a((byte) 52, bArr5[7], bArr5[28], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, doubleTapTimeout, keyRepeatTimeout, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int offsetAfter2 = 876 - TextUtils.getOffsetAfter("", 0);
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 10;
                            byte b9 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            a((byte) 89, b9, b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, offsetAfter2, iNormalizeMetaState2, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i15 = ~((-449348766) | (~iMyPid));
            int i16 = i14 + (((-451538654) | i15 | (~(449348765 | iMyPid))) * (-338)) + 2039067832 + (((~(iMyPid | (-2189889))) | i15) * 338);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
        } else {
            int[] iArr = new int[i13];
            int i19 = i13 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = 1153572500 + (((~((-665746527) | iIdentityHashCode)) | 44570710 | (~(625436297 | iIdentityHashCode))) * (-880));
            int i22 = (~((-665746527) | (~iIdentityHashCode))) | (-625436298);
            int i23 = ~(iIdentityHashCode | 665746526);
            int i24 = i20 + i21 + ((i22 | i23) * (-880)) + (i23 * 880);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr22[1])[0] = i26 ^ (i26 << 5);
        }
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r5 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1.updateBackProgress(r5, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 71;
        com.google.android.material.sidesheet.SideSheetBehavior.TuitionPaymentFragmentbindingInflater1 = r2 % 128;
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
            int r1 = com.google.android.material.sidesheet.SideSheetBehavior.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.google.android.material.sidesheet.SideSheetBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = r4.sideContainerBackHelper
            r3 = 29
            int r3 = r3 / 0
            if (r1 != 0) goto L28
            goto L1b
        L17:
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = r4.sideContainerBackHelper
            if (r1 != 0) goto L28
        L1b:
            int r2 = r2 + 71
            int r5 = r2 % 128
            com.google.android.material.sidesheet.SideSheetBehavior.TuitionPaymentFragmentbindingInflater1 = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            r5 = 5
            int r5 = r5 / 0
        L27:
            return
        L28:
            int r0 = r4.getGravityFromSheetEdge()
            r1.updateBackProgress(r5, r0)
            r4.updateCoplanarSiblingBackProgress()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.updateBackProgress(androidx.activity.BackEventCompat):void");
    }

    private void updateCoplanarSiblingBackProgress() {
        WeakReference<V> weakReference;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            weakReference = this.viewRef;
            int i3 = 3 / 0;
            if (weakReference == null) {
                return;
            }
        } else {
            weakReference = this.viewRef;
            if (weakReference == null) {
                return;
            }
        }
        if (weakReference.get() != null) {
            V v = this.viewRef.get();
            View coplanarSiblingView = getCoplanarSiblingView();
            if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
                return;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth % v.getScaleX()) / this.innerMargin));
            } else {
                this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth * v.getScaleX()) + this.innerMargin));
            }
            coplanarSiblingView.requestLayout();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        int i = 2 % 2;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 34 : Build.VERSION.SDK_INT >= 80) {
                this.sideContainerBackHelper.finishBackProgress(backEventCompatOnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SideSheetBehavior.this.setStateInternal(5);
                        if (SideSheetBehavior.access$100(SideSheetBehavior.this) == null || SideSheetBehavior.access$100(SideSheetBehavior.this).get() == null) {
                            return;
                        }
                        ((View) SideSheetBehavior.access$100(SideSheetBehavior.this).get()).requestLayout();
                    }
                }, getCoplanarFinishAnimatorUpdateListener());
                int i3 = TuitionPaymentFragmentbindingInflater1 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 46 / 0;
                    return;
                }
                return;
            }
        }
        setState(5);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        int i = 2 % 2;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 23;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams();
        if (marginLayoutParams != null) {
            final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
            return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.m7890xc3af8fb4(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
                }
            };
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 67 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: lambda$getCoplanarFinishAnimatorUpdateListener$1$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m7890xc3af8fb4(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i, 0, valueAnimator.getAnimatedFraction()));
        } else {
            this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i, 0, valueAnimator.getAnimatedFraction()));
        }
        view.requestLayout();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper != null) {
            materialSideContainerBackHelper.cancelBackProgress();
            return;
        }
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    MaterialSideContainerBackHelper getBackHelper() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 53;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        int i5 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return materialSideContainerBackHelper;
    }

    public static <V extends View> SideSheetBehavior<V> from(V v) {
        SideSheetBehavior<V> sideSheetBehavior;
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof SideSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            sideSheetBehavior = (SideSheetBehavior) behavior;
            int i4 = 68 / 0;
        } else {
            sideSheetBehavior = (SideSheetBehavior) behavior;
        }
        int i5 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return sideSheetBehavior;
    }

    private void updateAccessibilityActions() {
        V v;
        int i = 2 % 2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ViewCompat.removeAccessibilityAction(v, 262144);
        ViewCompat.removeAccessibilityAction(v, 1048576);
        if (this.state != 5) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 2);
            } else {
                replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
        }
        if (this.state != 3) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND;
            if (i6 != 0) {
                replaceAccessibilityActionForState(v, accessibilityActionCompat, 4);
            } else {
                replaceAccessibilityActionForState(v, accessibilityActionCompat, 3);
            }
        }
    }

    private void replaceAccessibilityActionForState(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        int i2 = 2 % 2;
        AccessibilityViewCommand accessibilityViewCommand = new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return this.f$0.m7889x564aa398(i, view, commandArguments);
            }
        };
        int i3 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return accessibilityViewCommand;
    }

    /* JADX INFO: renamed from: lambda$createAccessibilityViewCommandForState$2$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ boolean m7889x564aa398(int i, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        setState(i);
        return i4 == 0;
    }

    float getHideThreshold() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return 0.5f;
    }

    int getSignificantVelocityThreshold() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2 != 0 ? 12022 : 500;
        int i5 = i3 + 87;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean shouldSkipSmoothAnimation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59802, 59438, 59432, 59438, 59429, 59426, 59434, 59411, 59411, 59435, 59432, 59430, 59424, 59427, 59437, 59705, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59760, 59398, 59438, 59432, 59412, 59408, 59420, 59412, 59432, 59434, 59432, 59414, 59434, 59427, 59436, 59435, 59413, 59437, 59682, 59757, 59773, 59768, 59751, 59746, 59744, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59750, 59801, 59798, 59776, 59769, 59816, 59797, 59800, 59797, 59795, 59780, 59781, 59800, 59780, 59781, 59794};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r6 = 105 - r6
            byte[] r0 = com.google.android.material.sidesheet.SideSheetBehavior.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.$$g(byte, short, byte):java.lang.String");
    }
}
