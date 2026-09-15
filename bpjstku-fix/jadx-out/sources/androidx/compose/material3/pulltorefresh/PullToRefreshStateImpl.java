package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR+\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\"\u0010,\u001a\u00020+8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000eR\u0014\u00106\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u000eR\u0014\u00108\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "p0", "", "p1", "Lkotlin/Function0;", "p2", "<init>", "(ZFLkotlin/jvm/functions/Function0;)V", "", "animateTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateVerticalOffset", "()F", "Landroidx/compose/ui/geometry/Offset;", "consumeAvailableOffset-MK-Hz9U", "(J)J", "consumeAvailableOffset", "endRefresh", "()V", "onRelease", "startRefresh", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing", "_verticalOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "get_verticalOffset", "set_verticalOffset", "(F)V", "_verticalOffset", "getAdjustedDistancePulled", "adjustedDistancePulled", "distancePulled$delegate", "getDistancePulled$material3_release", "setDistancePulled$material3_release", "distancePulled", "isRefreshing", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "positionalThreshold", "F", "getPositionalThreshold", "getProgress", "progress", "getVerticalOffset", "verticalOffset", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: _refreshing$delegate, reason: from kotlin metadata */
    private final MutableState _refreshing;
    private NestedScrollConnection nestedScrollConnection;
    private final float positionalThreshold;

    /* JADX INFO: renamed from: distancePulled$delegate, reason: from kotlin metadata */
    private final MutableFloatState distancePulled = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* JADX INFO: renamed from: _verticalOffset$delegate, reason: from kotlin metadata */
    private final MutableFloatState _verticalOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl", f = "PullToRefresh.kt", i = {0, 0}, l = {364}, m = "onRelease", n = {"this", "velocity"}, s = {"L$0", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshStateImpl.this.onRelease(0.0f, this);
        }
    }

    public PullToRefreshStateImpl(boolean z, float f, Function0<Boolean> function0) {
        this.positionalThreshold = f;
        this.nestedScrollConnection = new PullToRefreshStateImpl$nestedScrollConnection$1(function0, this);
        this._refreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float getPositionalThreshold() {
        return this.positionalThreshold;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float getProgress() {
        return getAdjustedDistancePulled() / getPositionalThreshold();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float getVerticalOffset() {
        return get_verticalOffset();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final boolean isRefreshing() {
        return get_refreshing();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final void startRefresh() {
        set_refreshing(true);
        set_verticalOffset(getPositionalThreshold());
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final void endRefresh() {
        set_verticalOffset(0.0f);
        set_refreshing(false);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    /* JADX INFO: renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    public final long m2829consumeAvailableOffsetMKHz9U(long p0) {
        float distancePulled$material3_release;
        if (isRefreshing()) {
            distancePulled$material3_release = 0.0f;
        } else {
            float fCoerceAtLeast = RangesKt.coerceAtLeast(getDistancePulled$material3_release() + Offset.m3975getYimpl(p0), 0.0f);
            distancePulled$material3_release = fCoerceAtLeast - getDistancePulled$material3_release();
            setDistancePulled$material3_release(fCoerceAtLeast);
            set_verticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled$material3_release);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object onRelease(float f, Continuation<? super Float> continuation) {
        AnonymousClass1 anonymousClass1;
        PullToRefreshStateImpl pullToRefreshStateImpl;
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
            if (isRefreshing()) {
                return Boxing.boxFloat(0.0f);
            }
            if (getAdjustedDistancePulled() > getPositionalThreshold()) {
                startRefresh();
            } else {
                anonymousClass1.L$0 = this;
                anonymousClass1.F$0 = f;
                anonymousClass1.label = 1;
                if (animateTo(0.0f, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            pullToRefreshStateImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = anonymousClass1.F$0;
            pullToRefreshStateImpl = (PullToRefreshStateImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (pullToRefreshStateImpl.getDistancePulled$material3_release() == 0.0f || f < 0.0f) {
            f = 0.0f;
        }
        pullToRefreshStateImpl.setDistancePulled$material3_release(0.0f);
        return Boxing.boxFloat(f);
    }

    public final Object animateTo(float f, Continuation<? super Unit> continuation) {
        Object objAnimate$default = SuspendAnimationKt.animate$default(get_verticalOffset(), f, 0.0f, null, new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.animateTo.2
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                invoke(f2.floatValue(), f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, float f3) {
                PullToRefreshStateImpl.this.set_verticalOffset(f2);
            }

            {
                super(2);
            }
        }, continuation, 12, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getPositionalThreshold()) {
            return getAdjustedDistancePulled();
        }
        float fCoerceIn = RangesKt.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getPositionalThreshold() + (getPositionalThreshold() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2.0d)) / 4.0f)));
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "<init>", "()V", "", "p0", "Lkotlin/Function0;", "", "p1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Saver", "(FLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Saver<PullToRefreshState, Boolean> Saver(final float p0, final Function0<Boolean> p1) {
            return SaverKt.Saver(new Function2<SaverScope, PullToRefreshState, Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(SaverScope saverScope, PullToRefreshState pullToRefreshState) {
                    return Boolean.valueOf(pullToRefreshState.isRefreshing());
                }
            }, new Function1<Boolean, PullToRefreshState>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ PullToRefreshState invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }

                public final PullToRefreshState invoke(boolean z) {
                    return new PullToRefreshStateImpl(z, p0, p1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getDistancePulled$material3_release() {
        return this.distancePulled.getFloatValue();
    }

    public final void setDistancePulled$material3_release(float f) {
        this.distancePulled.setFloatValue(f);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled$material3_release() * 0.5f;
    }

    private final float get_verticalOffset() {
        return this._verticalOffset.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_verticalOffset(float f) {
        this._verticalOffset.setFloatValue(f);
    }

    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final void set_refreshing(boolean z) {
        this._refreshing.setValue(Boolean.valueOf(z));
    }
}
