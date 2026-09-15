package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b)\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u001d\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001d\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001a\u0010)\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R\u001d\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0016R\u001a\u00101\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u0010\u0016R\u001d\u00103\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u0016R\u001a\u00107\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b8\u0010\u0016R\u001d\u00109\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u0016R\u001a\u0010=\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0014\u001a\u0004\b>\u0010\u0016R\u001d\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0014\u001a\u0004\bB\u0010\u0016R\u001d\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0014\u001a\u0004\bF\u0010\u0016R\u001a\u0010G\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010\u0016R\u001d\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010L\u001a\u00020K8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010P\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0014\u0010R\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u001a\u0010S\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0014\u001a\u0004\bT\u0010\u0016R\u001d\u0010U\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0014\u001a\u0004\bX\u0010\u0016R\u001d\u0010Y\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u001a\u0010[\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\u0014\u001a\u0004\b\\\u0010\u0016R\u001d\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0014\u001a\u0004\b`\u0010\u0016R\u001a\u0010a\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\u0014\u001a\u0004\bb\u0010\u0016R\u001d\u0010c\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u001a\u0010e\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0014\u001a\u0004\bf\u0010\u0016R\u001d\u0010g\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010\u0014\u001a\u0004\bj\u0010\u0016R\u001d\u0010k\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u001a\u0010m\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\u0014\u001a\u0004\bn\u0010\u0016R\u001d\u0010o\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u001a\u0010q\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\u0014\u001a\u0004\br\u0010\u0016R\u001d\u0010s\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/tokens/CheckboxTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "ContainerHeight", "F", "getContainerHeight-D9Ej5fM", "()F", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContainerShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerWidth", "getContainerWidth-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getSelectedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedDisabledContainerColor", "getSelectedDisabledContainerColor", "", "SelectedDisabledContainerOpacity", "SelectedDisabledContainerOutlineWidth", "getSelectedDisabledContainerOutlineWidth-D9Ej5fM", "SelectedDisabledIconColor", "getSelectedDisabledIconColor", "SelectedErrorContainerColor", "getSelectedErrorContainerColor", "SelectedErrorFocusContainerColor", "getSelectedErrorFocusContainerColor", "SelectedErrorFocusIconColor", "getSelectedErrorFocusIconColor", "SelectedErrorFocusOutlineWidth", "getSelectedErrorFocusOutlineWidth-D9Ej5fM", "SelectedErrorHoverContainerColor", "getSelectedErrorHoverContainerColor", "SelectedErrorHoverIconColor", "getSelectedErrorHoverIconColor", "SelectedErrorHoverOutlineWidth", "getSelectedErrorHoverOutlineWidth-D9Ej5fM", "SelectedErrorIconColor", "getSelectedErrorIconColor", "SelectedErrorPressedContainerColor", "getSelectedErrorPressedContainerColor", "SelectedErrorPressedIconColor", "getSelectedErrorPressedIconColor", "SelectedErrorPressedOutlineWidth", "getSelectedErrorPressedOutlineWidth-D9Ej5fM", "SelectedFocusContainerColor", "getSelectedFocusContainerColor", "SelectedFocusIconColor", "getSelectedFocusIconColor", "SelectedFocusOutlineWidth", "getSelectedFocusOutlineWidth-D9Ej5fM", "SelectedHoverContainerColor", "getSelectedHoverContainerColor", "SelectedHoverIconColor", "getSelectedHoverIconColor", "SelectedHoverOutlineWidth", "getSelectedHoverOutlineWidth-D9Ej5fM", "SelectedIconColor", "getSelectedIconColor", "SelectedOutlineWidth", "getSelectedOutlineWidth-D9Ej5fM", "SelectedPressedContainerColor", "getSelectedPressedContainerColor", "SelectedPressedIconColor", "getSelectedPressedIconColor", "SelectedPressedOutlineWidth", "getSelectedPressedOutlineWidth-D9Ej5fM", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getStateLayerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerSize", "getStateLayerSize-D9Ej5fM", "UnselectedDisabledContainerOpacity", "UnselectedDisabledOutlineColor", "getUnselectedDisabledOutlineColor", "UnselectedDisabledOutlineWidth", "getUnselectedDisabledOutlineWidth-D9Ej5fM", "UnselectedErrorFocusOutlineColor", "getUnselectedErrorFocusOutlineColor", "UnselectedErrorFocusOutlineWidth", "getUnselectedErrorFocusOutlineWidth-D9Ej5fM", "UnselectedErrorHoverOutlineColor", "getUnselectedErrorHoverOutlineColor", "UnselectedErrorHoverOutlineWidth", "getUnselectedErrorHoverOutlineWidth-D9Ej5fM", "UnselectedErrorOutlineColor", "getUnselectedErrorOutlineColor", "UnselectedErrorPressedOutlineColor", "getUnselectedErrorPressedOutlineColor", "UnselectedErrorPressedOutlineWidth", "getUnselectedErrorPressedOutlineWidth-D9Ej5fM", "UnselectedFocusOutlineColor", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineWidth", "getUnselectedFocusOutlineWidth-D9Ej5fM", "UnselectedHoverOutlineColor", "getUnselectedHoverOutlineColor", "UnselectedHoverOutlineWidth", "getUnselectedHoverOutlineWidth-D9Ej5fM", "UnselectedOutlineColor", "getUnselectedOutlineColor", "UnselectedOutlineWidth", "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedPressedOutlineColor", "getUnselectedPressedOutlineColor", "UnselectedPressedOutlineWidth", "getUnselectedPressedOutlineWidth-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckboxTokens {
    public static final int $stable = 0;
    public static final float SelectedDisabledContainerOpacity = 0.38f;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();
    private static final float ContainerHeight = Dp.m6935constructorimpl(18.0f);
    private static final RoundedCornerShape ContainerShape = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(2.0f));
    private static final float ContainerWidth = Dp.m6935constructorimpl(18.0f);
    private static final float IconSize = Dp.m6935constructorimpl(18.0f);
    private static final ColorSchemeKeyTokens SelectedContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float SelectedDisabledContainerOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor = ColorSchemeKeyTokens.OnError;
    private static final float SelectedErrorFocusOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor = ColorSchemeKeyTokens.OnError;
    private static final float SelectedErrorHoverOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedErrorIconColor = ColorSchemeKeyTokens.OnError;
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor = ColorSchemeKeyTokens.OnError;
    private static final float SelectedErrorPressedOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final float SelectedFocusOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final float SelectedHoverOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final float SelectedOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final float SelectedPressedOutlineWidth = Dp.m6935constructorimpl(0.0f);
    private static final ShapeKeyTokens StateLayerShape = ShapeKeyTokens.CornerFull;
    private static final float StateLayerSize = Dp.m6935constructorimpl(40.0f);
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float UnselectedDisabledOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor = ColorSchemeKeyTokens.Error;
    private static final float UnselectedErrorFocusOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor = ColorSchemeKeyTokens.Error;
    private static final float UnselectedErrorHoverOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor = ColorSchemeKeyTokens.Error;
    private static final float UnselectedErrorPressedOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float UnselectedFocusOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float UnselectedHoverOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float UnselectedOutlineWidth = Dp.m6935constructorimpl(2.0f);
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float UnselectedPressedOutlineWidth = Dp.m6935constructorimpl(2.0f);

    private CheckboxTokens() {
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2844getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final RoundedCornerShape getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m2845getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2846getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2847getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return SelectedDisabledContainerOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return SelectedDisabledIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return SelectedErrorContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return SelectedErrorFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return SelectedErrorFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2848getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return SelectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return SelectedErrorHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return SelectedErrorHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2849getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return SelectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return SelectedErrorIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return SelectedErrorPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return SelectedErrorPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2850getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return SelectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return SelectedFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2851getSelectedFocusOutlineWidthD9Ej5fM() {
        return SelectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return SelectedHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2852getSelectedHoverOutlineWidthD9Ej5fM() {
        return SelectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2853getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return SelectedPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2854getSelectedPressedOutlineWidthD9Ej5fM() {
        return SelectedPressedOutlineWidth;
    }

    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m2855getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2856getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return UnselectedDisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return UnselectedErrorFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2857getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return UnselectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return UnselectedErrorHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2858getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return UnselectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return UnselectedErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return UnselectedErrorPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2859getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return UnselectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2860getUnselectedFocusOutlineWidthD9Ej5fM() {
        return UnselectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return UnselectedHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2861getUnselectedHoverOutlineWidthD9Ej5fM() {
        return UnselectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2862getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return UnselectedPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2863getUnselectedPressedOutlineWidthD9Ej5fM() {
        return UnselectedPressedOutlineWidth;
    }
}
