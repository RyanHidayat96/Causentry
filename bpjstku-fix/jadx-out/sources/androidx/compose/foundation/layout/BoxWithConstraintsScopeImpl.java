package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u001b*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u00020\u00058\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020&8WX\u0096\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\u00020&8WX\u0096\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010-\u001a\u00020&8WX\u0096\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0017\u0010/\u001a\u00020&8WX\u0096\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Density;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/unit/Density;", "component2-msEJaDk", "()J", "component2", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "copy", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;", "matchParentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "constraints", "J", "getConstraints-msEJaDk", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "getMaxHeight-D9Ej5fM", "()F", "maxHeight", "getMaxWidth-D9Ej5fM", "maxWidth", "getMinHeight-D9Ej5fM", "minHeight", "getMinWidth-D9Ej5fM", "minWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    private BoxWithConstraintsScopeImpl(Density density, long j) {
        this.density = density;
        this.constraints = j;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public final long mo909getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public final float mo913getMinWidthD9Ej5fM() {
        return this.density.mo691toDpu2uoSUM(Constraints.m6890getMinWidthimpl(mo909getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public final float mo911getMaxWidthD9Ej5fM() {
        return Constraints.m6884getHasBoundedWidthimpl(mo909getConstraintsmsEJaDk()) ? this.density.mo691toDpu2uoSUM(Constraints.m6888getMaxWidthimpl(mo909getConstraintsmsEJaDk())) : Dp.INSTANCE.m6954getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public final float mo912getMinHeightD9Ej5fM() {
        return this.density.mo691toDpu2uoSUM(Constraints.m6889getMinHeightimpl(mo909getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public final float mo910getMaxHeightD9Ej5fM() {
        return Constraints.m6883getHasBoundedHeightimpl(mo909getConstraintsmsEJaDk()) ? this.density.mo691toDpu2uoSUM(Constraints.m6887getMaxHeightimpl(mo909getConstraintsmsEJaDk())) : Dp.INSTANCE.m6954getInfinityD9Ej5fM();
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m914copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i & 2) != 0) {
            j = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m916copy0kLqBqw(density, j);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m916copy0kLqBqw(Density p0, long p1) {
        return new BoxWithConstraintsScopeImpl(p0, p1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) p0;
        return Intrinsics.areEqual(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m6881equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    public final int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m6891hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxWithConstraintsScopeImpl(density=");
        sb.append(this.density);
        sb.append(", constraints=");
        sb.append((Object) Constraints.m6893toStringimpl(this.constraints));
        sb.append(')');
        return sb.toString();
    }
}
