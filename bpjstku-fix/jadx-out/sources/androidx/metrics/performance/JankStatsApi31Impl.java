package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH\u0011¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/metrics/performance/JankStatsApi31Impl;", "Landroidx/metrics/performance/JankStatsApi26Impl;", "Landroidx/metrics/performance/JankStats;", "p0", "Landroid/view/View;", "p1", "Landroid/view/Window;", "p2", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "", "getExpectedFrameDuration", "(Landroid/view/FrameMetrics;)J", "Landroidx/metrics/performance/FrameDataApi31;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi31;", "frameData", "Landroidx/metrics/performance/FrameDataApi31;", "getFrameData", "()Landroidx/metrics/performance/FrameDataApi31;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JankStatsApi31Impl extends JankStatsApi26Impl {
    private final FrameDataApi31 frameData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi31Impl(JankStats jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(window, "");
        this.frameData = new FrameDataApi31(0L, 0L, 0L, 0L, 0L, false, getStateInfo());
    }

    public final FrameDataApi31 getFrameData() {
        return this.frameData;
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public final FrameDataApi31 getFrameData$metrics_performance_release(long p0, long p1, FrameMetrics p2) {
        Intrinsics.checkNotNullParameter(p2, "");
        long metric = p2.getMetric(0);
        long metric2 = p2.getMetric(1);
        long metric3 = metric + metric2 + p2.getMetric(2) + p2.getMetric(3) + p2.getMetric(4) + p2.getMetric(5);
        setPrevEnd(p0 + metric3);
        PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(p0, getPrevEnd(), getStateInfo());
        }
        boolean z = metric3 > p1;
        long metric4 = p2.getMetric(8);
        this.frameData.update$metrics_performance_release(p0, metric3, (metric4 - p2.getMetric(12)) + p2.getMetric(7), metric4, metric4 - p2.getMetric(13), z);
        return this.frameData;
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public final long getExpectedFrameDuration(FrameMetrics p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getMetric(13);
    }
}
