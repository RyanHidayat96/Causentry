package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroid/view/MotionEvent;", "p0", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "IndirectTouchEvent", "(Landroid/view/MotionEvent;)Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "convertActionToIndirectTouchEventType", "(I)I", "getNativeEvent", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)Landroid/view/MotionEvent;", "getNativeEvent$annotations", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)V", "nativeEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidIndirectTouchEvent_androidKt {
    public static /* synthetic */ void getNativeEvent$annotations(IndirectTouchEvent indirectTouchEvent) {
    }

    public static final MotionEvent getNativeEvent(IndirectTouchEvent indirectTouchEvent) {
        Intrinsics.checkNotNull(indirectTouchEvent, "");
        return ((AndroidIndirectTouchEvent) indirectTouchEvent).getNativeEvent();
    }

    public static final IndirectTouchEvent IndirectTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        return new AndroidIndirectTouchEvent(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (((long) Float.floatToRawIntBits(x)) << 32)), motionEvent.getEventTime(), convertActionToIndirectTouchEventType(motionEvent.getActionMasked()), motionEvent, null);
    }

    public static final int convertActionToIndirectTouchEventType(int i) {
        if (i == 0) {
            return IndirectTouchEventType.INSTANCE.m5048getPressLxEHWp8();
        }
        if (i == 1) {
            return IndirectTouchEventType.INSTANCE.m5049getReleaseLxEHWp8();
        }
        if (i == 2) {
            return IndirectTouchEventType.INSTANCE.m5047getMoveLxEHWp8();
        }
        return IndirectTouchEventType.INSTANCE.m5050getUnknownLxEHWp8();
    }
}
