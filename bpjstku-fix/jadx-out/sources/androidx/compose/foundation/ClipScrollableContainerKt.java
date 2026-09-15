package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Orientation;", "p0", "clipScrollableContainer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;", "HorizontalScrollableClipModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "MaxSupportedElevation", "F", "getMaxSupportedElevation", "()F", "VerticalScrollableClipModifier"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = Dp.m6935constructorimpl(30.0f);
    private static final Modifier HorizontalScrollableClipModifier = ClipKt.clip(Modifier.INSTANCE, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
        @Override // androidx.compose.ui.graphics.Shape
        /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
        public final Outline mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
            float fMo688roundToPx0680j_4 = p2.mo688roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
            return new Outline.Rectangle(new Rect(0.0f, -fMo688roundToPx0680j_4, Size.m4043getWidthimpl(p0), Size.m4040getHeightimpl(p0) + fMo688roundToPx0680j_4));
        }
    });
    private static final Modifier VerticalScrollableClipModifier = ClipKt.clip(Modifier.INSTANCE, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
        @Override // androidx.compose.ui.graphics.Shape
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public final Outline mo605createOutlinePq9zytI(long p0, LayoutDirection p1, Density p2) {
            float fMo688roundToPx0680j_4 = p2.mo688roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
            return new Outline.Rectangle(new Rect(-fMo688roundToPx0680j_4, 0.0f, Size.m4043getWidthimpl(p0) + fMo688roundToPx0680j_4, Size.m4040getHeightimpl(p0)));
        }
    });

    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        Modifier modifier2;
        if (orientation == Orientation.Vertical) {
            modifier2 = VerticalScrollableClipModifier;
        } else {
            modifier2 = HorizontalScrollableClipModifier;
        }
        return modifier.then(modifier2);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
