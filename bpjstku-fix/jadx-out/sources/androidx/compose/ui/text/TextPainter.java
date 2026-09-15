package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas p0, TextLayoutResult p1) {
        long jM4244getBlack0d7_KjU;
        boolean z = p1.getHasVisualOverflow() && !TextOverflow.m6861equalsimpl0(p1.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m6874getVisiblegIe3tQ8());
        if (z) {
            Rect rectM4014Recttz77jQw = RectKt.m4014Recttz77jQw(Offset.INSTANCE.m3990getZeroF1C5BW0(), Size.m4034constructorimpl((((long) Float.floatToRawIntBits((int) (p1.getSize() & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (p1.getSize() >> 32))) << 32)));
            p0.save();
            Canvas.m4191clipRectmtrdDE$default(p0, rectM4014Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle = p1.getLayoutInput().getStyle().getSpanStyle();
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle.getBrush();
            if (brush != null) {
                p1.getMultiParagraph().m6243painthn5TExg(p0, brush, (64 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getAlpha() : 1.0f, (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : 0);
            } else {
                if (spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE) {
                    jM4244getBlack0d7_KjU = spanStyle.getTextForegroundStyle().mo6705getColor0d7_KjU();
                } else {
                    jM4244getBlack0d7_KjU = Color.INSTANCE.m4244getBlack0d7_KjU();
                }
                p1.getMultiParagraph().m6241paintLG529CI(p0, (32 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : jM4244getBlack0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z) {
                p0.restore();
            }
        }
    }
}
