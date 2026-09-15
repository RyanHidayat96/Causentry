package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/geometry/Offset;", "p0", "Landroidx/compose/ui/geometry/Rect;", "p1", "", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "compare", "p2", "", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "isSelected", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "containsInclusive", "Vertical", "Horizontal"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public final int mo1708compare3MmeM6k$foundation_release(long p0, Rect p1) {
            if (SelectionManagerKt.m1701containsInclusiveUv8p0NA(p1, p0)) {
                return 0;
            }
            if (Offset.m3975getYimpl(p0) < p1.getTop()) {
                return -1;
            }
            return (Offset.m3974getXimpl(p0) >= p1.getLeft() || Offset.m3975getYimpl(p0) >= p1.getBottom()) ? 1 : -1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public final int mo1708compare3MmeM6k$foundation_release(long p0, Rect p1) {
            if (SelectionManagerKt.m1701containsInclusiveUv8p0NA(p1, p0)) {
                return 0;
            }
            if (Offset.m3974getXimpl(p0) < p1.getLeft()) {
                return -1;
            }
            return (Offset.m3975getYimpl(p0) >= p1.getTop() || Offset.m3974getXimpl(p0) >= p1.getRight()) ? 1 : -1;
        }
    };

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1708compare3MmeM6k$foundation_release(long p0, Rect p1);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1709isSelected2x9bVx0$foundation_release(Rect p0, long p1, long p2) {
        if (m1707containsInclusiveUv8p0NA(p0, p1) || m1707containsInclusiveUv8p0NA(p0, p2)) {
            return true;
        }
        return (mo1708compare3MmeM6k$foundation_release(p1, p0) > 0) ^ (mo1708compare3MmeM6k$foundation_release(p2, p0) > 0);
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1707containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fM3974getXimpl = Offset.m3974getXimpl(j);
        if (left > fM3974getXimpl || fM3974getXimpl > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float fM3975getYimpl = Offset.m3975getYimpl(j);
        return top <= fM3975getYimpl && fM3975getYimpl <= bottom;
    }

    /* synthetic */ SelectionMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
