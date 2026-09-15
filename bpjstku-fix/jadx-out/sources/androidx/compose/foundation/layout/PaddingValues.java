package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0012\u0010\u0005\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateBottomPadding", "Landroidx/compose/ui/unit/LayoutDirection;", "p0", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateTopPadding-D9Ej5fM", "calculateTopPadding", "Absolute"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaddingValues {
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    float getBottom();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    float mo953calculateLeftPaddingu2uoSUM(LayoutDirection p0);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    float mo954calculateRightPaddingu2uoSUM(LayoutDirection p0);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    float getTop();

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0013\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!R\u001d\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u0012\u0004\b#\u0010!R\u001d\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001f\u0012\u0004\b%\u0010!R\u001d\u0010&\u001a\u00020\u00028\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001f\u0012\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "calculateBottomPadding-D9Ej5fM", "()F", "calculateBottomPadding", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateTopPadding-D9Ej5fM", "calculateTopPadding", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "bottom", "F", "getBottom-D9Ej5fM$annotations", "()V", "left", "getLeft-D9Ej5fM$annotations", "right", "getRight-D9Ej5fM$annotations", "top", "getTop-D9Ej5fM$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1015getBottomD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1016getLeftD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1017getRightD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1018getTopD9Ej5fM$annotations() {
        }

        private Absolute(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Left padding must be non-negative".toString());
            }
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Top padding must be non-negative".toString());
            }
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Right padding must be non-negative".toString());
            }
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
            }
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public final float mo953calculateLeftPaddingu2uoSUM(LayoutDirection p0) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public final float mo954calculateRightPaddingu2uoSUM(LayoutDirection p0) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
        public final float getBottom() {
            return this.bottom;
        }

        public final boolean equals(Object p0) {
            if (!(p0 instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) p0;
            return Dp.m6940equalsimpl0(this.left, absolute.left) && Dp.m6940equalsimpl0(this.top, absolute.top) && Dp.m6940equalsimpl0(this.right, absolute.right) && Dp.m6940equalsimpl0(this.bottom, absolute.bottom);
        }

        public final int hashCode() {
            int iM6941hashCodeimpl = Dp.m6941hashCodeimpl(this.left);
            return (((((iM6941hashCodeimpl * 31) + Dp.m6941hashCodeimpl(this.top)) * 31) + Dp.m6941hashCodeimpl(this.right)) * 31) + Dp.m6941hashCodeimpl(this.bottom);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaddingValues.Absolute(left=");
            sb.append((Object) Dp.m6946toStringimpl(this.left));
            sb.append(", top=");
            sb.append((Object) Dp.m6946toStringimpl(this.top));
            sb.append(", right=");
            sb.append((Object) Dp.m6946toStringimpl(this.right));
            sb.append(", bottom=");
            sb.append((Object) Dp.m6946toStringimpl(this.bottom));
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Dp.m6935constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m6935constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m6935constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m6935constructorimpl(0.0f) : f4, null);
        }

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4);
        }
    }
}
