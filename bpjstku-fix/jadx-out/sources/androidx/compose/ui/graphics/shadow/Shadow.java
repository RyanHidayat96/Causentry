package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0011BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010+\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010!"}, d2 = {"Landroidx/compose/ui/graphics/shadow/Shadow;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "Landroidx/compose/ui/unit/DpOffset;", "p2", "Landroidx/compose/ui/graphics/Color;", "p3", "Landroidx/compose/ui/graphics/Brush;", "p4", "", "p5", "Landroidx/compose/ui/graphics/BlendMode;", "p6", "<init>", "(FFJJLandroidx/compose/ui/graphics/Brush;FI)V", "(FLandroidx/compose/ui/graphics/Brush;FJFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(FJFJFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copyWithoutOffset$ui_graphics_release", "()Landroidx/compose/ui/graphics/shadow/Shadow;", "radius", "F", "getRadius-D9Ej5fM", "()F", "spread", "getSpread-D9Ej5fM", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-RKDOV3M", "()J", "blendMode", "I", "getBlendMode-0nO6VwU", TypedValues.Custom.S_COLOR, "getColor-0d7_KjU", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "alpha", "getAlpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Shadow {
    private final float alpha;
    private final int blendMode;
    private final Brush brush;
    private final long color;
    private final long offset;
    private final float radius;
    private final float spread;

    private Shadow(float f, float f2, long j, long j2, Brush brush, float f3, int i) {
        this.radius = f;
        this.spread = f2;
        this.offset = j;
        this.blendMode = i;
        if (brush instanceof SolidColor) {
            this.color = ((SolidColor) brush).getValue();
            this.brush = null;
        } else {
            this.color = j2;
            this.brush = brush;
        }
        this.alpha = RangesKt.coerceIn(f3, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getSpread-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpread() {
        return this.spread;
    }

    /* JADX INFO: renamed from: getOffset-RKDOV3M, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    private Shadow(float f, Brush brush, float f2, long j, float f3, int i) {
        this(f, f2, j, Color.INSTANCE.m4244getBlack0d7_KjU(), brush, f3, i);
    }

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i2 & 2) != 0 ? Color.INSTANCE.m4244getBlack0d7_KjU() : j, (i2 & 4) != 0 ? Dp.m6935constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.INSTANCE.m7006getZeroRKDOV3M() : j2, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : i, (DefaultConstructorMarker) null);
    }

    private Shadow(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? Color.INSTANCE.m4244getBlack0d7_KjU() : j, (Brush) null, f3, i);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) p0;
        return Dp.m6940equalsimpl0(this.radius, shadow.radius) && Dp.m6940equalsimpl0(this.spread, shadow.spread) && DpOffset.m6995equalsimpl0(this.offset, shadow.offset) && this.alpha == shadow.alpha && BlendMode.m4128equalsimpl0(this.blendMode, shadow.blendMode) && Color.m4219equalsimpl0(this.color, shadow.color) && Intrinsics.areEqual(this.brush, shadow.brush);
    }

    public final int hashCode() {
        int iM6941hashCodeimpl = Dp.m6941hashCodeimpl(this.radius);
        int iM6941hashCodeimpl2 = Dp.m6941hashCodeimpl(this.spread);
        int iM7000hashCodeimpl = DpOffset.m7000hashCodeimpl(this.offset);
        int iHashCode = Float.hashCode(this.alpha);
        int iM4129hashCodeimpl = BlendMode.m4129hashCodeimpl(this.blendMode);
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.color);
        Brush brush = this.brush;
        return (((((((((((iM6941hashCodeimpl * 31) + iM6941hashCodeimpl2) * 31) + iM7000hashCodeimpl) * 31) + iHashCode) * 31) + iM4129hashCodeimpl) * 31) + iM4225hashCodeimpl) * 31) + (brush != null ? brush.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowParams(radius=");
        sb.append((Object) Dp.m6946toStringimpl(this.radius));
        sb.append(", spread=");
        sb.append((Object) Dp.m6946toStringimpl(this.spread));
        sb.append(", offset=");
        sb.append((Object) DpOffset.m7003toStringimpl(this.offset));
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4130toStringimpl(this.blendMode));
        sb.append(", color=");
        sb.append((Object) Color.m4226toStringimpl(this.color));
        sb.append(", brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    public final Shadow copyWithoutOffset$ui_graphics_release() {
        return new Shadow(this.radius, this.spread, DpOffset.INSTANCE.m7006getZeroRKDOV3M(), this.color, this.brush, this.alpha, this.blendMode);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, (i2 & 4) != 0 ? Dp.m6935constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.INSTANCE.m7006getZeroRKDOV3M() : j, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : i, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, f2, j2, f3, i);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, f2, j, f3, i);
    }
}
