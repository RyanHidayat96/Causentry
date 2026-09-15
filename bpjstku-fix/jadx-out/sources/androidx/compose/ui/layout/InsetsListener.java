package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010#R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R&\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0011018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H"}, d2 = {"Landroidx/compose/ui/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/core/view/WindowInsetsAnimationCompat;", "", "onPrepare", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "p1", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "updateInsetAnimationInfo", "(Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsCompat;", "", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "onEnd", "stopAnimationForRuler", "(Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;)V", "Landroid/view/View;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "updateInsets", "(Landroidx/core/view/WindowInsetsCompat;)V", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "composeView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "prepared", "Z", "", "runningAnimationMask", "I", "savedInsets", "Landroidx/core/view/WindowInsetsCompat;", "Landroidx/collection/ScatterMap;", "", "insetsValues", "Landroidx/collection/ScatterMap;", "getInsetsValues", "()Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MutableIntState;", "generation", "Landroidx/compose/runtime/MutableIntState;", "getGeneration", "()Landroidx/compose/runtime/MutableIntState;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "displayCutouts", "Landroidx/collection/MutableObjectList;", "getDisplayCutouts", "()Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/ui/layout/RectRulers;", "displayCutoutRulers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getDisplayCutoutRulers", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final AndroidComposeView composeView;
    private final SnapshotStateList<RectRulers> displayCutoutRulers;
    private final MutableObjectList<MutableState<Rect>> displayCutouts;
    private final MutableIntState generation;
    private final ScatterMap<Object, WindowWindowInsetsAnimationValues> insetsValues;
    private boolean prepared;
    private int runningAnimationMask;
    private WindowInsetsCompat savedInsets;

    public final AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public InsetsListener(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        MutableScatterMap mutableScatterMap = new MutableScatterMap(9);
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getCaptionBar(), new WindowWindowInsetsAnimationValues("caption bar"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getDisplayCutout(), new WindowWindowInsetsAnimationValues("display cutout"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getIme(), new WindowWindowInsetsAnimationValues("ime"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getMandatorySystemGestures(), new WindowWindowInsetsAnimationValues("mandatory system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getNavigationBars(), new WindowWindowInsetsAnimationValues("navigation bars"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getStatusBars(), new WindowWindowInsetsAnimationValues("status bars"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getSystemGestures(), new WindowWindowInsetsAnimationValues("system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getTappableElement(), new WindowWindowInsetsAnimationValues("tappable element"));
        mutableScatterMap.set(WindowInsetsRulers.INSTANCE.getWaterfall(), new WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = mutableScatterMap;
        this.generation = SnapshotIntStateKt.mutableIntStateOf(0);
        this.displayCutouts = new MutableObjectList<>(4);
        this.displayCutoutRulers = SnapshotStateKt.mutableStateListOf();
    }

    public final ScatterMap<Object, WindowWindowInsetsAnimationValues> getInsetsValues() {
        return this.insetsValues;
    }

    public final MutableIntState getGeneration() {
        return this.generation;
    }

    public final MutableObjectList<MutableState<Rect>> getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final SnapshotStateList<RectRulers> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat p0) {
        this.prepared = true;
        super.onPrepare(p0);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat p0, WindowInsetsAnimationCompat.BoundsCompat p1) {
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        this.prepared = false;
        this.savedInsets = null;
        if (p0.getDurationMillis() > 0 && windowInsetsCompat != null) {
            int typeMask = p0.getTypeMask();
            this.runningAnimationMask |= typeMask;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.AnimatableRulers.get(typeMask);
            if (windowInsetsRulers != null) {
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                Insets insets = windowInsetsCompat.getInsets(typeMask);
                long jM5745constructorimpl = ValueInsets.m5745constructorimpl(((long) insets.bottom) | (((long) insets.left) << 48) | (((long) insets.top) << 32) | (((long) insets.right) << 16));
                long current = windowWindowInsetsAnimationValues2.getCurrent();
                if (!ValueInsets.m5747equalsimpl0(jM5745constructorimpl, current)) {
                    windowWindowInsetsAnimationValues2.m5763setSourceValueInsetsYnlvx88(current);
                    windowWindowInsetsAnimationValues2.m5764setTargetValueInsetsYnlvx88(jM5745constructorimpl);
                    windowWindowInsetsAnimationValues2.setAnimating(true);
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues2, p0);
                    MutableIntState mutableIntState = this.generation;
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                    Snapshot.INSTANCE.sendApplyNotifications();
                }
            }
        }
        return super.onStart(p0, p1);
    }

    private final void updateInsetAnimationInfo(WindowWindowInsetsAnimationValues p0, WindowInsetsAnimationCompat p1) {
        p0.setFraction(p1.getInterpolatedFraction());
        p0.setAlpha(p1.getAlpha());
        p0.setDurationMillis(p1.getDurationMillis());
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat p0) {
        this.prepared = false;
        int typeMask = p0.getTypeMask();
        this.runningAnimationMask &= ~typeMask;
        this.savedInsets = null;
        WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.AnimatableRulers.get(typeMask);
        if (windowInsetsRulers != null) {
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
            Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            windowWindowInsetsAnimationValues2.setAlpha(1.0f);
            windowWindowInsetsAnimationValues2.setDurationMillis(0L);
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            stopAnimationForRuler(windowWindowInsetsAnimationValues2);
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.INSTANCE.sendApplyNotifications();
        }
        super.onEnd(p0);
    }

    private final void stopAnimationForRuler(WindowWindowInsetsAnimationValues p0) {
        p0.setAnimating(false);
        p0.m5763setSourceValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
        p0.m5764setTargetValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        if (this.prepared) {
            this.savedInsets = p1;
            if (Build.VERSION.SDK_INT == 30) {
                p0.post(this);
                return p1;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(p1);
        }
        return p1;
    }

    private final void updateInsets(WindowInsetsCompat p0) {
        boolean z;
        boolean z2;
        long jM5745constructorimpl;
        long jM5745constructorimpl2;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        int i;
        int i2;
        int i3;
        long[] jArr3;
        int[] iArr3;
        Object[] objArr3;
        int i4;
        long[] jArr4;
        int[] iArr4;
        Object[] objArr4;
        int i5;
        int i6;
        int i7;
        IntObjectMap intObjectMap = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        int[] iArr5 = intObjectMap.keys;
        Object[] objArr5 = intObjectMap.values;
        long[] jArr5 = intObjectMap.metadata;
        int length = jArr5.length - 2;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i8 = 8;
        if (length >= 0) {
            int i9 = 0;
            z = false;
            z2 = false;
            while (true) {
                long j3 = jArr5[i9];
                if ((((~j3) << c) & j3 & j2) != j2) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j3 & j) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr5[i12];
                            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) objArr5[i12];
                            Insets insets = p0.getInsets(i13);
                            i7 = i9;
                            long j4 = insets.left;
                            i6 = i10;
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            objArr4 = objArr5;
                            i5 = length;
                            long jM5745constructorimpl3 = ValueInsets.m5745constructorimpl((((long) insets.right) << 16) | (insets.top << 32) | (j4 << 48) | ((long) insets.bottom));
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                            Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                            if (!ValueInsets.m5747equalsimpl0(jM5745constructorimpl3, windowWindowInsetsAnimationValues2.getCurrent())) {
                                windowWindowInsetsAnimationValues2.m5761setCurrentYnlvx88(jM5745constructorimpl3);
                                if (ValueInsets.m5747equalsimpl0(jM5745constructorimpl3, ValueInsets_androidKt.getZeroValueInsets())) {
                                    z2 = true;
                                } else {
                                    z = true;
                                    z2 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            objArr4 = objArr5;
                            i5 = length;
                            i6 = i10;
                            i7 = i9;
                        }
                        j3 >>= 8;
                        i11++;
                        i8 = 8;
                        objArr5 = objArr4;
                        i9 = i7;
                        i10 = i6;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                        length = i5;
                        j = 255;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    objArr3 = objArr5;
                    int i14 = length;
                    int i15 = i9;
                    if (i10 != i8) {
                        break;
                    }
                    i4 = i15;
                    length = i14;
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    objArr3 = objArr5;
                    i4 = i9;
                }
                if (i4 == length) {
                    break;
                }
                i9 = i4 + 1;
                objArr5 = objArr3;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i8 = 8;
                j = 255;
                c = 7;
                j2 = -9187201950435737472L;
            }
        } else {
            z = false;
            z2 = false;
        }
        MutableIntObjectMap mutableIntObjectMap = WindowInsetsRulers_androidKt.AnimatableRulers;
        int[] iArr6 = mutableIntObjectMap.keys;
        Object[] objArr6 = mutableIntObjectMap.values;
        long[] jArr6 = mutableIntObjectMap.metadata;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j5 = jArr6[i16];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j5 & 255) < 128) {
                            int i19 = (i16 << 3) + i18;
                            int i20 = iArr6[i19];
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues3 = this.insetsValues.get((WindowInsetsRulers) objArr6[i19]);
                            Intrinsics.checkNotNull(windowWindowInsetsAnimationValues3);
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues4 = windowWindowInsetsAnimationValues3;
                            if (i20 != WindowInsetsCompat.Type.ime()) {
                                Insets insetsIgnoringVisibility = p0.getInsetsIgnoringVisibility(i20);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                objArr2 = objArr6;
                                i = length2;
                                i2 = i17;
                                i3 = i18;
                                long jM5745constructorimpl4 = ValueInsets.m5745constructorimpl((((long) insetsIgnoringVisibility.top) << 32) | (insetsIgnoringVisibility.left << 48) | (((long) insetsIgnoringVisibility.right) << 16) | ((long) insetsIgnoringVisibility.bottom));
                                if (!ValueInsets.m5747equalsimpl0(windowWindowInsetsAnimationValues4.getMaximum(), jM5745constructorimpl4)) {
                                    windowWindowInsetsAnimationValues4.m5762setMaximumYnlvx88(jM5745constructorimpl4);
                                    if (ValueInsets.m5747equalsimpl0(jM5745constructorimpl4, ValueInsets_androidKt.getZeroValueInsets())) {
                                        z2 = true;
                                    } else {
                                        z = true;
                                        z2 = true;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                objArr2 = objArr6;
                                i = length2;
                                i2 = i17;
                                i3 = i18;
                            }
                            windowWindowInsetsAnimationValues4.setVisible(p0.isVisible(i20));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                            objArr2 = objArr6;
                            i = length2;
                            i2 = i17;
                            i3 = i18;
                        }
                        j5 >>= 8;
                        i18 = i3 + 1;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                        objArr6 = objArr2;
                        length2 = i;
                        i17 = i2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    objArr = objArr6;
                    int i21 = length2;
                    if (i17 != 8) {
                        break;
                    } else {
                        length2 = i21;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                    objArr = objArr6;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr6 = jArr;
                iArr6 = iArr;
                objArr6 = objArr;
            }
        }
        DisplayCutoutCompat displayCutout = p0.getDisplayCutout();
        if (displayCutout == null) {
            jM5745constructorimpl = ValueInsets_androidKt.getZeroValueInsets();
        } else {
            Insets waterfallInsets = displayCutout.getWaterfallInsets();
            jM5745constructorimpl = ValueInsets.m5745constructorimpl((waterfallInsets.left << 48) | (waterfallInsets.top << 32) | (waterfallInsets.right << 16) | ((long) waterfallInsets.bottom));
        }
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues5 = this.insetsValues.get(WindowInsetsRulers.INSTANCE.getWaterfall());
        Intrinsics.checkNotNull(windowWindowInsetsAnimationValues5);
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues6 = windowWindowInsetsAnimationValues5;
        if (!ValueInsets.m5747equalsimpl0(windowWindowInsetsAnimationValues6.getCurrent(), jM5745constructorimpl)) {
            windowWindowInsetsAnimationValues6.m5761setCurrentYnlvx88(jM5745constructorimpl);
            windowWindowInsetsAnimationValues6.m5762setMaximumYnlvx88(jM5745constructorimpl);
            if (ValueInsets.m5747equalsimpl0(jM5745constructorimpl, ValueInsets_androidKt.getZeroValueInsets())) {
                z2 = true;
            } else {
                z = true;
                z2 = true;
            }
        }
        if (displayCutout == null) {
            jM5745constructorimpl2 = ValueInsets_androidKt.getZeroValueInsets();
        } else {
            jM5745constructorimpl2 = ValueInsets.m5745constructorimpl((((long) displayCutout.getSafeInsetTop()) << 32) | (((long) displayCutout.getSafeInsetLeft()) << 48) | (((long) displayCutout.getSafeInsetRight()) << 16) | ((long) displayCutout.getSafeInsetBottom()));
        }
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues7 = this.insetsValues.get(WindowInsetsRulers.INSTANCE.getDisplayCutout());
        Intrinsics.checkNotNull(windowWindowInsetsAnimationValues7);
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues8 = windowWindowInsetsAnimationValues7;
        if (!ValueInsets.m5747equalsimpl0(jM5745constructorimpl2, windowWindowInsetsAnimationValues8.getCurrent())) {
            windowWindowInsetsAnimationValues8.m5761setCurrentYnlvx88(jM5745constructorimpl2);
            windowWindowInsetsAnimationValues8.m5762setMaximumYnlvx88(jM5745constructorimpl2);
            if (ValueInsets.m5747equalsimpl0(jM5745constructorimpl2, ValueInsets_androidKt.getZeroValueInsets())) {
                z2 = true;
            } else {
                z = true;
                z2 = true;
            }
        }
        if (displayCutout == null) {
            if (this.displayCutouts.getSize() > 0) {
                this.displayCutouts.clear();
                this.displayCutoutRulers.clear();
                z2 = true;
            }
        } else {
            List<Rect> boundingRects = displayCutout.getBoundingRects();
            if (boundingRects.size() < this.displayCutouts.getSize()) {
                this.displayCutouts.removeRange(boundingRects.size(), this.displayCutouts.getSize());
                this.displayCutoutRulers.removeRange(boundingRects.size(), this.displayCutoutRulers.size());
                z2 = true;
            } else {
                int size = boundingRects.size();
                int size2 = this.displayCutouts.getSize();
                int i22 = 0;
                while (i22 < size - size2) {
                    MutableObjectList<MutableState<Rect>> mutableObjectList = this.displayCutouts;
                    mutableObjectList.add(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundingRects.get(mutableObjectList.getSize()), null, 2, null));
                    SnapshotStateList<RectRulers> snapshotStateList = this.displayCutoutRulers;
                    StringBuilder sb = new StringBuilder("display cutout rect ");
                    sb.append(this.displayCutouts.getSize());
                    snapshotStateList.add(RectRulersKt.RectRulers(sb.toString()));
                    i22++;
                    z2 = true;
                }
            }
            List<Rect> list = boundingRects;
            int size3 = list.size();
            for (int i23 = 0; i23 < size3; i23++) {
                Rect rect = boundingRects.get(i23);
                MutableState<Rect> mutableState = this.displayCutouts.get(i23);
                if (!Intrinsics.areEqual(mutableState.getValue(), rect)) {
                    mutableState.setValue(rect);
                    z2 = true;
                }
            }
            if (!list.isEmpty()) {
                z = true;
            }
        }
        if ((z || this.generation.getIntValue() != 0) && z2) {
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.INSTANCE.sendApplyNotifications();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                updateInsets(windowInsetsCompat);
                this.savedInsets = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        Object parent = p0.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            p0 = view;
        }
        ViewCompat.setOnApplyWindowInsetsListener(p0, this);
        ViewCompat.setWindowInsetsAnimationCallback(p0, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        Object parent = p0.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            p0 = view;
        }
        ViewCompat.setOnApplyWindowInsetsListener(p0, null);
        ViewCompat.setWindowInsetsAnimationCallback(p0, null);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat p0, List<WindowInsetsAnimationCompat> p1) {
        int size = p1.size();
        for (int i = 0; i < size; i++) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = p1.get(i);
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.AnimatableRulers.get(windowInsetsAnimationCompat.getTypeMask());
            if (windowInsetsRulers != null) {
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                if (windowWindowInsetsAnimationValues2.isAnimating()) {
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues2, windowInsetsAnimationCompat);
                }
            }
        }
        updateInsets(p0);
        return p0;
    }
}
