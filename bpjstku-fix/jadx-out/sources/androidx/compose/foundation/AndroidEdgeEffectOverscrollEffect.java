package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001b\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\nJ\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u001a\u0010$\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001fJ\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010*\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020-H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0019\u00101\u001a\u00020-8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010;\u001a\u00020'8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u0010\n\u001a\u0004\b=\u0010,\"\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010,R\u001b\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010E\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020\b0G8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "p0", "Landroidx/compose/foundation/OverscrollConfiguration;", "p1", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "", "animateToRelease", "()V", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "Lkotlin/Function1;", "p2", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "displacement-F1C5BW0$foundation_release", "()J", "displacement", "invalidateOverscroll$foundation_release", "", "pullBottom-k-4lQ0M", "(J)F", "pullBottom", "pullLeft-k-4lQ0M", "pullLeft", "pullRight-k-4lQ0M", "pullRight", "pullTop-k-4lQ0M", "pullTop", "", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "stopOverscrollAnimation", "()Z", "Landroidx/compose/ui/geometry/Size;", "updateSize-uvyYCjk$foundation_release", "(J)V", "updateSize", "containerSize", "J", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/ui/Modifier;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "isInProgress", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "scrollCycleInProgress"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<Unit> redrawSignal;
    private boolean scrollCycleInProgress;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        Modifier drawGlowOverscrollModifier;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m4272toArgb8_81llA(overscrollConfiguration.getGlowColor()));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m4052getZeroNHjbRc();
        Modifier modifierThen = Modifier.INSTANCE.then(new SuspendPointerInputElement(Unit.INSTANCE, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), 6, null));
        if (Build.VERSION.SDK_INT >= 31) {
            drawGlowOverscrollModifier = new DrawStretchOverscrollModifier(this, edgeEffectWrapper, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(this.this$0);
                }

                {
                    super(1);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        } else {
            drawGlowOverscrollModifier = new DrawGlowOverscrollModifier(this, edgeEffectWrapper, overscrollConfiguration, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(this.this$0);
                }

                {
                    super(1);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        }
        this.effectModifier = modifierThen.then(drawGlowOverscrollModifier);
    }

    public final MutableState<Unit> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    public final long mo539applyToScrollRhakbz0(long p0, int p1, Function1<? super Offset, Offset> p2) {
        float fM533pullBottomk4lQ0M;
        boolean z;
        boolean z2;
        if (Size.m4045isEmptyimpl(this.containerSize)) {
            return p2.invoke(Offset.m3963boximpl(p0)).m3984unboximpl();
        }
        boolean z3 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        float fM535pullRightk4lQ0M = 0.0f;
        if (Offset.m3975getYimpl(p0) == 0.0f) {
            fM533pullBottomk4lQ0M = 0.0f;
        } else if (this.edgeEffectWrapper.isTopStretched()) {
            fM533pullBottomk4lQ0M = m536pullTopk4lQ0M(p0);
            if (!this.edgeEffectWrapper.isTopStretched()) {
                this.edgeEffectWrapper.getOrCreateTopEffect().onRelease();
            }
        } else if (this.edgeEffectWrapper.isBottomStretched()) {
            fM533pullBottomk4lQ0M = m533pullBottomk4lQ0M(p0);
            if (!this.edgeEffectWrapper.isBottomStretched()) {
                this.edgeEffectWrapper.getOrCreateBottomEffect().onRelease();
            }
        } else {
            fM533pullBottomk4lQ0M = 0.0f;
        }
        if (Offset.m3974getXimpl(p0) != 0.0f) {
            if (this.edgeEffectWrapper.isLeftStretched()) {
                fM535pullRightk4lQ0M = m534pullLeftk4lQ0M(p0);
                if (!this.edgeEffectWrapper.isLeftStretched()) {
                    this.edgeEffectWrapper.getOrCreateLeftEffect().onRelease();
                }
            } else if (this.edgeEffectWrapper.isRightStretched()) {
                fM535pullRightk4lQ0M = m535pullRightk4lQ0M(p0);
                if (!this.edgeEffectWrapper.isRightStretched()) {
                    this.edgeEffectWrapper.getOrCreateRightEffect().onRelease();
                }
            }
        }
        long jOffset = OffsetKt.Offset(fM535pullRightk4lQ0M, fM533pullBottomk4lQ0M);
        if (!Offset.m3971equalsimpl0(jOffset, Offset.INSTANCE.m3990getZeroF1C5BW0())) {
            invalidateOverscroll$foundation_release();
        }
        long jM3978minusMKHz9U = Offset.m3978minusMKHz9U(p0, jOffset);
        long jM3984unboximpl = p2.invoke(Offset.m3963boximpl(jM3978minusMKHz9U)).m3984unboximpl();
        long jM3978minusMKHz9U2 = Offset.m3978minusMKHz9U(jM3978minusMKHz9U, jM3984unboximpl);
        if (NestedScrollSource.m5389equalsimpl0(p1, NestedScrollSource.INSTANCE.m5401getUserInputWNlRxjI())) {
            if (Offset.m3974getXimpl(jM3978minusMKHz9U2) > 0.5f) {
                m534pullLeftk4lQ0M(jM3978minusMKHz9U2);
            } else {
                if (Offset.m3974getXimpl(jM3978minusMKHz9U2) < -0.5f) {
                    m535pullRightk4lQ0M(jM3978minusMKHz9U2);
                } else {
                    z = false;
                }
                if (Offset.m3975getYimpl(jM3978minusMKHz9U2) > 0.5f) {
                    m536pullTopk4lQ0M(jM3978minusMKHz9U2);
                } else {
                    if (Offset.m3975getYimpl(jM3978minusMKHz9U2) < -0.5f) {
                        m533pullBottomk4lQ0M(jM3978minusMKHz9U2);
                    } else {
                        z2 = false;
                    }
                    if (!z && !z2) {
                        z3 = false;
                    }
                }
                z2 = true;
                if (!z) {
                    z3 = false;
                }
            }
            z = true;
            if (Offset.m3975getYimpl(jM3978minusMKHz9U2) > 0.5f) {
                m536pullTopk4lQ0M(jM3978minusMKHz9U2);
            } else {
                if (Offset.m3975getYimpl(jM3978minusMKHz9U2) < -0.5f) {
                    m533pullBottomk4lQ0M(jM3978minusMKHz9U2);
                } else {
                    z2 = false;
                }
                if (!z) {
                    z3 = false;
                }
            }
            z2 = true;
            if (!z) {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (m537releaseOppositeOverscrollk4lQ0M(p0) || z3) {
            invalidateOverscroll$foundation_release();
        }
        return Offset.m3979plusMKHz9U(jOffset, jM3984unboximpl);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:62:0x0191  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r13.invoke(r11, r0) != r1) goto L20;
     */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo538applyToFlingBMRW4eQ(long r11, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo538applyToFlingBMRW4eQ(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        if (this.edgeEffectWrapper.isLeftStretched()) {
            m534pullLeftk4lQ0M(Offset.INSTANCE.m3990getZeroF1C5BW0());
            z = true;
        } else {
            z = false;
        }
        if (this.edgeEffectWrapper.isRightStretched()) {
            m535pullRightk4lQ0M(Offset.INSTANCE.m3990getZeroF1C5BW0());
            z = true;
        }
        if (this.edgeEffectWrapper.isTopStretched()) {
            m536pullTopk4lQ0M(Offset.INSTANCE.m3990getZeroF1C5BW0());
            z = true;
        }
        if (!this.edgeEffectWrapper.isBottomStretched()) {
            return z;
        }
        m533pullBottomk4lQ0M(Offset.INSTANCE.m3990getZeroF1C5BW0());
        return true;
    }

    /* JADX INFO: renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m541updateSizeuvyYCjk$foundation_release(long p0) {
        boolean zM4039equalsimpl0 = Size.m4039equalsimpl0(this.containerSize, Size.INSTANCE.m4052getZeroNHjbRc());
        boolean zM4039equalsimpl1 = Size.m4039equalsimpl0(p0, this.containerSize);
        this.containerSize = p0;
        if (!zM4039equalsimpl1) {
            this.edgeEffectWrapper.m612setSizeozmzZPI(IntSizeKt.IntSize(MathKt.roundToInt(Size.m4043getWidthimpl(p0)), MathKt.roundToInt(Size.m4040getHeightimpl(p0))));
        }
        if (zM4039equalsimpl0 || zM4039equalsimpl1) {
            return;
        }
        invalidateOverscroll$foundation_release();
        animateToRelease();
    }

    /* JADX INFO: renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m540displacementF1C5BW0$foundation_release() {
        Offset offset = this.pointerPosition;
        long jM3984unboximpl = offset != null ? offset.m3984unboximpl() : SizeKt.m4053getCenteruvyYCjk(this.containerSize);
        return OffsetKt.Offset(Offset.m3974getXimpl(jM3984unboximpl) / Size.m4043getWidthimpl(this.containerSize), Offset.m3975getYimpl(jM3984unboximpl) / Size.m4040getHeightimpl(this.containerSize));
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    private final void animateToRelease() {
        boolean zIsFinished;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() || zIsFinished) {
                z = true;
            }
        } else {
            z = zIsFinished;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() && !z) {
                return;
            }
        } else if (!z) {
            return;
        }
        invalidateOverscroll$foundation_release();
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m537releaseOppositeOverscrollk4lQ0M(long p0) {
        boolean z;
        if (!this.edgeEffectWrapper.isLeftAnimating() || Offset.m3974getXimpl(p0) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Offset.m3974getXimpl(p0));
            z = !this.edgeEffectWrapper.isLeftAnimating();
        }
        if (this.edgeEffectWrapper.isRightAnimating() && Offset.m3974getXimpl(p0) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Offset.m3974getXimpl(p0));
            z = z || !this.edgeEffectWrapper.isRightAnimating();
        }
        if (this.edgeEffectWrapper.isTopAnimating() && Offset.m3975getYimpl(p0) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Offset.m3975getYimpl(p0));
            z = z || !this.edgeEffectWrapper.isTopAnimating();
        }
        if (!this.edgeEffectWrapper.isBottomAnimating() || Offset.m3975getYimpl(p0) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Offset.m3975getYimpl(p0));
        return z || !this.edgeEffectWrapper.isBottomAnimating();
    }

    /* JADX INFO: renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m536pullTopk4lQ0M(long p0) {
        float fM3974getXimpl = Offset.m3974getXimpl(m540displacementF1C5BW0$foundation_release());
        float fM3975getYimpl = Offset.m3975getYimpl(p0) / Size.m4040getHeightimpl(this.containerSize);
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateTopEffect, fM3975getYimpl, fM3974getXimpl) * Size.m4040getHeightimpl(this.containerSize) : Offset.m3975getYimpl(p0);
    }

    /* JADX INFO: renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m533pullBottomk4lQ0M(long p0) {
        float fM3974getXimpl = Offset.m3974getXimpl(m540displacementF1C5BW0$foundation_release());
        float fM3975getYimpl = Offset.m3975getYimpl(p0) / Size.m4040getHeightimpl(this.containerSize);
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateBottomEffect, -fM3975getYimpl, 1.0f - fM3974getXimpl)) * Size.m4040getHeightimpl(this.containerSize) : Offset.m3975getYimpl(p0);
    }

    /* JADX INFO: renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m534pullLeftk4lQ0M(long p0) {
        float fM3975getYimpl = Offset.m3975getYimpl(m540displacementF1C5BW0$foundation_release());
        float fM3974getXimpl = Offset.m3974getXimpl(p0) / Size.m4043getWidthimpl(this.containerSize);
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateLeftEffect, fM3974getXimpl, 1.0f - fM3975getYimpl) * Size.m4043getWidthimpl(this.containerSize) : Offset.m3974getXimpl(p0);
    }

    /* JADX INFO: renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m535pullRightk4lQ0M(long p0) {
        float fM3975getYimpl = Offset.m3975getYimpl(m540displacementF1C5BW0$foundation_release());
        float fM3974getXimpl = Offset.m3974getXimpl(p0) / Size.m4043getWidthimpl(this.containerSize);
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateRightEffect, -fM3974getXimpl, fM3975getYimpl)) * Size.m4043getWidthimpl(this.containerSize) : Offset.m3974getXimpl(p0);
    }
}
