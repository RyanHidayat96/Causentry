package androidx.metrics.performance;

import android.view.FrameMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/metrics/performance/JankStatsInternalsForTesting;", "", "Landroidx/metrics/performance/JankStats;", "p0", "<init>", "(Landroidx/metrics/performance/JankStats;)V", "Landroidx/metrics/performance/FrameData;", "getFrameData", "()Landroidx/metrics/performance/FrameData;", "Landroid/view/FrameMetrics;", "(Landroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameData;", "", "logFrameData", "(Landroidx/metrics/performance/FrameData;)V", "Landroidx/metrics/performance/PerformanceMetricsState;", "", "p1", "removeStateNow", "(Landroidx/metrics/performance/PerformanceMetricsState;Ljava/lang/String;)V", "Landroidx/metrics/performance/JankStatsBaseImpl;", "impl", "Landroidx/metrics/performance/JankStatsBaseImpl;", "jankStats", "Landroidx/metrics/performance/JankStats;", "getJankStats", "()Landroidx/metrics/performance/JankStats;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JankStatsInternalsForTesting {
    private final JankStatsBaseImpl impl;
    private final JankStats jankStats;

    public JankStatsInternalsForTesting(JankStats jankStats) {
        Intrinsics.checkNotNullParameter(jankStats, "");
        this.jankStats = jankStats;
        this.impl = jankStats.getImplementation();
    }

    public final JankStats getJankStats() {
        return this.jankStats;
    }

    public final void removeStateNow(PerformanceMetricsState p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        p0.removeStateNow$metrics_performance_release(p1);
    }

    public final FrameData getFrameData() {
        JankStatsBaseImpl jankStatsBaseImpl = this.impl;
        if (jankStatsBaseImpl instanceof JankStatsApi16Impl) {
            return ((JankStatsApi16Impl) jankStatsBaseImpl).getFrameData$metrics_performance_release(0L, 0L, 0L);
        }
        return null;
    }

    public final FrameData getFrameData(FrameMetrics p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        JankStatsBaseImpl jankStatsBaseImpl = this.impl;
        if (jankStatsBaseImpl instanceof JankStatsApi24Impl) {
            return ((JankStatsApi24Impl) jankStatsBaseImpl).getFrameData$metrics_performance_release(0L, 0L, p0);
        }
        return null;
    }

    public final void logFrameData(FrameData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.jankStats.logFrameData$metrics_performance_release(p0);
    }
}
