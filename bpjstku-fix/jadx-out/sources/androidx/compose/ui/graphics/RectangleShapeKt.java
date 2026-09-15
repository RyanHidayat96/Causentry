package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0001\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Shape;", "RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectangleShapeKt {
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public final Outline.Rectangle mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
            return new Outline.Rectangle(SizeKt.m4064toRectuvyYCjk(p0));
        }

        public final String toString() {
            return "RectangleShape";
        }
    };

    public static /* synthetic */ void getRectangleShape$annotations() {
    }

    public static final Shape getRectangleShape() {
        return RectangleShape;
    }
}
