package androidx.compose.ui.text;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/CircleShape;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
        float fM4042getMinDimensionimpl = Size.m4042getMinDimensionimpl(p0) / 2.0f;
        long jM3928constructorimpl = CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(fM4042getMinDimensionimpl)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM4042getMinDimensionimpl)) << 32));
        return new Outline.Rounded(RoundRectKt.m4026RoundRectZAM2FJo(SizeKt.m4064toRectuvyYCjk(p0), jM3928constructorimpl, jM3928constructorimpl, jM3928constructorimpl, jM3928constructorimpl));
    }
}
