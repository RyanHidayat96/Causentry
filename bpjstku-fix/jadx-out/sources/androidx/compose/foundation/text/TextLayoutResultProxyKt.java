package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "p0", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "coerceIn"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1417coerceIn3MmeM6k(long j, Rect rect) {
        float right;
        float bottom;
        if (Offset.m3974getXimpl(j) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m3974getXimpl(j) > rect.getRight() ? rect.getRight() : Offset.m3974getXimpl(j);
        }
        if (Offset.m3975getYimpl(j) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m3975getYimpl(j) > rect.getBottom() ? rect.getBottom() : Offset.m3975getYimpl(j);
        }
        return OffsetKt.Offset(right, bottom);
    }
}
