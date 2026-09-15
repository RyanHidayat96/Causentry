package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventHelper;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "", "p1", "Landroidx/compose/ui/geometry/Offset;", "toRawOffset-dBAh8RU", "(Landroid/view/MotionEvent;I)J", "toRawOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    /* JADX INFO: renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m5440toRawOffsetdBAh8RU(MotionEvent p0, int p1) {
        float rawX = p0.getRawX(p1);
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(p0.getRawY(p1))) & 4294967295L) | (((long) Float.floatToRawIntBits(rawX)) << 32));
    }
}
