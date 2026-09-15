package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Rect;", "p0", "", "p1", "", "p2", "getCursorRectInScroller", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/geometry/Rect;ZI)Landroidx/compose/ui/geometry/Rect;", "", "roundToNext", "(F)F", "Landroidx/compose/ui/unit/Dp;", "DefaultCursorThickness", "F", "Landroidx/compose/ui/graphics/Brush;", "isSpecified", "(Landroidx/compose/ui/graphics/Brush;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = Dp.m6935constructorimpl(2.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z, int i) {
        float left;
        float left2;
        int iMo688roundToPx0680j_4 = density.mo688roundToPx0680j_4(DefaultCursorThickness);
        if (z) {
            left = i - rect.getRight();
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i - rect.getRight();
        } else {
            left2 = rect.getLeft();
        }
        return Rect.copy$default(rect, f, 0.0f, left2 + iMo688roundToPx0680j_4, 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f) {
        double dFloor;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            dFloor = Math.ceil(f);
        } else {
            dFloor = Math.floor(f);
        }
        return (float) dFloor;
    }
}
