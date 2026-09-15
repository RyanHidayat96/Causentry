package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "p0", "p1", "", "p2", "lerp", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "modulate-DxMtmZc", "(JF)J", "modulate", "Lkotlin/Function0;", "takeOrElse", "(FLkotlin/jvm/functions/Function0;)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.INSTANCE.m6840from8_81llA(ColorKt.m4269lerpjxsXWHM(textForegroundStyle.mo6705getColor0d7_KjU(), textForegroundStyle2.mo6705getColor0d7_KjU(), f));
        }
        if (z && (textForegroundStyle2 instanceof BrushStyle)) {
            BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
            BrushStyle brushStyle2 = (BrushStyle) textForegroundStyle2;
            return TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(brushStyle.getBrush(), brushStyle2.getBrush(), f), MathHelpersKt.lerp(brushStyle.getAlpha(), brushStyle2.getAlpha(), f));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m6839modulateDxMtmZc(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : Color.m4217copywmQWz5c$default(j, Color.m4220getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f, Function0<Float> function0) {
        return Float.isNaN(f) ? function0.invoke().floatValue() : f;
    }
}
