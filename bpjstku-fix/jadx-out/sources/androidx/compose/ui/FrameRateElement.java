package androidx.compose.ui;

import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/FrameRateElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/FrameRateModifierNode;", "", "p0", "<init>", "(F)V", "create", "()Landroidx/compose/ui/FrameRateModifierNode;", "", "update", "(Landroidx/compose/ui/FrameRateModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/FrameRateElement;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "frameRate", "F", "getFrameRate"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FrameRateElement extends ModifierNodeElement<FrameRateModifierNode> {
    private final float frameRate;

    public final float getFrameRate() {
        return this.frameRate;
    }

    public FrameRateElement(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final FrameRateModifierNode getNode() {
        return new FrameRateModifierNode(this.frameRate);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(FrameRateModifierNode p0) {
        if (p0.getFrameRate() == this.frameRate) {
            return;
        }
        p0.setShouldUpdateFrameRates(true);
        p0.setFrameRate(this.frameRate);
        DrawModifierNodeKt.invalidateDraw(p0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FrameRateModifierNode");
        inspectorInfo.getProperties().set("frameRate", Float.valueOf(this.frameRate));
    }

    public static /* synthetic */ FrameRateElement copy$default(FrameRateElement frameRateElement, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = frameRateElement.frameRate;
        }
        return frameRateElement.copy(f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFrameRate() {
        return this.frameRate;
    }

    public final FrameRateElement copy(float p0) {
        return new FrameRateElement(p0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof FrameRateElement) && Float.compare(this.frameRate, ((FrameRateElement) p0).frameRate) == 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Float.hashCode(this.frameRate);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameRateElement(frameRate=");
        sb.append(this.frameRate);
        sb.append(')');
        return sb.toString();
    }
}
