package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B6\u0012-\u0010\t\u001a)\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R;\u0010\u001a\u001a)\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "p1", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "builder", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final Function3<Path, Size, LayoutDirection, Unit> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(Function3<? super Path, ? super Size, ? super LayoutDirection, Unit> function3) {
        this.builder = function3;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m4031boximpl(p0), p1);
        Path.close();
        return new Outline.Generic(Path);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        GenericShape genericShape = p0 instanceof GenericShape ? (GenericShape) p0 : null;
        return (genericShape != null ? genericShape.builder : null) == this.builder;
    }

    public final int hashCode() {
        return this.builder.hashCode();
    }
}
