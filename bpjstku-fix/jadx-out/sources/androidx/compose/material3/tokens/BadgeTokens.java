package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001d\u0010\u001e\u001a\u00020\u00178\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "LargeColor", "getLargeColor", "LargeLabelTextColor", "getLargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLargeLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getLargeShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/ui/unit/Dp;", "LargeSize", "F", "getLargeSize-D9Ej5fM", "()F", "Shape", "getShape", "Size", "getSize-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BadgeTokens {
    public static final int $stable = 0;
    public static final BadgeTokens INSTANCE = new BadgeTokens();
    private static final ColorSchemeKeyTokens Color = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens LargeColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
    private static final TypographyKeyTokens LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
    private static final ShapeKeyTokens LargeShape = ShapeKeyTokens.CornerFull;
    private static final float LargeSize = Dp.m6935constructorimpl(16.0f);
    private static final ShapeKeyTokens Shape = ShapeKeyTokens.CornerFull;
    private static final float Size = Dp.m6935constructorimpl(6.0f);

    private BadgeTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    public final TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    public final ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* JADX INFO: renamed from: getLargeSize-D9Ej5fM, reason: not valid java name */
    public final float m2840getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2841getSizeD9Ej5fM() {
        return Size;
    }
}
