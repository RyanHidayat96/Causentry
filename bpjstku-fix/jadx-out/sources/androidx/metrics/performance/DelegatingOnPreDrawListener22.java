package androidx.metrics.performance;

import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener22;", "Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "Landroid/view/View;", "p0", "Landroid/view/Choreographer;", "p1", "", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "p2", "<init>", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)V", "Landroid/os/Message;", "", "setMessageAsynchronicity$metrics_performance_release", "(Landroid/os/Message;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DelegatingOnPreDrawListener22 extends DelegatingOnPreDrawListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingOnPreDrawListener22(View view, Choreographer choreographer, List<OnFrameListenerDelegate> list) {
        super(view, choreographer, list);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(choreographer, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // androidx.metrics.performance.DelegatingOnPreDrawListener
    public final void setMessageAsynchronicity$metrics_performance_release(Message p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.setAsynchronous(true);
    }
}
