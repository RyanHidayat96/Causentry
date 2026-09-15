package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u00124\b\u0002\u0010\u0015\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u0014\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u0004\u00124\b\u0002\u0010\u0018\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u0014\u0012\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001e\u001a\u00020\u001223\u0010\u0003\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u001d¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&Jí\u0001\u0010'\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000624\b\u0002\u0010\u0015\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u001424\b\u0002\u0010\u0016\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u00142\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u00042\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b'\u0010(J\u0016\u0010+\u001a\u00020\u000f*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\u00020\u0017*\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*R'\u0010-\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.RB\u0010\"\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010/R'\u00100\u001a\u0013\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00120\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010.RB\u0010$\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\u0002\b\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010/R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "p1", "p2", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p3", "p4", "p5", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p6", "p7", "Landroidx/compose/ui/unit/Velocity;", "p8", "p9", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "onDragStopped-TH1AsA0", "onDragStopped", "startDragImmediately", "()Z", "update", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "reverseIfNeeded-MK-Hz9U", "(J)J", "reverseIfNeeded", "reverseIfNeeded-AH228Gc", "onDragStart", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "onDragStop", "reverseDirection", "Z", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/gestures/Draggable2DState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private Function1<? super Offset, Unit> onDragStart;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function1<? super Velocity, Unit> onDragStop;
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    public /* synthetic */ Draggable2DNode(Draggable2DState draggable2DState, Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3 function3, Function1 function2, Function3 function4, Function1 function5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(draggable2DState, function1, z, mutableInteractionSource, z2, z3, (i & 64) != 0 ? Draggable2DKt.NoOpOnDragStarted : function3, (i & 128) != 0 ? Draggable2DKt.NoOpOnDragStart : function2, (i & 256) != 0 ? Draggable2DKt.NoOpOnDragStopped : function4, (i & 512) != 0 ? Draggable2DKt.NoOpOnDragStop : function5);
    }

    public Draggable2DNode(Draggable2DState draggable2DState, Function1<? super PointerInputChange, Boolean> function1, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function2, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function4, Function1<? super Velocity, Unit> function5) {
        super(function1, z, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z2;
        this.reverseDirection = z3;
        this.onDragStarted = function3;
        this.onDragStart = function2;
        this.onDragStopped = function4;
        this.onDragStop = function5;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/Drag2DScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Drag2DScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DNode.drag.2.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DragEvent.DragDelta dragDelta) {
                        invoke2(dragDelta);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DragEvent.DragDelta dragDelta) {
                        drag2DScope.mo724dragByk4lQ0M(draggable2DNode.m763reverseIfNeededMKHz9U(dragDelta.getDelta()));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                this.label = 1;
                if (function2.invoke(function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Draggable2DNode draggable2DNode, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$forEachDelta = function2;
            this.this$0 = draggable2DNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Drag2DScope drag2DScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(drag2DScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new AnonymousClass2(function2, this, null), continuation);
        return objDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M */
    public final void mo711onDragStartedk4lQ0M(long p0) {
        this.onDragStart.invoke(Offset.m3963boximpl(p0));
        if (!getIsAttached() || this.onDragStarted == Draggable2DKt.NoOpOnDragStarted) {
            return;
        }
        b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new Draggable2DNode$onDragStarted$1(this, p0, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public final void mo712onDragStoppedTH1AsA0(long p0) {
        this.onDragStop.invoke(Velocity.m7164boximpl(p0));
        if (!getIsAttached() || this.onDragStopped == Draggable2DKt.NoOpOnDragStopped) {
            return;
        }
        b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new Draggable2DNode$onDragStopped$1(this, p0, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: startDragImmediately, reason: from getter */
    public final boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(Draggable2DState p0, Function1<? super PointerInputChange, Boolean> p1, boolean p2, MutableInteractionSource p3, boolean p4, boolean p5, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> p6, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> p7, Function1<? super Offset, Unit> p8, Function1<? super Velocity, Unit> p9) {
        boolean z;
        if (Intrinsics.areEqual(this.state, p0)) {
            z = false;
        } else {
            this.state = p0;
            z = true;
        }
        if (this.reverseDirection != p5) {
            this.reverseDirection = p5;
            z = true;
        }
        this.onDragStarted = p6;
        this.onDragStopped = p7;
        this.onDragStart = p8;
        this.onDragStop = p9;
        this.startDragImmediately = p4;
        update(p1, p2, p3, null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m762reverseIfNeededAH228Gc(long j) {
        return Velocity.m7179timesadjELrA(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m763reverseIfNeededMKHz9U(long j) {
        return Offset.m3981timestuRUvjQ(j, this.reverseDirection ? -1.0f : 1.0f);
    }
}
