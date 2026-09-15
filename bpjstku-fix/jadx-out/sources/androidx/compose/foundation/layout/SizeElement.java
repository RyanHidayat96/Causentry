package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR%\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010\"R\u0017\u0010$\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010\"R\u0017\u0010%\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010\"\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "", "p4", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p5", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/layout/SizeNode;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "update", "(Landroidx/compose/foundation/layout/SizeNode;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "enforceIncoming", "Z", "inspectorInfo", "Lkotlin/jvm/functions/Function1;", "maxHeight", "F", "maxWidth", "minHeight", "minWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM() : f4, z, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f, float f2, float f3, float f4, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
        this.inspectorInfo = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final SizeNode getNode() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(SizeNode p0) {
        p0.m1063setMinWidth0680j_4(this.minWidth);
        p0.m1062setMinHeight0680j_4(this.minHeight);
        p0.m1061setMaxWidth0680j_4(this.maxWidth);
        p0.m1060setMaxHeight0680j_4(this.maxHeight);
        p0.setEnforceIncoming(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) p0;
        return Dp.m6940equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m6940equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m6940equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m6940equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM6941hashCodeimpl = Dp.m6941hashCodeimpl(this.minWidth);
        int iM6941hashCodeimpl2 = Dp.m6941hashCodeimpl(this.minHeight);
        return (((((((iM6941hashCodeimpl * 31) + iM6941hashCodeimpl2) * 31) + Dp.m6941hashCodeimpl(this.maxWidth)) * 31) + Dp.m6941hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }
}
