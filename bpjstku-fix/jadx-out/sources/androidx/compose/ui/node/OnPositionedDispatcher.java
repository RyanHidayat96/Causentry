package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<init>", "()V", "", "isNotEmpty", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "p0", "", "onNodePositioned", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "onRootNodePositioned", "dispatch", "dispatchHierarchy", "Landroidx/compose/runtime/collection/MutableVector;", "layoutNodes", "Landroidx/compose/runtime/collection/MutableVector;", "", "cachedNodes", "[Landroidx/compose/ui/node/LayoutNode;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);
    public static final int $stable = 8;

    public final boolean isNotEmpty() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void onNodePositioned(LayoutNode p0) {
        if (p0.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.add(p0);
            p0.setNeedsOnGloballyPositionedDispatch$ui_release(true);
        }
    }

    public final void remove(LayoutNode p0) {
        this.layoutNodes.remove(p0);
    }

    public final void onRootNodePositioned(LayoutNode p0) {
        if (p0.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.clear();
            this.layoutNodes.add(p0);
            p0.setNeedsOnGloballyPositionedDispatch$ui_release(true);
        }
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i] = this.layoutNodes.content[i];
        }
        this.layoutNodes.clear();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            LayoutNode layoutNode = layoutNodeArr[i2];
            Intrinsics.checkNotNull(layoutNode);
            if (layoutNode.getNeedsOnGloballyPositionedDispatch()) {
                dispatchHierarchy(layoutNode);
            }
            layoutNodeArr[i2] = null;
        }
        this.cachedNodes = layoutNodeArr;
    }

    private final void dispatchHierarchy(LayoutNode p0) {
        if (p0.getGloballyPositionedObservers() > 0) {
            p0.dispatchOnPositionedCallbacks$ui_release();
            p0.setNeedsOnGloballyPositionedDispatch$ui_release(false);
            MutableVector<LayoutNode> mutableVector = p0.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                dispatchHierarchy(layoutNodeArr[i]);
            }
        }
    }
}
