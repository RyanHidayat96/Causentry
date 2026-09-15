package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.indirect.IndirectTouchInputModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\f¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\t\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\n¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0006*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u000e\"\u001c\u0010\u001f\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010'\"\u001a\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b(\u0010%\u0012\u0004\b)\u0010'\"\u001a\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b*\u0010%\u0012\u0004\b+\u0010'"}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "p0", "or-64DMado", "(II)I", "or", "", "contains-64DMado", "(II)Z", "contains", "Landroidx/compose/ui/Modifier$Element;", "calculateNodeKindSetFrom", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)I", "", "autoInvalidateRemovedNode", "(Landroidx/compose/ui/Modifier$Node;)V", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "p1", "p2", "autoInvalidateNodeIncludingDelegates", "(Landroidx/compose/ui/Modifier$Node;II)V", "autoInvalidateNodeSelf", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z", "calculateNodeKindSetFromIncludingDelegates", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "Landroidx/collection/MutableObjectIntMap;", "", "classToKindSetMap", "Landroidx/collection/MutableObjectIntMap;", "Updated", "I", "getUpdated$annotations", "()V", "Inserted", "getInserted$annotations", "Removed", "getRemoved$annotations"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final MutableObjectIntMap<Object> classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();

    /* JADX INFO: renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m5936contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m5938or64DMado(int i, int i2) {
        return i | i2;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int iFindKeyIndex = mutableObjectIntMap.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex >= 0) {
            return mutableObjectIntMap.values[iFindKeyIndex];
        }
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(131072);
        }
        if (node instanceof TraversableNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(524288);
        }
        if (node instanceof OnUnplacedModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(1048576);
        }
        if (node instanceof IndirectTouchInputModifierNode) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(2097152);
        }
        mutableObjectIntMap.set(objClassKeyForObject, iM5928constructorimpl);
        return iM5928constructorimpl;
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet() & i, i2);
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, (~selfKindSet$ui_release) & i, i2);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i & node.getKindSet(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m5928constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNodeKt.m5782requireCoordinator64DMado(node, NodeKind.m5928constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m5928constructorimpl(128) & i) != 0 && (node instanceof LayoutAwareModifierNode) && i2 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m5928constructorimpl(256) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(node);
                    layoutNodeRequireLayoutNode.setGloballyPositionedObservers(layoutNodeRequireLayoutNode.getGloballyPositionedObservers() + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(node);
                    layoutNodeRequireLayoutNode2.setGloballyPositionedObservers(layoutNodeRequireLayoutNode2.getGloballyPositionedObservers() - 1);
                }
                if (i2 != 2) {
                    DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui_release();
                }
            }
            if ((NodeKind.m5928constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m5928constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui_release(true);
            }
            if ((NodeKind.m5928constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m5928constructorimpl(2048) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
            if ((i & NodeKind.m5928constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker.INSTANCE.reset();
        focusPropertiesModifierNode.applyFocusProperties(CanFocusChecker.INSTANCE);
        return CanFocusChecker.INSTANCE.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m5937getIncludeSelfInTraversalH91voCI(int i) {
        return (i & NodeKind.m5928constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            iM5928constructorimpl |= NodeKind.m5928constructorimpl(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m5928constructorimpl(524288) | iM5928constructorimpl : iM5928constructorimpl;
    }
}
