package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001IBD\u0012!\b\u0002\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001e\u001a\u00020\n*\u00020\b2\u0006\u0010\f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010%\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020 2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000bH\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010)J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010)J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010'J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010)R/\u00100\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\u0002048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0016R\u0014\u0010H\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010B"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "p1", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "onDetach", "()V", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "requestDragAndDropTransfer-k-4lQ0M", "requestDragAndDropTransfer", "Lkotlin/Function0;", "", "startDragAndDropTransfer-d-4ec7I", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;JLkotlin/jvm/functions/Function0;)V", "startDragAndDropTransfer", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "p2", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "drag", "acceptDragAndDropTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z", "onStarted", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "onEntered", "onMoved", "onChanged", "onExited", "onDrop", "onEnded", "onStartTransfer", "Lkotlin/jvm/functions/Function2;", "onDropTargetValidate", "Lkotlin/jvm/functions/Function1;", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "lastChildDragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "thisDragAndDropTarget", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "hasEligibleDropTarget", "()Z", "size", "J", "getSize-YbymL2g$ui_release", "()J", "setSize-ozmzZPI$ui_release", "isRequestDragAndDropTransferRequired", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final Function1<DragAndDropEvent, DragAndDropTarget> onDropTargetValidate;
    private Function2<? super DragAndDropStartTransferScope, ? super Offset, Unit> onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DragAndDropNode(Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(Function2<? super DragAndDropStartTransferScope, ? super Offset, Unit> function2, Function1<? super DragAndDropEvent, ? extends DragAndDropTarget> function1) {
        this.onStartTransfer = function2;
        this.onDropTargetValidate = function1;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.INSTANCE.m7111getZeroYbymL2g();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "<init>", "()V", "DragAndDropTraversableKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui_release, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m3732setSizeozmzZPI$ui_release(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final void mo684onRemeasuredozmzZPI(long p0) {
        this.size = p0;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public final boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* JADX INFO: renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public final void mo3731requestDragAndDropTransferk4lQ0M(long p0) {
        if (this.onStartTransfer == null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo3727requestDragAndDropTransferUv8p0NA(this, p0);
    }

    /* JADX INFO: renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m3733startDragAndDropTransferd4ec7I(final DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j, final Function0<Boolean> function0) {
        final LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (dragAndDropNode.getIsAttached()) {
                    Function2 function2 = dragAndDropNode.onStartTransfer;
                    if (function2 == null) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    if (!Offset.m3971equalsimpl0(j, Offset.INSTANCE.m3989getUnspecifiedF1C5BW0())) {
                        long jMo5646localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo5646localPositionOfR5De75A(coordinates, j);
                        if (!SizeKt.m4064toRectuvyYCjk(IntSizeKt.m7118toSizeozmzZPI(dragAndDropNode.getSize())).m4000containsk4lQ0M(jMo5646localPositionOfR5De75A)) {
                            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                        }
                        function2.invoke(dragAndDropStartTransferScope, Offset.m3963boximpl(jMo5646localPositionOfR5De75A));
                    } else {
                        function2.invoke(dragAndDropStartTransferScope, Offset.m3963boximpl(Offset.INSTANCE.m3989getUnspecifiedF1C5BW0()));
                    }
                    if (function0.invoke().booleanValue()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @Deprecated(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    /* JADX INFO: renamed from: drag-12SF9DM */
    public final void mo3729drag12SF9DM(final DragAndDropTransferData p0, final long p1, final Function1<? super DrawScope, Unit> p2) {
        if (this.onStartTransfer != null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new Function2<DragAndDropStartTransferScope, Offset, Unit>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$drag$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
                m3734invokeUv8p0NA(dragAndDropStartTransferScope, offset.m3984unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m3734invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j) {
                dragAndDropStartTransferScope.mo3728startDragAndDropTransfer12SF9DM(p0, p1, p2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        };
        getDragAndDropManager().mo3727requestDragAndDropTransferUv8p0NA(this, Offset.INSTANCE.m3989getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public final boolean acceptDragAndDropTransfer(final DragAndDropEvent p0) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.acceptDragAndDropTransfer.1
            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (dragAndDropNode.getIsAttached()) {
                    if (dragAndDropNode.thisDragAndDropTarget != null) {
                        InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    Function1 function1 = dragAndDropNode.onDropTargetValidate;
                    dragAndDropNode.thisDragAndDropTarget = function1 != null ? (DragAndDropTarget) function1.invoke(p0) : null;
                    boolean z = dragAndDropNode.thisDragAndDropTarget != null;
                    if (z) {
                        this.getDragAndDropManager().registerTargetInterest(dragAndDropNode);
                    }
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    booleanRef2.element = booleanRef2.element || z;
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return booleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onStarted(DragAndDropEvent p0) {
        DragAndDropNode dragAndDropNode = this;
        do {
            DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.lastChildDragAndDropModifierNode;
            } else {
                dragAndDropTarget.onStarted(p0);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEntered(DragAndDropEvent p0) {
        DragAndDropNode dragAndDropNode = this;
        do {
            DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.lastChildDragAndDropModifierNode;
            } else {
                dragAndDropTarget.onEntered(p0);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onMoved(final DragAndDropEvent p0) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.m3736containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(p0))) {
            DragAndDropNode dragAndDropNode3 = this;
            if (dragAndDropNode3.getNode().getIsAttached()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.traverseDescendants(dragAndDropNode3, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode4) {
                        DragAndDropNode dragAndDropNode5 = dragAndDropNode4;
                        if (this.getDragAndDropManager().isInterestedTarget(dragAndDropNode5) && DragAndDropNodeKt.m3736containsUv8p0NA(dragAndDropNode5, DragAndDrop_androidKt.getPositionInRoot(p0))) {
                            objectRef.element = dragAndDropNode4;
                            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                        }
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                traversableNode = (TraversableNode) objectRef.element;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.dispatchEntered(dragAndDropNode, p0);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(p0);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, p0);
            }
            dragAndDropNode2.onExited(p0);
        } else if (!Intrinsics.areEqual(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropNode, p0);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.onExited(p0);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.onMoved(p0);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(p0);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onChanged(DragAndDropEvent p0) {
        DragAndDropNode dragAndDropNode = this;
        do {
            DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.lastChildDragAndDropModifierNode;
            } else {
                dragAndDropTarget.onChanged(p0);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onExited(DragAndDropEvent p0) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(p0);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(p0);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final boolean onDrop(DragAndDropEvent p0) {
        DragAndDropNode dragAndDropNode = this;
        while (true) {
            DragAndDropNode dragAndDropNode2 = dragAndDropNode.lastChildDragAndDropModifierNode;
            if (dragAndDropNode2 == null) {
                break;
            }
            dragAndDropNode = dragAndDropNode2;
        }
        DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(p0);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEnded(final DragAndDropEvent p0) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.onEnded.1
            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (dragAndDropNode.getNode().getIsAttached()) {
                    DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.onEnded(p0);
                    }
                    dragAndDropNode.thisDragAndDropTarget = null;
                    dragAndDropNode.lastChildDragAndDropModifierNode = null;
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            {
                super(1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
