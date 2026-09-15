package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$nestedScrollConnection$1;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "p0", "p1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "p2", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshStateImpl$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Function0<Boolean> $enabled;
    final /* synthetic */ PullToRefreshStateImpl this$0;

    PullToRefreshStateImpl$nestedScrollConnection$1(Function0<Boolean> function0, PullToRefreshStateImpl pullToRefreshStateImpl) {
        this.$enabled = function0;
        this.this$0 = pullToRefreshStateImpl;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1078onPreScrollOzD1aCk(long p0, int p1) {
        if (!this.$enabled.invoke().booleanValue()) {
            return Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        if (NestedScrollSource.m5389equalsimpl0(p1, NestedScrollSource.INSTANCE.m5397getDragWNlRxjI()) && Offset.m3975getYimpl(p0) < 0.0f) {
            return this.this$0.m2829consumeAvailableOffsetMKHz9U(p0);
        }
        return Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo804onPostScrollDzOQY0M(long p0, long p1, int p2) {
        if (!this.$enabled.invoke().booleanValue()) {
            return Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        if (NestedScrollSource.m5389equalsimpl0(p2, NestedScrollSource.INSTANCE.m5397getDragWNlRxjI()) && Offset.m3975getYimpl(p1) > 0.0f) {
            return this.this$0.m2829consumeAvailableOffsetMKHz9U(p1);
        }
        return Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo1077onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1;
        float f;
        if (continuation instanceof PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1) {
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 = (PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1) continuation;
            if ((pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label -= Integer.MIN_VALUE;
            } else {
                pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 = new PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1(this, continuation);
            }
        } else {
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 = new PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1(this, continuation);
        }
        Object objOnRelease = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objOnRelease);
            PullToRefreshStateImpl pullToRefreshStateImpl = this.this$0;
            float fM7174getYimpl = Velocity.m7174getYimpl(j);
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.F$0 = 0.0f;
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label = 1;
            objOnRelease = pullToRefreshStateImpl.onRelease(fM7174getYimpl, pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1);
            if (objOnRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = 0.0f;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.F$0;
            ResultKt.throwOnFailure(objOnRelease);
        }
        return Velocity.m7164boximpl(VelocityKt.Velocity(f, ((Number) objOnRelease).floatValue()));
    }
}
