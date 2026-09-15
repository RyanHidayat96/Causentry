package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Color;", "p0", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/graphics/Paint;", "p1", "", "p2", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "value", "J", "getValue-0d7_KjU", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SolidColor extends Brush {
    private final long value;

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo4164applyToPq9zytI(long p0, Paint p1, float p2) {
        long jM4217copywmQWz5c$default;
        p1.setAlpha(1.0f);
        if (p2 != 1.0f) {
            long j = this.value;
            jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(j, Color.m4220getAlphaimpl(j) * p2, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM4217copywmQWz5c$default = this.value;
        }
        p1.mo4095setColor8_81llA(jM4217copywmQWz5c$default);
        if (p1.getShader() != null) {
            p1.setShader(null);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof SolidColor) && Color.m4219equalsimpl0(this.value, ((SolidColor) p0).value);
    }

    public final int hashCode() {
        return Color.m4225hashCodeimpl(this.value);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidColor(value=");
        sb.append((Object) Color.m4226toStringimpl(this.value));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
