package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0005HÂ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u000bHÂ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u0010\u0010%\u001a\u00020$H×\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020'*\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020\u00058\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00101\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00102\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00104\u001a\u00020\u000b8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "", "p0", "Landroidx/compose/foundation/MarqueeAnimationMode;", "p1", "p2", "p3", "Landroidx/compose/foundation/MarqueeSpacing;", "p4", "Landroidx/compose/ui/unit/Dp;", "p5", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2-ZbEOnfQ", "component2", "component3", "component4", "component5", "()Landroidx/compose/foundation/MarqueeSpacing;", "component6-D9Ej5fM", "()F", "component6", "copy-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/foundation/MarqueeModifierElement;", "copy", "create", "()Landroidx/compose/foundation/MarqueeModifierNode;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "", "update", "(Landroidx/compose/foundation/MarqueeModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "animationMode", "I", "delayMillis", "initialDelayMillis", "iterations", "spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "velocity", "F"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    private MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        this.iterations = i;
        this.animationMode = i2;
        this.delayMillis = i3;
        this.initialDelayMillis = i4;
        this.spacing = marqueeSpacing;
        this.velocity = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final MarqueeModifierNode getNode() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(MarqueeModifierNode p0) {
        p0.m644updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m628boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m6933boximpl(this.velocity));
    }

    public /* synthetic */ MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getIterations() {
        return this.iterations;
    }

    /* JADX INFO: renamed from: component2-ZbEOnfQ, reason: not valid java name and from getter */
    private final int getAnimationMode() {
        return this.animationMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final int getDelayMillis() {
        return this.delayMillis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final int getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final MarqueeSpacing getSpacing() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    private final float getVelocity() {
        return this.velocity;
    }

    /* JADX INFO: renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m640copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marqueeModifierElement.iterations;
        }
        if ((i5 & 2) != 0) {
            i2 = marqueeModifierElement.animationMode;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = marqueeModifierElement.delayMillis;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = marqueeModifierElement.initialDelayMillis;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i5 & 32) != 0) {
            f = marqueeModifierElement.velocity;
        }
        return marqueeModifierElement.m641copylWfNwf4(i, i6, i7, i8, marqueeSpacing2, f);
    }

    /* JADX INFO: renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m641copylWfNwf4(int p0, int p1, int p2, int p3, MarqueeSpacing p4, float p5) {
        return new MarqueeModifierElement(p0, p1, p2, p3, p4, p5, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) p0;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m631equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && Intrinsics.areEqual(this.spacing, marqueeModifierElement.spacing) && Dp.m6940equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m632hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + Dp.m6941hashCodeimpl(this.velocity);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=");
        sb.append(this.iterations);
        sb.append(", animationMode=");
        sb.append((Object) MarqueeAnimationMode.m633toStringimpl(this.animationMode));
        sb.append(", delayMillis=");
        sb.append(this.delayMillis);
        sb.append(", initialDelayMillis=");
        sb.append(this.initialDelayMillis);
        sb.append(", spacing=");
        sb.append(this.spacing);
        sb.append(", velocity=");
        sb.append((Object) Dp.m6946toStringimpl(this.velocity));
        sb.append(')');
        return sb.toString();
    }
}
