package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollConfig;", "", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "Landroidx/compose/ui/unit/IntSize;", "p1", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ScrollConfig {
    /* JADX INFO: renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo715calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j);
}
