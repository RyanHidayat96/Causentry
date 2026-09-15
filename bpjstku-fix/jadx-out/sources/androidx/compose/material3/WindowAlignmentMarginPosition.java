package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/WindowAlignmentMarginPosition;", "", "<init>", "()V", "Horizontal", "Vertical"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final WindowAlignmentMarginPosition INSTANCE = new WindowAlignmentMarginPosition();

    private WindowAlignmentMarginPosition() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ2\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/WindowAlignmentMarginPosition$Horizontal;", "Landroidx/compose/material3/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "", "p1", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;I)V", "component1", "()Landroidx/compose/ui/Alignment$Horizontal;", "component2", "()I", "copy", "(Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/WindowAlignmentMarginPosition$Horizontal;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "p2", "Landroidx/compose/ui/unit/LayoutDirection;", "p3", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "position", "", "toString", "()Ljava/lang/String;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "margin", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;
        private final int margin;

        public Horizontal(Alignment.Horizontal horizontal, int i) {
            this.alignment = horizontal;
            this.margin = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Horizontal
        /* JADX INFO: renamed from: position-95KtPRI */
        public final int mo1753position95KtPRI(IntRect p0, long p1, int p2, LayoutDirection p3) {
            if (p2 >= IntSize.m7106getWidthimpl(p1) - (this.margin * 2)) {
                return Alignment.INSTANCE.getCenterHorizontally().align(p2, IntSize.m7106getWidthimpl(p1), p3);
            }
            return RangesKt.coerceIn(this.alignment.align(p2, IntSize.m7106getWidthimpl(p1), p3), this.margin, (IntSize.m7106getWidthimpl(p1) - this.margin) - p2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Alignment.Horizontal getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final int getMargin() {
            return this.margin;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.alignment;
            }
            if ((i2 & 2) != 0) {
                i = horizontal.margin;
            }
            return horizontal.copy(horizontal2, i);
        }

        public final Horizontal copy(Alignment.Horizontal p0, int p1) {
            return new Horizontal(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) p0;
            return Intrinsics.areEqual(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
        }

        public final int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            sb.append(this.margin);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/WindowAlignmentMarginPosition$Vertical;", "Landroidx/compose/material3/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "p0", "", "p1", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;I)V", "component1", "()Landroidx/compose/ui/Alignment$Vertical;", "component2", "()I", "copy", "(Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/WindowAlignmentMarginPosition$Vertical;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "p2", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "position", "", "toString", "()Ljava/lang/String;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "margin", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical alignment;
        private final int margin;

        public Vertical(Alignment.Vertical vertical, int i) {
            this.alignment = vertical;
            this.margin = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Vertical
        /* JADX INFO: renamed from: position-JVtK1S4 */
        public final int mo1754positionJVtK1S4(IntRect p0, long p1, int p2) {
            if (p2 >= IntSize.m7105getHeightimpl(p1) - (this.margin * 2)) {
                return Alignment.INSTANCE.getCenterVertically().align(p2, IntSize.m7105getHeightimpl(p1));
            }
            return RangesKt.coerceIn(this.alignment.align(p2, IntSize.m7105getHeightimpl(p1)), this.margin, (IntSize.m7105getHeightimpl(p1) - this.margin) - p2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Alignment.Vertical getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final int getMargin() {
            return this.margin;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.alignment;
            }
            if ((i2 & 2) != 0) {
                i = vertical.margin;
            }
            return vertical.copy(vertical2, i);
        }

        public final Vertical copy(Alignment.Vertical p0, int p1) {
            return new Vertical(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) p0;
            return Intrinsics.areEqual(this.alignment, vertical.alignment) && this.margin == vertical.margin;
        }

        public final int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vertical(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            sb.append(this.margin);
            sb.append(')');
            return sb.toString();
        }
    }
}
