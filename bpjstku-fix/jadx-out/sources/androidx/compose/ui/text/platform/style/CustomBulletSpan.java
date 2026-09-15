package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jw\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010-"}, d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "Landroidx/compose/ui/graphics/Shape;", "p0", "", "p1", "p2", "p3", "Landroidx/compose/ui/graphics/Brush;", "p4", "p5", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "p6", "Landroidx/compose/ui/unit/Density;", "p7", "p8", "<init>", "(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/unit/Density;F)V", "", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "", "p9", "p10", "Landroid/text/Layout;", "p11", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "bulletWidthPx", "F", "bulletHeightPx", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "density", "Landroidx/compose/ui/unit/Density;", "minimumRequiredIndent", "I", "diff"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 8;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    public CustomBulletSpan(Shape shape, float f, float f2, float f3, Brush brush, float f4, DrawStyle drawStyle, Density density, float f5) {
        this.shape = shape;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = brush;
        this.alpha = f4;
        this.drawStyle = drawStyle;
        this.density = density;
        int iRoundToInt = MathKt.roundToInt(f + f3);
        this.minimumRequiredIndent = iRoundToInt;
        this.diff = MathKt.roundToInt(f5) - iRoundToInt;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean p0) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas p0, final Paint p1, int p2, final int p3, int p4, int p5, int p6, CharSequence p7, int p8, int p9, boolean p10, Layout p11) {
        if (p0 != null) {
            final float f = (p4 + p6) / 2.0f;
            final int iCoerceAtLeast = RangesKt.coerceAtLeast(p2 - this.minimumRequiredIndent, 0);
            Intrinsics.checkNotNull(p7, "");
            if (((Spanned) p7).getSpanStart(this) != p8 || p1 == null) {
                return;
            }
            Paint.Style style = p1.getStyle();
            BulletSpan_androidKt.setDrawStyle(p1, this.drawStyle);
            final long jM4034constructorimpl = Size.m4034constructorimpl((((long) Float.floatToRawIntBits(this.bulletHeightPx)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.bulletWidthPx)) << 32));
            BulletSpan_androidKt.m6686setBrushAndDrawyzxVdVo(p1, this.brush, this.alpha, jM4034constructorimpl, new Function0() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomBulletSpan.drawLeadingMargin$lambda$1$lambda$0(this.f$0, jM4034constructorimpl, p3, p0, p1, iCoerceAtLeast, f);
                }
            });
            p1.setStyle(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawLeadingMargin$lambda$1$lambda$0(CustomBulletSpan customBulletSpan, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        BulletSpan_androidKt.draw(customBulletSpan.shape.mo605createOutlinePq9zytI(j, i > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density), canvas, paint, i2, f, i);
        return Unit.INSTANCE;
    }
}
