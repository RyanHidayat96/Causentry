package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015"}, d2 = {"Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "", "p0", "<init>", "(Ljava/util/List;)V", "", "add", "(Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "Landroid/view/Window;", "Landroid/view/FrameMetrics;", "p1", "", "p2", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "remove", "(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/view/Window;)V", "delegates", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "", "iterating", "Z", "getIterating", "()Z", "setIterating", "(Z)V", "toBeAdded", "getToBeAdded", "toBeRemoved", "getToBeRemoved"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DelegatingFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
    private final List<Window.OnFrameMetricsAvailableListener> delegates;
    private boolean iterating;
    private final List<Window.OnFrameMetricsAvailableListener> toBeAdded;
    private final List<Window.OnFrameMetricsAvailableListener> toBeRemoved;

    public DelegatingFrameMetricsListener(List<Window.OnFrameMetricsAvailableListener> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.delegates = list;
        this.toBeAdded = new ArrayList();
        this.toBeRemoved = new ArrayList();
    }

    public final List<Window.OnFrameMetricsAvailableListener> getDelegates() {
        return this.delegates;
    }

    public final boolean getIterating() {
        return this.iterating;
    }

    public final void setIterating(boolean z) {
        this.iterating = z;
    }

    public final List<Window.OnFrameMetricsAvailableListener> getToBeAdded() {
        return this.toBeAdded;
    }

    public final List<Window.OnFrameMetricsAvailableListener> getToBeRemoved() {
        return this.toBeRemoved;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window p0, FrameMetrics p1, int p2) {
        View decorView;
        synchronized (this) {
            this.iterating = true;
            Iterator<Window.OnFrameMetricsAvailableListener> it = this.delegates.iterator();
            while (it.hasNext()) {
                it.next().onFrameMetricsAvailable(p0, p1, p2);
            }
            if (!this.toBeAdded.isEmpty()) {
                Iterator<Window.OnFrameMetricsAvailableListener> it2 = this.toBeAdded.iterator();
                while (it2.hasNext()) {
                    this.delegates.add(it2.next());
                }
                this.toBeAdded.clear();
            }
            if (!this.toBeRemoved.isEmpty()) {
                boolean zIsEmpty = this.delegates.isEmpty();
                Iterator<Window.OnFrameMetricsAvailableListener> it3 = this.toBeRemoved.iterator();
                while (it3.hasNext()) {
                    this.delegates.remove(it3.next());
                }
                this.toBeRemoved.clear();
                if (!zIsEmpty && this.delegates.isEmpty()) {
                    if (p0 != null) {
                        p0.removeOnFrameMetricsAvailableListener(this);
                    }
                    if (p0 != null && (decorView = p0.getDecorView()) != null) {
                        decorView.setTag(R.id.metricsDelegator, null);
                    }
                }
            }
            this.iterating = false;
            Unit unit = Unit.INSTANCE;
        }
        if (p0 != null) {
            PerformanceMetricsState.Companion companion = PerformanceMetricsState.INSTANCE;
            View decorView2 = p0.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "");
            PerformanceMetricsState state = companion.getHolderForHierarchy(decorView2).getState();
            if (state != null) {
                state.cleanupSingleFrameStates$metrics_performance_release();
            }
        }
    }

    public final void add(Window.OnFrameMetricsAvailableListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            if (this.iterating) {
                this.toBeAdded.add(p0);
            } else {
                this.delegates.add(p0);
            }
        }
    }

    public final void remove(Window.OnFrameMetricsAvailableListener p0, Window p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this) {
            if (this.iterating) {
                this.toBeRemoved.add(p0);
            } else {
                boolean zIsEmpty = this.delegates.isEmpty();
                this.delegates.remove(p0);
                if (!zIsEmpty && this.delegates.isEmpty()) {
                    p1.removeOnFrameMetricsAvailableListener(this);
                    p1.getDecorView().setTag(R.id.metricsDelegator, null);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
