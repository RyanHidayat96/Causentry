package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010%\u001a\u00020\u00138\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017R\u001d\u0010'\u001a\u00020\u00138\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017R\u001a\u0010*\u001a\u00020)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\u00020\u00138\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0017R\u001d\u00100\u001a\u00020\u00138\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u001a\u0010:\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u001a\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u001a\u0010C\u001a\u00020B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusLabelTextColor", "getActiveFocusLabelTextColor", "ActiveHoverIconColor", "getActiveHoverIconColor", "ActiveHoverLabelTextColor", "getActiveHoverLabelTextColor", "ActiveIconColor", "getActiveIconColor", "ActiveIndicatorColor", "getActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "ActiveIndicatorHeight", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveIndicatorShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getActiveIndicatorShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveLabelTextColor", "getActiveLabelTextColor", "ActivePressedIconColor", "getActivePressedIconColor", "ActivePressedLabelTextColor", "getActivePressedLabelTextColor", "ContainerColor", "getContainerColor", "ContainerElevation", "getContainerElevation-D9Ej5fM", "ContainerHeight", "getContainerHeight-D9Ej5fM", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "IconAndLabelTextContainerHeight", "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "InactiveFocusIconColor", "getInactiveFocusIconColor", "InactiveFocusLabelTextColor", "getInactiveFocusLabelTextColor", "InactiveHoverIconColor", "getInactiveHoverIconColor", "InactiveHoverLabelTextColor", "getInactiveHoverLabelTextColor", "InactiveIconColor", "getInactiveIconColor", "InactiveLabelTextColor", "getInactiveLabelTextColor", "InactivePressedIconColor", "getInactivePressedIconColor", "InactivePressedLabelTextColor", "getInactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrimaryNavigationTabTokens {
    public static final int $stable = 0;
    public static final PrimaryNavigationTabTokens INSTANCE = new PrimaryNavigationTabTokens();
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.Primary;
    private static final float ActiveIndicatorHeight = Dp.m6935constructorimpl(3.0f);
    private static final RoundedCornerShape ActiveIndicatorShape = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(3.0f));
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3001getLevel0D9Ej5fM();
    private static final float ContainerHeight = Dp.m6935constructorimpl(48.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final ColorSchemeKeyTokens ActiveFocusIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActivePressedIconColor = ColorSchemeKeyTokens.Primary;
    private static final float IconAndLabelTextContainerHeight = Dp.m6935constructorimpl(64.0f);
    private static final float IconSize = Dp.m6935constructorimpl(24.0f);
    private static final ColorSchemeKeyTokens InactiveFocusIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactivePressedIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.TitleSmall;

    private PrimaryNavigationTabTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m3292getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final RoundedCornerShape getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3293getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3294getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    /* JADX INFO: renamed from: getIconAndLabelTextContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3295getIconAndLabelTextContainerHeightD9Ej5fM() {
        return IconAndLabelTextContainerHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3296getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }
}
