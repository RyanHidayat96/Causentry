package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00128\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001d\u0010\u001d\u001a\u00020\u00128\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u001f\u001a\u00020\u00128\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/tokens/SheetBottomTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DockedContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDockedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DockedContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getDockedContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DockedContainerSurfaceTintLayerColor", "getDockedContainerSurfaceTintLayerColor", "DockedDragHandleColor", "getDockedDragHandleColor", "Landroidx/compose/ui/unit/Dp;", "DockedDragHandleHeight", "F", "getDockedDragHandleHeight-D9Ej5fM", "()F", "", "DockedDragHandleOpacity", "DockedDragHandleWidth", "getDockedDragHandleWidth-D9Ej5fM", "DockedMinimizedContainerShape", "getDockedMinimizedContainerShape", "DockedModalContainerElevation", "getDockedModalContainerElevation-D9Ej5fM", "DockedStandardContainerElevation", "getDockedStandardContainerElevation-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SheetBottomTokens {
    public static final int $stable = 0;
    public static final float DockedDragHandleOpacity = 0.4f;
    public static final SheetBottomTokens INSTANCE = new SheetBottomTokens();
    private static final ColorSchemeKeyTokens DockedContainerColor = ColorSchemeKeyTokens.Surface;
    private static final ShapeKeyTokens DockedContainerShape = ShapeKeyTokens.CornerExtraLargeTop;
    private static final ColorSchemeKeyTokens DockedContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final ColorSchemeKeyTokens DockedDragHandleColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float DockedDragHandleHeight = Dp.m6935constructorimpl(4.0f);
    private static final float DockedDragHandleWidth = Dp.m6935constructorimpl(32.0f);
    private static final ShapeKeyTokens DockedMinimizedContainerShape = ShapeKeyTokens.CornerNone;
    private static final float DockedModalContainerElevation = ElevationTokens.INSTANCE.m3002getLevel1D9Ej5fM();
    private static final float DockedStandardContainerElevation = ElevationTokens.INSTANCE.m3002getLevel1D9Ej5fM();

    private SheetBottomTokens() {
    }

    public final ColorSchemeKeyTokens getDockedContainerColor() {
        return DockedContainerColor;
    }

    public final ShapeKeyTokens getDockedContainerShape() {
        return DockedContainerShape;
    }

    public final ColorSchemeKeyTokens getDockedContainerSurfaceTintLayerColor() {
        return DockedContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getDockedDragHandleColor() {
        return DockedDragHandleColor;
    }

    /* JADX INFO: renamed from: getDockedDragHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m3310getDockedDragHandleHeightD9Ej5fM() {
        return DockedDragHandleHeight;
    }

    /* JADX INFO: renamed from: getDockedDragHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m3311getDockedDragHandleWidthD9Ej5fM() {
        return DockedDragHandleWidth;
    }

    public final ShapeKeyTokens getDockedMinimizedContainerShape() {
        return DockedMinimizedContainerShape;
    }

    /* JADX INFO: renamed from: getDockedModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3312getDockedModalContainerElevationD9Ej5fM() {
        return DockedModalContainerElevation;
    }

    /* JADX INFO: renamed from: getDockedStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3313getDockedStandardContainerElevationD9Ej5fM() {
        return DockedStandardContainerElevation;
    }
}
