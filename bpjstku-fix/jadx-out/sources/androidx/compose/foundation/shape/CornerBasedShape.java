package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u000bJ*\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH'ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/foundation/shape/CornerSize;", "p0", "p1", "p2", "p3", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "p4", "p5", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "bottomEnd", "Landroidx/compose/foundation/shape/CornerSize;", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "bottomStart", "getBottomStart", "topEnd", "getTopEnd", "topStart", "getTopStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public abstract CornerBasedShape copy(CornerSize p0, CornerSize p1, CornerSize p2, CornerSize p3);

    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1268createOutlineLjSzlW0(long p0, float p1, float p2, float p3, float p4, LayoutDirection p5);

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
        float fMo1276toPxTmRCtEA = this.topStart.mo1276toPxTmRCtEA(p0, p2);
        float fMo1276toPxTmRCtEA2 = this.topEnd.mo1276toPxTmRCtEA(p0, p2);
        float fMo1276toPxTmRCtEA3 = this.bottomEnd.mo1276toPxTmRCtEA(p0, p2);
        float fMo1276toPxTmRCtEA4 = this.bottomStart.mo1276toPxTmRCtEA(p0, p2);
        float fM4042getMinDimensionimpl = Size.m4042getMinDimensionimpl(p0);
        float f = fMo1276toPxTmRCtEA + fMo1276toPxTmRCtEA4;
        if (f > fM4042getMinDimensionimpl) {
            float f2 = fM4042getMinDimensionimpl / f;
            fMo1276toPxTmRCtEA *= f2;
            fMo1276toPxTmRCtEA4 *= f2;
        }
        float f3 = fMo1276toPxTmRCtEA4;
        float f4 = fMo1276toPxTmRCtEA2 + fMo1276toPxTmRCtEA3;
        if (f4 > fM4042getMinDimensionimpl) {
            float f5 = fM4042getMinDimensionimpl / f4;
            fMo1276toPxTmRCtEA2 *= f5;
            fMo1276toPxTmRCtEA3 *= f5;
        }
        if (fMo1276toPxTmRCtEA < 0.0f || fMo1276toPxTmRCtEA2 < 0.0f || fMo1276toPxTmRCtEA3 < 0.0f || f3 < 0.0f) {
            StringBuilder sb = new StringBuilder("Corner size in Px can't be negative(topStart = ");
            sb.append(fMo1276toPxTmRCtEA);
            sb.append(", topEnd = ");
            sb.append(fMo1276toPxTmRCtEA2);
            sb.append(", bottomEnd = ");
            sb.append(fMo1276toPxTmRCtEA3);
            sb.append(", bottomStart = ");
            sb.append(f3);
            sb.append(")!");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return mo1268createOutlineLjSzlW0(p0, fMo1276toPxTmRCtEA, fMo1276toPxTmRCtEA2, fMo1276toPxTmRCtEA3, f3, p1);
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize p0) {
        return copy(p0, p0, p0, p0);
    }
}
