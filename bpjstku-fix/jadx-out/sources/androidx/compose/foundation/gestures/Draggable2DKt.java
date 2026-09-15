package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a{\u0010\u0014\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00020\u00002\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a±\u0001\u0010\u0014\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n24\b\u0002\u0010\u0010\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001a24\b\u0002\u0010\u0012\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u001b\"%\u0010\u001c\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"@\u0010\u001e\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"%\u0010 \u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d\"@\u0010!\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "p0", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Draggable2DState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/Draggable2DState;", "rememberDraggable2DState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/ui/Modifier;", "", "p1", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p2", "p3", "Lkotlin/ParameterName;", "p4", "Landroidx/compose/ui/unit/Velocity;", "p5", "p6", "draggable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "NoOpOnDragStart", "Lkotlin/jvm/functions/Function1;", "NoOpOnDragStarted", "Lkotlin/jvm/functions/Function3;", "NoOpOnDragStop", "NoOpOnDragStopped"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Draggable2DKt {
    private static final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> NoOpOnDragStarted = new Draggable2DKt$NoOpOnDragStarted$1(null);
    private static final Function1<Offset, Unit> NoOpOnDragStart = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m755invokek4lQ0M(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Offset offset) {
            m755invokek4lQ0M(offset.m3984unboximpl());
            return Unit.INSTANCE;
        }
    };
    private static final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> NoOpOnDragStopped = new Draggable2DKt$NoOpOnDragStopped$1(null);
    private static final Function1<Velocity, Unit> NoOpOnDragStop = new Function1<Velocity, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        /* JADX INFO: renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m757invokeTH1AsA0(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Velocity velocity) {
            m757invokeTH1AsA0(velocity.getPackedValue());
            return Unit.INSTANCE;
        }
    };

    public static final Draggable2DState Draggable2DState(Function1<? super Offset, Unit> function1) {
        return new DefaultDraggable2DState(function1);
    }

    public static final Draggable2DState rememberDraggable2DState(Function1<? super Offset, Unit> function1, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:120)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Draggable2DState(new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(Offset offset) {
                    m759invokek4lQ0M(offset.m3984unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m759invokek4lQ0M(long j) {
                    stateRememberUpdatedState.getValue().invoke(Offset.m3963boximpl(j));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }

    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function1<? super Offset, Unit> function1, Function1<? super Velocity, Unit> function2, boolean z3) {
        return modifier.then(new Draggable2DElement(draggable2DState, z, mutableInteractionSource, z2, function1, function2, z3));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use overload without the suspend onDragStarted onDragStopped and callbacks")
    public static final /* synthetic */ Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function4, boolean z3) {
        return modifier.then(new Draggable2DCompatElement(draggable2DState, z, mutableInteractionSource, z2, function3, function4, z3));
    }
}
