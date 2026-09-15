package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p0", "", "drawLayer", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/Outline;", "setOutline", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/Outline;)V", "", "DefaultCameraDistance", "F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void setOutline(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
            Rect rect = rectangle.getRect();
            float right = rect.getRight();
            float left2 = rect.getLeft();
            Rect rect2 = rectangle.getRect();
            graphicsLayer.m4897setRectOutlinetz77jQw(jM3966constructorimpl, Size.m4034constructorimpl((((long) Float.floatToRawIntBits(rect2.getBottom() - rect2.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(right - left2)) << 32)));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            throw new NoWhenBranchMatchedException();
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (rounded.getRoundRectPath() != null) {
            graphicsLayer.setPathOutline(rounded.getRoundRectPath());
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float left3 = roundRect.getLeft();
        float top2 = roundRect.getTop();
        long jM3966constructorimpl2 = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(left3)) << 32) | (((long) Float.floatToRawIntBits(top2)) & 4294967295L));
        float width = roundRect.getWidth();
        graphicsLayer.m4898setRoundRectOutlineTNW_H78(jM3966constructorimpl2, Size.m4034constructorimpl((((long) Float.floatToRawIntBits(roundRect.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), Float.intBitsToFloat((int) (roundRect.m4022getBottomLeftCornerRadiuskKHJgLs() >> 32)));
    }

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics_release(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }
}
