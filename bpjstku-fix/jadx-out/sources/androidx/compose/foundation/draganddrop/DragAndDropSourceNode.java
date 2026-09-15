package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011RC\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R3\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "dragAndDropSourceHandler", "Lkotlin/jvm/functions/Function2;", "getDragAndDropSourceHandler", "()Lkotlin/jvm/functions/Function2;", "setDragAndDropSourceHandler", "(Lkotlin/jvm/functions/Function2;)V", "drawDragDecoration", "Lkotlin/jvm/functions/Function1;", "getDrawDragDecoration", "()Lkotlin/jvm/functions/Function1;", "setDrawDragDecoration", "(Lkotlin/jvm/functions/Function1;)V", "size", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> dragAndDropSourceHandler;
    private Function1<? super DrawScope, Unit> drawDragDecoration;
    private long size = IntSize.INSTANCE.m7111getZeroYbymL2g();

    public final Function1<DrawScope, Unit> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final void setDrawDragDecoration(Function1<? super DrawScope, Unit> function1) {
        this.drawDragDecoration = function1;
    }

    public final Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.dragAndDropSourceHandler = function2;
    }

    public DragAndDropSourceNode(Function1<? super DrawScope, Unit> function1, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.drawDragDecoration = function1;
        this.dragAndDropSourceHandler = function2;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1((DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode()), null)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1", f = "DragAndDropSource.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> dragAndDropSourceHandler = DragAndDropSourceNode.this.getDragAndDropSourceHandler();
                C00251 c00251 = new C00251(pointerInputScope, this.$dragAndDropModifierNode, DragAndDropSourceNode.this);
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(c00251, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u0011*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u0011*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010#\u001a\u00020 *\u00020\u001fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001b*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010%\u001a\u00020\u001b*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0019J\u0014\u0010)\u001a\u00020(*\u00020'H\u0097\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u001f*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\"J\u0017\u0010/\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u0015*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010.J\u0017\u0010/\u001a\u00020\u0015*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u001b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00107\u001a\u00020\u001f8WX\u0096\u0005ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00103R$\u0010?\u001a\u00020:2\u0006\u0010\t\u001a\u00020:8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010B\u001a\u00020@8\u0017X\u0096\u0005ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u00106R\u0014\u0010F\u001a\u00020C8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode$1$1;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p0", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "", "startTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C00251 implements DragAndDropSourceScope, PointerInputScope {
            private final /* synthetic */ PointerInputScope $$delegate_0;
            final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
            final /* synthetic */ DragAndDropSourceNode this$0;

            C00251(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, DragAndDropSourceNode dragAndDropSourceNode) {
                this.$dragAndDropModifierNode = dragAndDropModifierNode;
                this.this$0 = dragAndDropSourceNode;
                this.$$delegate_0 = pointerInputScope;
            }

            @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
            public final void startTransfer(DragAndDropTransferData p0) {
                this.$dragAndDropModifierNode.mo3729drag12SF9DM(p0, IntSizeKt.m7118toSizeozmzZPI(getBoundsSize()), this.this$0.getDrawDragDecoration());
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
                return this.$$delegate_0.awaitPointerEventScope(function2, continuation);
            }

            @Override // androidx.compose.ui.unit.Density
            public final float getDensity() {
                return this.$$delegate_0.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
            public final long mo685getExtendedTouchPaddingNHjbRc() {
                return this.$$delegate_0.mo685getExtendedTouchPaddingNHjbRc();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public final float getFontScale() {
                return this.$$delegate_0.getFontScale();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final boolean getInterceptOutOfBoundsChildEvents() {
                return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
            public final long getBoundsSize() {
                return this.$$delegate_0.getBoundsSize();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final ViewConfiguration getViewConfiguration() {
                return this.$$delegate_0.getViewConfiguration();
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
            public final int mo687roundToPxR2X_6o(long j) {
                return this.$$delegate_0.mo687roundToPxR2X_6o(j);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
            public final int mo688roundToPx0680j_4(float f) {
                return this.$$delegate_0.mo688roundToPx0680j_4(f);
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final void setInterceptOutOfBoundsChildEvents(boolean z) {
                this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
            public final float mo689toDpGaN1DYA(long j) {
                return this.$$delegate_0.mo689toDpGaN1DYA(j);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
            public final float mo690toDpu2uoSUM(float f) {
                return this.$$delegate_0.mo690toDpu2uoSUM(f);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
            public final float mo691toDpu2uoSUM(int i) {
                return this.$$delegate_0.mo691toDpu2uoSUM(i);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
            public final long mo692toDpSizekrfVVM(long j) {
                return this.$$delegate_0.mo692toDpSizekrfVVM(j);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
            public final float mo693toPxR2X_6o(long j) {
                return this.$$delegate_0.mo693toPxR2X_6o(j);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
            public final float mo694toPx0680j_4(float f) {
                return this.$$delegate_0.mo694toPx0680j_4(f);
            }

            @Override // androidx.compose.ui.unit.Density
            public final Rect toRect(DpRect dpRect) {
                return this.$$delegate_0.toRect(dpRect);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
            public final long mo695toSizeXkaWNTQ(long j) {
                return this.$$delegate_0.mo695toSizeXkaWNTQ(j);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
            public final long mo696toSp0xMU5do(float f) {
                return this.$$delegate_0.mo696toSp0xMU5do(f);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
            public final long mo697toSpkPz2Gy4(float f) {
                return this.$$delegate_0.mo697toSpkPz2Gy4(f);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
            public final long mo698toSpkPz2Gy4(int i) {
                return this.$$delegate_0.mo698toSpkPz2Gy4(i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragAndDropModifierNode dragAndDropModifierNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dragAndDropModifierNode = dragAndDropModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DragAndDropSourceNode.this.new AnonymousClass1(this.$dragAndDropModifierNode, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public final void mo684onRemeasuredozmzZPI(long p0) {
        this.size = p0;
    }
}
