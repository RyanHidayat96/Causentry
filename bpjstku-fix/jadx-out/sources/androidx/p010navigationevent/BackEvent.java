package androidx.p010navigationevent;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.navigationevent.NavigationEvent_androidKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/window/BackEvent;", "p0", "Landroidx/navigationevent/NavigationEvent;", "NavigationEvent", "(Landroid/window/BackEvent;)Landroidx/navigationevent/NavigationEvent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BackEvent {
    public static final NavigationEvent NavigationEvent(android.window.BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new NavigationEvent(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
