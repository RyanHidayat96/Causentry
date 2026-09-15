package androidx.compose.foundation.pager;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\b\tJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "Landroidx/compose/ui/unit/Density;", "", "p0", "p1", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "Fill", "Fixed"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PageSize {
    int calculateMainAxisPageSize(Density density, int i, int i2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "", "p0", "p1", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(Density density, int i, int i2) {
            return i;
        }

        private Fill() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n*\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Dp;", "p0", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/unit/Density;", "p1", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "pageSize", "F", "getPageSize-D9Ej5fM", "()F"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        private Fixed(float f) {
            this.pageSize = f;
        }

        /* JADX INFO: renamed from: getPageSize-D9Ej5fM, reason: not valid java name and from getter */
        public final float getPageSize() {
            return this.pageSize;
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(Density density, int i, int i2) {
            return density.mo688roundToPx0680j_4(this.pageSize);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 instanceof Fixed) {
                return Dp.m6940equalsimpl0(this.pageSize, ((Fixed) p0).pageSize);
            }
            return false;
        }

        public final int hashCode() {
            return Dp.m6941hashCodeimpl(this.pageSize);
        }

        public /* synthetic */ Fixed(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }
    }
}
