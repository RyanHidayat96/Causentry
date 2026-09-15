package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "Landroidx/compose/ui/unit/IntSize;", "p1", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AndroidConfig implements ScrollConfig {
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* JADX INFO: renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public final long mo715calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM3963boximpl = Offset.m3963boximpl(Offset.INSTANCE.m3990getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            offsetM3963boximpl = Offset.m3963boximpl(Offset.m3979plusMKHz9U(offsetM3963boximpl.m3984unboximpl(), changes.get(i).getScrollDelta()));
        }
        return Offset.m3981timestuRUvjQ(offsetM3963boximpl.m3984unboximpl(), -density.mo694toPx0680j_4(Dp.m6935constructorimpl(64.0f)));
    }
}
