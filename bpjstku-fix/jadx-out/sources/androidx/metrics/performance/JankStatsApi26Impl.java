package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0010¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/JankStatsApi26Impl;", "Landroidx/metrics/performance/JankStatsApi24Impl;", "Landroidx/metrics/performance/JankStats;", "p0", "Landroid/view/View;", "p1", "Landroid/view/Window;", "p2", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "", "getFrameStartTime$metrics_performance_release", "(Landroid/view/FrameMetrics;)J"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JankStatsApi26Impl extends JankStatsApi24Impl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi26Impl(JankStats jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(window, "");
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public long getFrameStartTime$metrics_performance_release(FrameMetrics p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getMetric(10);
    }
}
