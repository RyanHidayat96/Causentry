package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/input/indirect/AndroidIndirectTouchEvent;", "Landroidx/compose/ui/input/indirect/PlatformIndirectTouchEvent;", "Landroidx/compose/ui/geometry/Offset;", "p0", "", "p1", "Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "p2", "Landroid/view/MotionEvent;", "p3", "<init>", "(JJILandroid/view/MotionEvent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "position", "J", "getPosition-F1C5BW0", "()J", "uptimeMillis", "getUptimeMillis", "type", "I", "getType-LxEHWp8", "()I", "nativeEvent", "Landroid/view/MotionEvent;", "getNativeEvent$ui_release", "()Landroid/view/MotionEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidIndirectTouchEvent implements PlatformIndirectTouchEvent {
    public static final int $stable = 8;
    private final MotionEvent nativeEvent;
    private final long position;
    private final int type;
    private final long uptimeMillis;

    private AndroidIndirectTouchEvent(long j, long j2, int i, MotionEvent motionEvent) {
        this.position = j;
        this.uptimeMillis = j2;
        this.type = i;
        this.nativeEvent = motionEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchEvent
    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchEvent
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchEvent
    /* JADX INFO: renamed from: getType-LxEHWp8, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: getNativeEvent$ui_release, reason: from getter */
    public final MotionEvent getNativeEvent() {
        return this.nativeEvent;
    }

    public /* synthetic */ AndroidIndirectTouchEvent(long j, long j2, int i, MotionEvent motionEvent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, motionEvent);
    }
}
