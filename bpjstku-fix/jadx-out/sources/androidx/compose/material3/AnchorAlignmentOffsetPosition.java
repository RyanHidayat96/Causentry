package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition;", "", "<init>", "()V", "Horizontal", "Vertical"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;
    public static final AnchorAlignmentOffsetPosition INSTANCE = new AnchorAlignmentOffsetPosition();

    private AnchorAlignmentOffsetPosition() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ2\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;", "Landroidx/compose/material3/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "p1", "", "p2", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V", "component1", "()Landroidx/compose/ui/Alignment$Horizontal;", "component2", "component3", "()I", "copy", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "p3", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "position", "", "toString", "()Ljava/lang/String;", "anchorAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "menuAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal anchorAlignment;
        private final Alignment.Horizontal menuAlignment;
        private final int offset;

        public Horizontal(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i) {
            this.menuAlignment = horizontal;
            this.anchorAlignment = horizontal2;
            this.offset = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Horizontal
        /* JADX INFO: renamed from: position-95KtPRI, reason: not valid java name */
        public final int mo1753position95KtPRI(IntRect p0, long p1, int p2, LayoutDirection p3) {
            int iAlign = this.anchorAlignment.align(0, p0.getWidth(), p3);
            return p0.getLeft() + iAlign + (-this.menuAlignment.align(0, p2, p3)) + (p3 == LayoutDirection.Ltr ? this.offset : -this.offset);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Alignment.Horizontal getMenuAlignment() {
            return this.menuAlignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Alignment.Horizontal getAnchorAlignment() {
            return this.anchorAlignment;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        private final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, Alignment.Horizontal horizontal3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.menuAlignment;
            }
            if ((i2 & 2) != 0) {
                horizontal3 = horizontal.anchorAlignment;
            }
            if ((i2 & 4) != 0) {
                i = horizontal.offset;
            }
            return horizontal.copy(horizontal2, horizontal3, i);
        }

        public final Horizontal copy(Alignment.Horizontal p0, Alignment.Horizontal p1, int p2) {
            return new Horizontal(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) p0;
            return Intrinsics.areEqual(this.menuAlignment, horizontal.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, horizontal.anchorAlignment) && this.offset == horizontal.offset;
        }

        public final int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
            sb.append(this.menuAlignment);
            sb.append(", anchorAlignment=");
            sb.append(this.anchorAlignment);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ*\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Vertical;", "Landroidx/compose/material3/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "p0", "p1", "", "p2", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)V", "component1", "()Landroidx/compose/ui/Alignment$Vertical;", "component2", "component3", "()I", "copy", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Vertical;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "position", "", "toString", "()Ljava/lang/String;", "anchorAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "menuAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical anchorAlignment;
        private final Alignment.Vertical menuAlignment;
        private final int offset;

        public Vertical(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i) {
            this.menuAlignment = vertical;
            this.anchorAlignment = vertical2;
            this.offset = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Vertical
        /* JADX INFO: renamed from: position-JVtK1S4, reason: not valid java name */
        public final int mo1754positionJVtK1S4(IntRect p0, long p1, int p2) {
            int iAlign = this.anchorAlignment.align(0, p0.getHeight());
            return p0.getTop() + iAlign + (-this.menuAlignment.align(0, p2)) + this.offset;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Alignment.Vertical getMenuAlignment() {
            return this.menuAlignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Alignment.Vertical getAnchorAlignment() {
            return this.anchorAlignment;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        private final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, Alignment.Vertical vertical3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.menuAlignment;
            }
            if ((i2 & 2) != 0) {
                vertical3 = vertical.anchorAlignment;
            }
            if ((i2 & 4) != 0) {
                i = vertical.offset;
            }
            return vertical.copy(vertical2, vertical3, i);
        }

        public final Vertical copy(Alignment.Vertical p0, Alignment.Vertical p1, int p2) {
            return new Vertical(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) p0;
            return Intrinsics.areEqual(this.menuAlignment, vertical.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
        }

        public final int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
            sb.append(this.menuAlignment);
            sb.append(", anchorAlignment=");
            sb.append(this.anchorAlignment);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(')');
            return sb.toString();
        }
    }
}
