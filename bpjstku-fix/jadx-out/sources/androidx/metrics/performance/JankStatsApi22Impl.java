package androidx.metrics.performance;

import android.view.Choreographer;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0011¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/metrics/performance/JankStatsApi22Impl;", "Landroidx/metrics/performance/JankStatsApi16Impl;", "Landroidx/metrics/performance/JankStats;", "p0", "Landroid/view/View;", "p1", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;)V", "Landroid/view/Choreographer;", "", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "p2", "Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "createDelegatingOnDrawListener$metrics_performance_release", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)Landroidx/metrics/performance/DelegatingOnPreDrawListener;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JankStatsApi22Impl extends JankStatsApi16Impl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi22Impl(JankStats jankStats, View view) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // androidx.metrics.performance.JankStatsApi16Impl
    public DelegatingOnPreDrawListener createDelegatingOnDrawListener$metrics_performance_release(View p0, Choreographer p1, List<OnFrameListenerDelegate> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new DelegatingOnPreDrawListener22(p0, p1, p2);
    }
}
