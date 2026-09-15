package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0019\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0019\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/Interaction;", "", "animateElevation", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "snapElevation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateElevation-lDy3nrA", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateElevation", "calculateTarget-u2uoSUM", "(Landroidx/compose/foundation/interaction/Interaction;)F", "calculateTarget", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "defaultElevation", "F", "focusedElevation", "hoveredElevation", "lastTargetInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "pressedElevation", "targetInteraction"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {623}, m = "animateElevation", n = {"this", TypedValues.TransitionType.S_TO}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
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
            return FloatingActionButtonElevationAnimatable.this.animateElevation(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m = "snapElevation", n = {"this"}, s = {"L$0"})
    static final class C04831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04831(Continuation<? super C04831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingActionButtonElevationAnimatable.this.snapElevation(this);
        }
    }

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(Dp.m6933boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
    }

    /* JADX INFO: renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m2103calculateTargetu2uoSUM(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return this.pressedElevation;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return this.hoveredElevation;
        }
        return interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m2104updateElevationlDy3nrA(float f, float f2, float f3, float f4, Continuation<? super Unit> continuation) throws Throwable {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object objSnapElevation = snapElevation(continuation);
        return objSnapElevation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapElevation : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object snapElevation(Continuation<? super Unit> continuation) throws Throwable {
        C04831 c04831;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuation instanceof C04831) {
            c04831 = (C04831) continuation;
            if ((c04831.label & Integer.MIN_VALUE) != 0) {
                c04831.label -= Integer.MIN_VALUE;
            } else {
                c04831 = new C04831(continuation);
            }
        } else {
            c04831 = new C04831(continuation);
        }
        Object obj = c04831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c04831.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fM2103calculateTargetu2uoSUM = m2103calculateTargetu2uoSUM(this.targetInteraction);
            if (!Dp.m6940equalsimpl0(this.animatable.getTargetValue().m6949unboximpl(), fM2103calculateTargetu2uoSUM)) {
                try {
                    Animatable<Dp, AnimationVector1D> animatable = this.animatable;
                    Dp dpM6933boximpl = Dp.m6933boximpl(fM2103calculateTargetu2uoSUM);
                    c04831.L$0 = this;
                    c04831.label = 1;
                    if (animatable.snapTo(dpM6933boximpl, c04831) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                } catch (Throwable th) {
                    th = th;
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) c04831.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
            } catch (Throwable th2) {
                th = th2;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object animateElevation(Interaction interaction, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
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
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interaction = (Interaction) anonymousClass1.L$1;
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        float fM2103calculateTargetu2uoSUM = m2103calculateTargetu2uoSUM(interaction);
        this.targetInteraction = interaction;
        try {
            if (!Dp.m6940equalsimpl0(this.animatable.getTargetValue().m6949unboximpl(), fM2103calculateTargetu2uoSUM)) {
                Animatable<Dp, AnimationVector1D> animatable = this.animatable;
                Interaction interaction2 = this.lastTargetInteraction;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = interaction;
                anonymousClass1.label = 1;
                if (ElevationKt.m2070animateElevationrAjV9yQ(animatable, fM2103calculateTargetu2uoSUM, interaction2, interaction, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            throw th;
        }
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
