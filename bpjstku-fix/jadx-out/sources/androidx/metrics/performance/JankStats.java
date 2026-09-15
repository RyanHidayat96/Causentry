package androidx.metrics.performance;

import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/metrics/performance/JankStats;", "", "Landroid/view/Window;", "p0", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "p1", "<init>", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;)V", "Landroidx/metrics/performance/FrameData;", "", "logFrameData$metrics_performance_release", "(Landroidx/metrics/performance/FrameData;)V", "frameListener", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "holder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "implementation", "Landroidx/metrics/performance/JankStatsBaseImpl;", "getImplementation$metrics_performance_release", "()Landroidx/metrics/performance/JankStatsBaseImpl;", "", "isTrackingEnabled", "Z", "()Z", "setTrackingEnabled", "(Z)V", "", "jankHeuristicMultiplier", "F", "getJankHeuristicMultiplier", "()F", "setJankHeuristicMultiplier", "(F)V", "Companion", "OnFrameListener"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JankStats {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OnFrameListener frameListener;
    private final PerformanceMetricsState.Holder holder;
    private final JankStatsBaseImpl implementation;
    private boolean isTrackingEnabled;
    private float jankHeuristicMultiplier;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/metrics/performance/JankStats$OnFrameListener;", "", "Landroidx/metrics/performance/FrameData;", "p0", "", "onFrame", "(Landroidx/metrics/performance/FrameData;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnFrameListener {
        void onFrame(FrameData p0);
    }

    private JankStats(Window window, OnFrameListener onFrameListener) {
        JankStatsApi24Impl jankStatsApi24Impl;
        this.frameListener = onFrameListener;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        this.holder = PerformanceMetricsState.INSTANCE.create$metrics_performance_release(viewPeekDecorView);
        if (Build.VERSION.SDK_INT >= 31) {
            jankStatsApi24Impl = new JankStatsApi31Impl(this, viewPeekDecorView, window);
        } else if (Build.VERSION.SDK_INT >= 26) {
            jankStatsApi24Impl = new JankStatsApi26Impl(this, viewPeekDecorView, window);
        } else {
            jankStatsApi24Impl = new JankStatsApi24Impl(this, viewPeekDecorView, window);
        }
        this.implementation = jankStatsApi24Impl;
        jankStatsApi24Impl.setupFrameTimer(true);
        this.isTrackingEnabled = true;
        this.jankHeuristicMultiplier = 2.0f;
    }

    /* JADX INFO: renamed from: getImplementation$metrics_performance_release, reason: from getter */
    public final JankStatsBaseImpl getImplementation() {
        return this.implementation;
    }

    /* JADX INFO: renamed from: isTrackingEnabled, reason: from getter */
    public final boolean getIsTrackingEnabled() {
        return this.isTrackingEnabled;
    }

    public final void setTrackingEnabled(boolean z) {
        this.implementation.setupFrameTimer(z);
        this.isTrackingEnabled = z;
    }

    public final float getJankHeuristicMultiplier() {
        return this.jankHeuristicMultiplier;
    }

    public final void setJankHeuristicMultiplier(float f) {
        JankStatsBaseImpl.INSTANCE.setFrameDuration(-1L);
        this.jankHeuristicMultiplier = f;
    }

    public final void logFrameData$metrics_performance_release(FrameData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.frameListener.onFrame(p0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/metrics/performance/JankStats$Companion;", "", "<init>", "()V", "Landroid/view/Window;", "p0", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "p1", "Landroidx/metrics/performance/JankStats;", "createAndTrack", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;)Landroidx/metrics/performance/JankStats;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final JankStats createAndTrack(Window p0, OnFrameListener p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return new JankStats(p0, p1, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ JankStats(Window window, OnFrameListener onFrameListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, onFrameListener);
    }

    @JvmStatic
    public static final JankStats createAndTrack(Window window, OnFrameListener onFrameListener) {
        return INSTANCE.createAndTrack(window, onFrameListener);
    }
}
