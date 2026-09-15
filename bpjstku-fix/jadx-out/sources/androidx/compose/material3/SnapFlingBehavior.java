package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJR\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0082@¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#J*\u0010'\u001a\u00028\u0000\"\u000e\b\u0000\u0010%*\b\u0012\u0004\u0012\u00028\u00000$*\b\u0012\u0004\u0012\u00028\u00000&H\u0082\u0002¢\u0006\u0004\b'\u0010(J*\u0010)\u001a\u00028\u0000\"\u000e\b\u0000\u0010%*\b\u0012\u0004\u0012\u00028\u00000$*\b\u0012\u0004\u0012\u00028\u00000&H\u0082\u0002¢\u0006\u0004\b)\u0010(J(\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b*\u0010+J(\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b,\u0010+J\u001c\u0010-\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b-\u0010+J0\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b.\u0010/J(\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b0\u0010+R\u0014\u00101\u001a\u00020\u00058\u0002X\u0083D¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u00102R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0D8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0018\u0010J\u001a\u00020\u0017*\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/lazy/LazyListState;", "p0", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "p1", "Landroidx/compose/animation/core/AnimationSpec;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "calculateDistanceToDesiredSnapPosition", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)F", "", "", "equals", "(Ljava/lang/Object;)Z", "findClosestOffset", "(FLandroidx/compose/foundation/lazy/LazyListState;)F", "", "hashCode", "()I", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/material3/AnimationResult;", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateSnap", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "(FF)F", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/ranges/ClosedFloatingPointRange;", "component1", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "fling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "longSnap", "performFling", "runApproach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shortSnap", "DefaultScrollMotionDurationScaleFactor", "F", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "density", "Landroidx/compose/ui/unit/Density;", "getItemSize", "()F", "itemSize", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;", "motionScaleDuration", "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "velocityThreshold", "", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private final Density density;
    private final LazyListState lazyListState;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final float velocityThreshold;
    private SnapFlingBehavior$motionScaleDuration$1 motionScaleDuration = new MotionDurationScale() { // from class: androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1
        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public final float getScaleFactor() {
            return this.this$0.DefaultScrollMotionDurationScaleFactor;
        }
    };
    private final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private final float MinFlingVelocityDp = Dp.m6935constructorimpl(400.0f);

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$animateDecay$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {261}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.animateDecay(null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$animateSnap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {299}, m = "animateSnap", n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
    static final class C05281 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05281(Continuation<? super C05281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.animateSnap(null, 0.0f, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$fling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {95}, m = "fling", n = {}, s = {})
    static final class C05301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05301(Continuation<? super C05301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.fling(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$longSnap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {135, 140}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
    static final class C05311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C05311(Continuation<? super C05311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.longSnap(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$performFling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {83}, m = "performFling", n = {}, s = {})
    static final class C05321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05321(Continuation<? super C05321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnapFlingBehavior$runApproach$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {154}, m = "runApproach", n = {"this"}, s = {"L$0"})
    static final class C05331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C05331(Continuation<? super C05331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.runApproach(null, 0.0f, 0.0f, this);
        }
    }

    private static final boolean findClosestOffset$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1] */
    public SnapFlingBehavior(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Density density) {
        this.lazyListState = lazyListState;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
        this.density = density;
        this.velocityThreshold = density.mo694toPx0680j_4(this.MinFlingVelocityDp);
    }

    private final List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.lazyListState.getLayoutInfo().getVisibleItemsInfo();
    }

    private final float getItemSize() {
        if (getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List<LazyListItemInfo> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += visibleItemsInfo.get(i).getSize();
        }
        return size2 / getVisibleItemsInfo().size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final Object performFling(ScrollScope scrollScope, float f, Continuation<? super Float> continuation) {
        C05321 c05321;
        if (continuation instanceof C05321) {
            c05321 = (C05321) continuation;
            if ((c05321.label & Integer.MIN_VALUE) != 0) {
                c05321.label -= Integer.MIN_VALUE;
            } else {
                c05321 = new C05321(continuation);
            }
        } else {
            c05321 = new C05321(continuation);
        }
        Object objFling = c05321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c05321.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFling);
            c05321.label = 1;
            objFling = fling(scrollScope, f, c05321);
            if (objFling == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFling);
        }
        AnimationResult animationResult = (AnimationResult) objFling;
        return Boxing.boxFloat(((Number) animationResult.component1()).floatValue() != 0.0f ? ((Number) animationResult.component2().getVelocity()).floatValue() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object fling(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        C05301 c05301;
        if (continuation instanceof C05301) {
            c05301 = (C05301) continuation;
            if ((c05301.label & Integer.MIN_VALUE) != 0) {
                c05301.label -= Integer.MIN_VALUE;
            } else {
                c05301 = new C05301(continuation);
            }
        } else {
            c05301 = new C05301(continuation);
        }
        Object objTuitionPaymentFragmentbindingInflater1 = c05301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c05301.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
            SnapFlingBehavior$motionScaleDuration$1 snapFlingBehavior$motionScaleDuration$1 = this.motionScaleDuration;
            SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(f, this, scrollScope, null);
            c05301.label = 1;
            objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(snapFlingBehavior$motionScaleDuration$1, snapFlingBehavior$fling$result$1, c05301);
            if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
        }
        return (AnimationResult) objTuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        float fFindClosestOffset = findClosestOffset(0.0f, this.lazyListState);
        return animateSnap(scrollScope, fFindClosestOffset, fFindClosestOffset, AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), this.snapAnimationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final Object longSnap(ScrollScope scrollScope, float f, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        C05311 c05311;
        SnapFlingBehavior snapFlingBehavior;
        ScrollScope scrollScope2 = scrollScope;
        if (continuation instanceof C05311) {
            c05311 = (C05311) continuation;
            if ((c05311.label & Integer.MIN_VALUE) != 0) {
                c05311.label -= Integer.MIN_VALUE;
            } else {
                c05311 = new C05311(continuation);
            }
        } else {
            c05311 = new C05311(continuation);
        }
        C05311 c05312 = c05311;
        Object objRunApproach = c05312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c05312.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRunApproach);
            float fCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f)) - getItemSize(), 0.0f);
            if (fCoerceAtLeast != 0.0f) {
                fCoerceAtLeast *= Math.signum(f);
            }
            c05312.L$0 = this;
            c05312.L$1 = scrollScope2;
            c05312.label = 1;
            objRunApproach = runApproach(scrollScope2, fCoerceAtLeast, f, c05312);
            if (objRunApproach != coroutine_suspended) {
                snapFlingBehavior = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunApproach);
            return objRunApproach;
        }
        scrollScope2 = (ScrollScope) c05312.L$1;
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) c05312.L$0;
        ResultKt.throwOnFailure(objRunApproach);
        snapFlingBehavior = snapFlingBehavior2;
        AnimationResult animationResult = (AnimationResult) objRunApproach;
        float fFloatValue = ((Number) animationResult.component1()).floatValue();
        AnimationState<Float, AnimationVector1D> animationStateCopy$default = AnimationStateKt.copy$default(animationResult.component2(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec<Float> animationSpec = snapFlingBehavior.snapAnimationSpec;
        c05312.L$0 = null;
        c05312.L$1 = null;
        c05312.label = 2;
        Object objAnimateSnap = snapFlingBehavior.animateSnap(scrollScope2, fFloatValue, fFloatValue, animationStateCopy$default, animationSpec, c05312);
        return objAnimateSnap == coroutine_suspended ? coroutine_suspended : objAnimateSnap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        C05331 c05331;
        SnapFlingBehavior snapFlingBehavior;
        if (continuation instanceof C05331) {
            c05331 = (C05331) continuation;
            if ((c05331.label & Integer.MIN_VALUE) != 0) {
                c05331.label -= Integer.MIN_VALUE;
            } else {
                c05331 = new C05331(continuation);
            }
        } else {
            c05331 = new C05331(continuation);
        }
        C05331 c05332 = c05331;
        Object objAnimateDecay = c05332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c05332.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAnimateDecay);
            AnimationState<Float, AnimationVector1D> animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null);
            DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
            c05332.L$0 = this;
            c05332.label = 1;
            objAnimateDecay = animateDecay(scrollScope, f, animationStateAnimationState$default, decayAnimationSpec, c05332);
            if (objAnimateDecay == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snapFlingBehavior = (SnapFlingBehavior) c05332.L$0;
            ResultKt.throwOnFailure(objAnimateDecay);
        }
        AnimationState animationStateComponent2 = ((AnimationResult) objAnimateDecay).component2();
        return new AnimationResult(Boxing.boxFloat(snapFlingBehavior.findClosestOffset(((Number) animationStateComponent2.getVelocity()).floatValue(), snapFlingBehavior.lazyListState)), animationStateComponent2);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) p0;
        return Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.lazyListState, this.lazyListState) && Intrinsics.areEqual(snapFlingBehavior.density, this.density);
    }

    public final int hashCode() {
        int iHashCode = this.snapAnimationSpec.hashCode();
        return (((((iHashCode * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.lazyListState.hashCode()) * 31) + this.density.hashCode();
    }

    private final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getStart();
    }

    private final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getEndInclusive();
    }

    private static final ClosedFloatingPointRange<Float> findClosestOffset$calculateSnappingOffsetBounds(LazyListState lazyListState, SnapFlingBehavior snapFlingBehavior) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float fCalculateDistanceToDesiredSnapPosition = snapFlingBehavior.calculateDistanceToDesiredSnapPosition(layoutInfo, visibleItemsInfo.get(i));
            if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f) {
                f = fCalculateDistanceToDesiredSnapPosition;
            }
            if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f2) {
                f2 = fCalculateDistanceToDesiredSnapPosition;
            }
        }
        return RangesKt.rangeTo(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    private final float findClosestOffset(float p0, LazyListState p1) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds = findClosestOffset$calculateSnappingOffsetBounds(p1, this);
        float fFloatValue = ((Number) component1(closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds)).floatValue();
        float fFloatValue2 = ((Number) component2(closedFloatingPointRangeFindClosestOffset$calculateSnappingOffsetBounds)).floatValue();
        float fSignum = Math.signum(p0);
        if (fSignum == 0.0f) {
            if (Math.abs(fFloatValue2) <= Math.abs(fFloatValue)) {
                fFloatValue = fFloatValue2;
            }
        } else if (fSignum == 1.0f) {
            fFloatValue = fFloatValue2;
        } else if (fSignum != -1.0f) {
            fFloatValue = 0.0f;
        }
        if (findClosestOffset$isValidDistance(fFloatValue)) {
            return fFloatValue;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object animateDecay(final ScrollScope scrollScope, final float f, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.FloatRef floatRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SnapFlingBehavior.animateDecay.2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(f)) {
                        SnapFlingBehavior.animateDecay$consumeDelta(animationScope, scrollScope, this.coerceToTarget(animationScope.getValue().floatValue(), f) - floatRef2.element);
                        animationScope.cancelAnimation();
                        return;
                    }
                    SnapFlingBehavior.animateDecay$consumeDelta(animationScope, scrollScope, animationScope.getValue().floatValue() - floatRef2.element);
                    floatRef2.element = animationScope.getValue().floatValue();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            anonymousClass1.L$0 = animationState;
            anonymousClass1.L$1 = floatRef2;
            anonymousClass1.F$0 = f;
            anonymousClass1.label = 1;
            if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, function1, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = anonymousClass1.F$0;
            floatRef = (Ref.FloatRef) anonymousClass1.L$1;
            animationState = (AnimationState) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new AnimationResult(Boxing.boxFloat(f - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, float f) {
        if (Math.abs(f - scrollScope.scrollBy(f)) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object animateSnap(final ScrollScope scrollScope, float f, final float f2, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        C05281 c05281;
        float f3;
        SnapFlingBehavior snapFlingBehavior;
        Ref.FloatRef floatRef;
        float f4;
        AnimationState<Float, AnimationVector1D> animationState2;
        if (continuation instanceof C05281) {
            c05281 = (C05281) continuation;
            if ((c05281.label & Integer.MIN_VALUE) != 0) {
                c05281.label -= Integer.MIN_VALUE;
            } else {
                c05281 = new C05281(continuation);
            }
        } else {
            c05281 = new C05281(continuation);
        }
        C05281 c05282 = c05281;
        Object obj = c05282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c05282.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.getVelocity().floatValue();
            Float fBoxFloat = Boxing.boxFloat(f);
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SnapFlingBehavior.animateSnap.2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    float fCoerceToTarget = SnapFlingBehavior.this.coerceToTarget(animationScope.getValue().floatValue(), f2);
                    float f5 = fCoerceToTarget - floatRef2.element;
                    float fScrollBy = scrollScope.scrollBy(f5);
                    if (Math.abs(f5 - fScrollBy) > 0.5f || fCoerceToTarget != animationScope.getValue().floatValue()) {
                        animationScope.cancelAnimation();
                    }
                    floatRef2.element += fScrollBy;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            c05282.L$0 = this;
            c05282.L$1 = animationState;
            c05282.L$2 = floatRef2;
            f3 = f;
            c05282.F$0 = f3;
            c05282.F$1 = fFloatValue;
            c05282.label = 1;
            if (SuspendAnimationKt.animateTo(animationState, fBoxFloat, animationSpec, !z, function1, c05282) == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
            floatRef = floatRef2;
            f4 = fFloatValue;
            animationState2 = animationState;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = c05282.F$1;
            float f5 = c05282.F$0;
            floatRef = (Ref.FloatRef) c05282.L$2;
            AnimationState<Float, AnimationVector1D> animationState3 = (AnimationState) c05282.L$1;
            snapFlingBehavior = (SnapFlingBehavior) c05282.L$0;
            ResultKt.throwOnFailure(obj);
            f3 = f5;
            animationState2 = animationState3;
        }
        return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, snapFlingBehavior.coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt.coerceAtMost(f, f2) : RangesKt.coerceAtLeast(f, f2);
    }

    private final float calculateDistanceToDesiredSnapPosition(LazyListLayoutInfo p0, LazyListItemInfo p1) {
        return p1.getOffset() - ((((getSingleAxisViewportSize(p0) - p0.getBeforeContentPadding()) - p0.getAfterContentPadding()) / 2.0f) - (p1.getSize() / 2.0f));
    }

    private final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m7105getHeightimpl(lazyListLayoutInfo.mo1107getViewportSizeYbymL2g()) : IntSize.m7106getWidthimpl(lazyListLayoutInfo.mo1107getViewportSizeYbymL2g());
    }
}
