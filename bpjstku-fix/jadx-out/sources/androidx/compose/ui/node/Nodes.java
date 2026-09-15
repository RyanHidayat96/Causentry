package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\u0007R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\u0007R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0007R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u0007R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0007R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0007R!\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u0007R!\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u0007R!\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\u0007R!\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\u0007R!\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u0007R!\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010\u0007R!\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\u0007R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\u0007R!\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u0007R!\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bG\u0010\u0007R!\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0003\u001a\u0004\bK\u0010\u0007R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0003\u001a\u0004\bO\u0010\u0007R!\u0010U\u001a\b\u0012\u0004\u0012\u00020R0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0003\u001a\u0004\bS\u0010\u0007R!\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0003\u001a\u0004\bW\u0010\u0007"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw", "()I", "getAny-OLwlOKw$annotations", "Any", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw", "getLayout-OLwlOKw$annotations", "Layout", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw", "getDraw-OLwlOKw$annotations", "Draw", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw", "getSemantics-OLwlOKw$annotations", "Semantics", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw", "getPointerInput-OLwlOKw$annotations", "PointerInput", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getLocals-OLwlOKw", "getLocals-OLwlOKw$annotations", "Locals", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw", "getParentData-OLwlOKw$annotations", "ParentData", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getLayoutAware-OLwlOKw", "getLayoutAware-OLwlOKw$annotations", "LayoutAware", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw", "getGlobalPositionAware-OLwlOKw$annotations", "GlobalPositionAware", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachMeasure-OLwlOKw", "getApproachMeasure-OLwlOKw$annotations", "ApproachMeasure", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTarget-OLwlOKw", "getFocusTarget-OLwlOKw$annotations", "FocusTarget", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw", "getFocusProperties-OLwlOKw$annotations", "FocusProperties", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw", "getFocusEvent-OLwlOKw$annotations", "FocusEvent", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw", "getKeyInput-OLwlOKw$annotations", "KeyInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw", "getRotaryInput-OLwlOKw$annotations", "RotaryInput", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "getCompositionLocalConsumer-OLwlOKw", "getCompositionLocalConsumer-OLwlOKw$annotations", "CompositionLocalConsumer", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "getSoftKeyboardKeyInput-OLwlOKw", "getSoftKeyboardKeyInput-OLwlOKw$annotations", "SoftKeyboardKeyInput", "Landroidx/compose/ui/node/TraversableNode;", "getTraversable-OLwlOKw", "getTraversable-OLwlOKw$annotations", "Traversable", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "getBringIntoView-OLwlOKw", "getBringIntoView-OLwlOKw$annotations", "BringIntoView", "Landroidx/compose/ui/node/OnUnplacedModifierNode;", "getUnplaced-OLwlOKw", "getUnplaced-OLwlOKw$annotations", "Unplaced", "Landroidx/compose/ui/input/indirect/IndirectTouchInputModifierNode;", "getIndirectTouchInput-OLwlOKw", "getIndirectTouchInput-OLwlOKw$annotations", "IndirectTouchInput"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Nodes {
    public static final int $stable = 0;
    public static final Nodes INSTANCE = new Nodes();

    @JvmStatic
    /* JADX INFO: renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5940getAnyOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getApproachMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5942getApproachMeasureOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getBringIntoView-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5944getBringIntoViewOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getCompositionLocalConsumer-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5946getCompositionLocalConsumerOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5948getDrawOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5950getFocusEventOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5952getFocusPropertiesOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5954getFocusTargetOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5956getGlobalPositionAwareOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getIndirectTouchInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5958getIndirectTouchInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5960getKeyInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5962getLayoutOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5964getLayoutAwareOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5966getLocalsOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5968getParentDataOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5970getPointerInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5972getRotaryInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5974getSemanticsOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getSoftKeyboardKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5976getSoftKeyboardKeyInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getTraversable-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5978getTraversableOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getUnplaced-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5980getUnplacedOLwlOKw$annotations() {
    }

    private Nodes() {
    }

    /* JADX INFO: renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m5939getAnyOLwlOKw() {
        return NodeKind.m5928constructorimpl(1);
    }

    /* JADX INFO: renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m5961getLayoutOLwlOKw() {
        return NodeKind.m5928constructorimpl(2);
    }

    /* JADX INFO: renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m5947getDrawOLwlOKw() {
        return NodeKind.m5928constructorimpl(4);
    }

    /* JADX INFO: renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m5973getSemanticsOLwlOKw() {
        return NodeKind.m5928constructorimpl(8);
    }

    /* JADX INFO: renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m5969getPointerInputOLwlOKw() {
        return NodeKind.m5928constructorimpl(16);
    }

    /* JADX INFO: renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m5965getLocalsOLwlOKw() {
        return NodeKind.m5928constructorimpl(32);
    }

    /* JADX INFO: renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m5967getParentDataOLwlOKw() {
        return NodeKind.m5928constructorimpl(64);
    }

    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw, reason: not valid java name */
    public static final int m5963getLayoutAwareOLwlOKw() {
        return NodeKind.m5928constructorimpl(128);
    }

    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m5955getGlobalPositionAwareOLwlOKw() {
        return NodeKind.m5928constructorimpl(256);
    }

    /* JADX INFO: renamed from: getApproachMeasure-OLwlOKw, reason: not valid java name */
    public static final int m5941getApproachMeasureOLwlOKw() {
        return NodeKind.m5928constructorimpl(512);
    }

    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m5953getFocusTargetOLwlOKw() {
        return NodeKind.m5928constructorimpl(1024);
    }

    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m5951getFocusPropertiesOLwlOKw() {
        return NodeKind.m5928constructorimpl(2048);
    }

    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m5949getFocusEventOLwlOKw() {
        return NodeKind.m5928constructorimpl(4096);
    }

    /* JADX INFO: renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5959getKeyInputOLwlOKw() {
        return NodeKind.m5928constructorimpl(8192);
    }

    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m5971getRotaryInputOLwlOKw() {
        return NodeKind.m5928constructorimpl(16384);
    }

    /* JADX INFO: renamed from: getCompositionLocalConsumer-OLwlOKw, reason: not valid java name */
    public static final int m5945getCompositionLocalConsumerOLwlOKw() {
        return NodeKind.m5928constructorimpl(32768);
    }

    /* JADX INFO: renamed from: getSoftKeyboardKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5975getSoftKeyboardKeyInputOLwlOKw() {
        return NodeKind.m5928constructorimpl(131072);
    }

    /* JADX INFO: renamed from: getTraversable-OLwlOKw, reason: not valid java name */
    public static final int m5977getTraversableOLwlOKw() {
        return NodeKind.m5928constructorimpl(262144);
    }

    /* JADX INFO: renamed from: getBringIntoView-OLwlOKw, reason: not valid java name */
    public static final int m5943getBringIntoViewOLwlOKw() {
        return NodeKind.m5928constructorimpl(524288);
    }

    /* JADX INFO: renamed from: getUnplaced-OLwlOKw, reason: not valid java name */
    public static final int m5979getUnplacedOLwlOKw() {
        return NodeKind.m5928constructorimpl(1048576);
    }

    /* JADX INFO: renamed from: getIndirectTouchInput-OLwlOKw, reason: not valid java name */
    public static final int m5957getIndirectTouchInputOLwlOKw() {
        return NodeKind.m5928constructorimpl(2097152);
    }
}
