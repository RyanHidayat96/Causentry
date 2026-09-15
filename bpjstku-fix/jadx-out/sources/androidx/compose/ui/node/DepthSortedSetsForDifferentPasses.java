package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nJA\u0010\u0012\u001a\u00020\f2/\b\u0004\u0010\u0003\u001a)\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0011\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0011\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "p0", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "p1", "contains", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/node/Invalidation;", "", "add", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/Invalidation;)V", "remove", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "popEach", "(Lkotlin/jvm/functions/Function3;)V", "isEmpty", "()Z", "isNotEmpty", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadAndAncestorMeasureSet", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadAndAncestorPlaceSet", "approachSet", "getAffectsLookaheadMeasure", "affectsLookaheadMeasure"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet approachSet;
    private final DepthSortedSet lookaheadAndAncestorMeasureSet;
    private final DepthSortedSet lookaheadAndAncestorPlaceSet;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new DepthSortedSet(z);
        this.lookaheadAndAncestorPlaceSet = new DepthSortedSet(z);
        this.approachSet = new DepthSortedSet(z);
    }

    public final boolean contains(LayoutNode p0, boolean p1) {
        boolean z = p0.getLookaheadRoot() == null;
        boolean z2 = this.lookaheadAndAncestorMeasureSet.contains(p0) || this.lookaheadAndAncestorPlaceSet.contains(p0);
        if (p1) {
            return !z && z2;
        }
        return (z && z2) || this.approachSet.contains(p0);
    }

    public final boolean contains(LayoutNode p0) {
        return this.lookaheadAndAncestorMeasureSet.contains(p0) || this.lookaheadAndAncestorPlaceSet.contains(p0) || this.approachSet.contains(p0);
    }

    public final void add(LayoutNode p0, Invalidation p1) {
        int i = WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i == 1) {
            this.lookaheadAndAncestorMeasureSet.add(p0);
            this.approachSet.add(p0);
            return;
        }
        if (i == 2) {
            this.lookaheadAndAncestorPlaceSet.add(p0);
            this.approachSet.add(p0);
            return;
        }
        if (i == 3) {
            if (p0.getLookaheadRoot() != null) {
                this.approachSet.add(p0);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.add(p0);
                return;
            }
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (p0.getLookaheadRoot() != null) {
            this.approachSet.add(p0);
        } else {
            this.lookaheadAndAncestorPlaceSet.add(p0);
        }
    }

    public final boolean remove(LayoutNode p0) {
        return this.approachSet.remove(p0) || this.lookaheadAndAncestorMeasureSet.remove(p0) || this.lookaheadAndAncestorPlaceSet.remove(p0);
    }

    public final void popEach(Function3<? super LayoutNode, ? super Boolean, ? super Boolean, Unit> p0) {
        LayoutNode layoutNodePop;
        while (true) {
            boolean z = false;
            boolean z2 = true;
            if (!this.lookaheadAndAncestorMeasureSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorMeasureSet.pop();
                z2 = false;
                z = layoutNodePop.getLookaheadRoot() != null;
            } else if (!this.lookaheadAndAncestorPlaceSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorPlaceSet.pop();
                if (layoutNodePop.getLookaheadRoot() != null) {
                    z = true;
                }
            } else if (this.approachSet.isEmpty()) {
                return;
            } else {
                layoutNodePop = this.approachSet.pop();
            }
            p0.invoke(layoutNodePop, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public final boolean isEmpty() {
        return this.lookaheadAndAncestorMeasureSet.isEmpty() && this.approachSet.isEmpty() && this.lookaheadAndAncestorPlaceSet.isEmpty();
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.approachSet.isEmpty() || this.lookaheadAndAncestorMeasureSet.isEmpty()) ? false : true;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
