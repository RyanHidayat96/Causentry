package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0015\u001a\u00020\u0012*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u0012*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H$¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010 \u001a\u00020\u0012*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0010H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\u0005R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Landroidx/compose/ui/graphics/shadow/ShadowRenderer;", "", "Landroidx/compose/ui/graphics/Outline;", "p0", "<init>", "(Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "p1", "Landroidx/compose/ui/graphics/Color;", "p2", "Landroidx/compose/ui/graphics/Brush;", "p3", "", "p4", "Landroidx/compose/ui/graphics/BlendMode;", "p5", "", "drawShadow-erFMhIw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/ColorFilter;JJLandroidx/compose/ui/graphics/Brush;FI)V", "drawShadow", "Landroidx/compose/ui/geometry/CornerRadius;", "Landroidx/compose/ui/graphics/Path;", "buildShadow-_SMYjrA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "buildShadow", "invalidateShadow", "()V", "p6", "onDrawShadow-MLmccfk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/Brush;I)V", "onDrawShadow", "obtainTint-8_81llA", "(J)Landroidx/compose/ui/graphics/ColorFilter;", "obtainTint", "updateParamsFromOutline", "outline", "Landroidx/compose/ui/graphics/Outline;", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "path", "Landroidx/compose/ui/graphics/Path;", "shadowTint", "Landroidx/compose/ui/graphics/ColorFilter;", "shadowTintColor", "J", "cornerRadius", "generatedSize", "Landroidx/compose/ui/unit/LayoutDirection;", "generatedLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "generatedDensity", "F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ShadowRenderer {
    private final Outline outline;
    private Path path;
    private ColorFilter shadowTint;
    private long shadowTintColor = Color.INSTANCE.m4254getUnspecified0d7_KjU();
    private long cornerRadius = CornerRadius.INSTANCE.m3946getZerokKHJgLs();
    private long generatedSize = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    private LayoutDirection generatedLayoutDirection = LayoutDirection.Ltr;
    private float generatedDensity = 1.0f;

    /* JADX INFO: renamed from: buildShadow-_SMYjrA */
    protected abstract void mo4935buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path);

    /* JADX INFO: renamed from: onDrawShadow-MLmccfk */
    protected abstract void mo4936onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i);

    public ShadowRenderer(Outline outline) {
        this.outline = outline;
    }

    public final Outline getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: drawShadow-erFMhIw, reason: not valid java name */
    public final void m4946drawShadowerFMhIw(DrawScope drawScope, ColorFilter colorFilter, long j, long j2, Brush brush, float f, int i) {
        ColorFilter colorFilterM4945obtainTint8_81llA;
        updateParamsFromOutline(this.outline);
        if (colorFilter == null) {
            colorFilterM4945obtainTint8_81llA = (brush != null || j2 == 16) ? null : m4945obtainTint8_81llA(j2);
        } else {
            colorFilterM4945obtainTint8_81llA = colorFilter;
        }
        long j3 = this.generatedSize;
        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats || !Size.m4039equalsimpl0(j3, j) || this.generatedLayoutDirection != drawScope.getLayoutDirection() || this.generatedDensity != drawScope.getDensity()) {
            mo4935buildShadow_SMYjrA(drawScope, j, this.cornerRadius, this.path);
            this.generatedSize = j;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        mo4936onDrawShadowMLmccfk(drawScope, j, this.cornerRadius, this.path, f, colorFilterM4945obtainTint8_81llA, brush, i);
    }

    public void invalidateShadow() {
        this.generatedSize = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        this.generatedLayoutDirection = LayoutDirection.Ltr;
        this.generatedDensity = 1.0f;
    }

    /* JADX INFO: renamed from: obtainTint-8_81llA, reason: not valid java name */
    private final ColorFilter m4945obtainTint8_81llA(long p0) {
        ColorFilter colorFilter = this.shadowTint;
        if (colorFilter != null && Color.m4219equalsimpl0(this.shadowTintColor, p0)) {
            return colorFilter;
        }
        ColorFilter colorFilterM4259tintxETnrds$default = ColorFilter.Companion.m4259tintxETnrds$default(ColorFilter.INSTANCE, p0, 0, 2, null);
        this.shadowTintColor = p0;
        this.shadowTint = colorFilterM4259tintxETnrds$default;
        return colorFilterM4259tintxETnrds$default;
    }

    private final void updateParamsFromOutline(Outline p0) {
        if (p0 instanceof Outline.Generic) {
            this.path = ((Outline.Generic) p0).getPath();
            this.cornerRadius = CornerRadius.INSTANCE.m3946getZerokKHJgLs();
            return;
        }
        if (p0 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) p0;
            if (RoundRectKt.isSimple(rounded.getRoundRect())) {
                this.path = null;
                this.cornerRadius = rounded.getRoundRect().m4024getTopLeftCornerRadiuskKHJgLs();
                return;
            } else {
                this.path = rounded.getRoundRectPath();
                this.cornerRadius = CornerRadius.INSTANCE.m3946getZerokKHJgLs();
                return;
            }
        }
        if (!(p0 instanceof Outline.Rectangle)) {
            throw new NoWhenBranchMatchedException();
        }
        this.path = null;
        this.cornerRadius = CornerRadius.INSTANCE.m3946getZerokKHJgLs();
    }
}
