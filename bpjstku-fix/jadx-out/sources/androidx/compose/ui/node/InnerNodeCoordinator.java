package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 =2\u00020\u0001:\u0002>=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0014¢\u0006\u0004\b\u0019\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b%\u0010&J7\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u001a\u00102\u001a\u0002018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R.\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0003\u001a\u0004\u0018\u0001068\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "p0", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "minIntrinsicWidth", "(I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "", "p1", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p2", "placeAt-f8xVGno", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAt", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "(JFLkotlin/jvm/functions/Function1;)V", "onAfterPlaceAt", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerType;", "p3", "", "p4", "hitTestChild-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTestChild", "Landroidx/compose/ui/node/TailModifierNode;", "tail", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Companion", "LookaheadDelegateImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new LookaheadDelegateImpl() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected final void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "<init>", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "Landroidx/compose/ui/unit/Constraints;", "p0", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "", "placeChildren", "()V", "minIntrinsicWidth", "(I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public final Placeable mo5637measureBRTryo0(long p0) {
            LookaheadDelegateImpl lookaheadDelegateImpl = this;
            lookaheadDelegateImpl.m5701setMeasurementConstraintsBRTryo0(p0);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i].getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            }
            lookaheadDelegateImpl.set_measureResult(getLayoutNode().getMeasurePolicy().mo359measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), p0));
            return lookaheadDelegateImpl;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(AlignmentLine p0) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(p0);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().set(p0, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected final void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int p0) {
            return getLayoutNode().minLookaheadIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int p0) {
            return getLayoutNode().minLookaheadIntrinsicHeight(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int p0) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int p0) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(p0);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public final Placeable mo5637measureBRTryo0(long p0) {
        if (getForceMeasureWithLookaheadConstraints()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            p0 = lookaheadDelegate.m5864getConstraintsmsEJaDk$ui_release();
        }
        m5701setMeasurementConstraintsBRTryo0(p0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo359measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), p0));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int p0) {
        return getLayoutNode().minIntrinsicWidth(p0);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int p0) {
        return getLayoutNode().minIntrinsicHeight(p0);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int p0) {
        return getLayoutNode().maxIntrinsicWidth(p0);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int p0) {
        return getLayoutNode().maxIntrinsicHeight(p0);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo5699placeAtf8xVGno(long p0, float p1, GraphicsLayer p2) {
        super.mo5699placeAtf8xVGno(p0, p1, p2);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo5638placeAtf8xVGno(long p0, float p1, Function1<? super GraphicsLayerScope, Unit> p2) {
        super.mo5638placeAtf8xVGno(p0, p1, p2);
        onAfterPlaceAt();
    }

    private final void onAfterPlaceAt() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(AlignmentLine p0) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(p0);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(p0);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void performDraw(Canvas p0, GraphicsLayer p1) throws Throwable {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui_release(p0, p1);
            }
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(p0, innerBoundsPaint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[EDGE_INSN: B:28:0x008e->B:25:0x008e BREAK  A[LOOP:0: B:16:0x005c->B:24:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    public final void mo5826hitTestChildqzLsGqo(NodeCoordinator.HitTestSource p0, long p1, HitTestResult p2, int p3, boolean p4) {
        boolean z;
        LayoutNode[] layoutNodeArr;
        int size;
        LayoutNode layoutNode;
        boolean z2 = false;
        if (p0.shouldHitTestChildren(getLayoutNode())) {
            if (!m5922withinLayerBoundsk4lQ0M(p1)) {
                if (!PointerType.m5580equalsimpl0(p3, PointerType.INSTANCE.m5587getTouchT8wyACA()) || (Float.floatToRawIntBits(m5910distanceInMinimumTouchTargettz77jQw(p1, m5913getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) >= 2139095040) {
                }
                if (z2) {
                    int i = p2.hitDepth;
                    MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
                    layoutNodeArr = zSortedChildren.content;
                    for (size = zSortedChildren.getSize() - 1; size >= 0; size--) {
                        layoutNode = layoutNodeArr[size];
                        if (layoutNode.isPlaced()) {
                            p0.mo5923childHitTestqzLsGqo(layoutNode, p1, p2, p3, z);
                            if (p2.hasHit()) {
                                continue;
                            } else if (!layoutNode.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings()) {
                                break;
                            } else {
                                p2.acceptHits();
                            }
                        }
                    }
                    p2.hitDepth = i;
                }
            }
            z2 = p4;
            z = z2;
            z2 = true;
            if (z2) {
                int i2 = p2.hitDepth;
                MutableVector<LayoutNode> zSortedChildren2 = getLayoutNode().getZSortedChildren();
                layoutNodeArr = zSortedChildren2.content;
                while (size >= 0) {
                    layoutNode = layoutNodeArr[size];
                    if (layoutNode.isPlaced()) {
                        p0.mo5923childHitTestqzLsGqo(layoutNode, p1, p2, p3, z);
                        if (p2.hasHit()) {
                            continue;
                        } else {
                            if (!layoutNode.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings()) {
                                break;
                                break;
                            }
                            p2.acceptHits();
                        }
                    }
                }
                p2.hitDepth = i2;
            }
        }
        z = p4;
        if (z2) {
            int i3 = p2.hitDepth;
            MutableVector<LayoutNode> zSortedChildren3 = getLayoutNode().getZSortedChildren();
            layoutNodeArr = zSortedChildren3.content;
            while (size >= 0) {
                layoutNode = layoutNodeArr[size];
                if (layoutNode.isPlaced()) {
                    p0.mo5923childHitTestqzLsGqo(layoutNode, p1, p2, p3, z);
                    if (p2.hasHit()) {
                        continue;
                    } else {
                        if (!layoutNode.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings()) {
                            break;
                            break;
                        }
                        p2.acceptHits();
                    }
                }
            }
            p2.hitDepth = i3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4095setColor8_81llA(Color.INSTANCE.m4252getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo4099setStylek9PVt8s(PaintingStyle.INSTANCE.m4499getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }
}
