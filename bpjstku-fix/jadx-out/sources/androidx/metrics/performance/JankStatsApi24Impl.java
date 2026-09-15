package androidx.metrics.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0011\u0018\u0000 .2\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH\u0011¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Landroidx/metrics/performance/JankStatsApi24Impl;", "Landroidx/metrics/performance/JankStatsApi22Impl;", "Landroidx/metrics/performance/JankStats;", "p0", "Landroid/view/View;", "p1", "Landroid/view/Window;", "p2", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "", "getExpectedFrameDuration", "(Landroid/view/FrameMetrics;)J", "Landroidx/metrics/performance/FrameDataApi24;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi24;", "getFrameStartTime$metrics_performance_release", "", "", "setupFrameTimer", "(Z)V", "Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "getOrCreateFrameMetricsListenerDelegator", "(Landroid/view/Window;)Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "removeFrameMetricsListenerDelegate", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "frameData", "Landroidx/metrics/performance/FrameDataApi24;", "frameMetricsAvailableListenerDelegate", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "listenerAddedTime", "J", "getListenerAddedTime", "()J", "setListenerAddedTime", "(J)V", "prevEnd", "getPrevEnd", "setPrevEnd", "prevStart", "getPrevStart", "setPrevStart", "window", "Landroid/view/Window;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JankStatsApi24Impl extends JankStatsApi22Impl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Handler frameMetricsHandler;
    private final FrameDataApi24 frameData;
    private final Window.OnFrameMetricsAvailableListener frameMetricsAvailableListenerDelegate;
    private long listenerAddedTime;
    private long prevEnd;
    private long prevStart;
    private final Window window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi24Impl(final JankStats jankStats, View view, Window window) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(window, "");
        this.window = window;
        this.frameData = new FrameDataApi24(0L, 0L, 0L, false, getStateInfo());
        this.frameMetricsAvailableListenerDelegate = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda0
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                JankStatsApi24Impl.frameMetricsAvailableListenerDelegate$lambda$0(this.f$0, jankStats, window2, frameMetrics, i);
            }
        };
    }

    public final long getPrevStart() {
        return this.prevStart;
    }

    public final void setPrevStart(long j) {
        this.prevStart = j;
    }

    public final long getListenerAddedTime() {
        return this.listenerAddedTime;
    }

    public final void setListenerAddedTime(long j) {
        this.listenerAddedTime = j;
    }

    public final long getPrevEnd() {
        return this.prevEnd;
    }

    public final void setPrevEnd(long j) {
        this.prevEnd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameMetricsAvailableListenerDelegate$lambda$0(JankStatsApi24Impl jankStatsApi24Impl, JankStats jankStats, Window window, FrameMetrics frameMetrics, int i) {
        Intrinsics.checkNotNullParameter(jankStatsApi24Impl, "");
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullExpressionValue(frameMetrics, "");
        long jMax = Math.max(jankStatsApi24Impl.getFrameStartTime$metrics_performance_release(frameMetrics), jankStatsApi24Impl.prevEnd);
        if (jMax < jankStatsApi24Impl.listenerAddedTime || jMax == jankStatsApi24Impl.prevStart) {
            return;
        }
        jankStats.logFrameData$metrics_performance_release(jankStatsApi24Impl.getFrameData$metrics_performance_release(jMax, (long) (jankStatsApi24Impl.getExpectedFrameDuration(frameMetrics) * jankStats.getJankHeuristicMultiplier()), frameMetrics));
        jankStatsApi24Impl.prevStart = jMax;
    }

    public FrameDataApi24 getFrameData$metrics_performance_release(long p0, long p1, FrameMetrics p2) {
        Intrinsics.checkNotNullParameter(p2, "");
        long metric = p2.getMetric(0);
        long metric2 = p2.getMetric(1);
        long metric3 = metric + metric2 + p2.getMetric(2) + p2.getMetric(3) + p2.getMetric(4) + p2.getMetric(5);
        this.prevEnd = p0 + metric3;
        PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(p0, this.prevEnd, getStateInfo());
        }
        this.frameData.update$metrics_performance_release(p0, metric3, p2.getMetric(8), metric3 > p1);
        return this.frameData;
    }

    public long getFrameStartTime$metrics_performance_release(FrameMetrics p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getFrameStartTime$metrics_performance_release();
    }

    public long getExpectedFrameDuration(FrameMetrics p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getExpectedFrameDuration(getDecorViewRef$metrics_performance_release().get());
    }

    @Override // androidx.metrics.performance.JankStatsApi16Impl, androidx.metrics.performance.JankStatsBaseImpl
    public void setupFrameTimer(boolean p0) {
        synchronized (this.window) {
            try {
                if (!p0) {
                    removeFrameMetricsListenerDelegate(this.window, this.frameMetricsAvailableListenerDelegate);
                    this.listenerAddedTime = 0L;
                } else if (this.listenerAddedTime == 0) {
                    getOrCreateFrameMetricsListenerDelegator(this.window).add(this.frameMetricsAvailableListenerDelegate);
                    this.listenerAddedTime = System.nanoTime();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Landroidx/metrics/performance/JankStatsApi24Impl$Companion;", "", "<init>", "()V", "Landroid/os/Handler;", "frameMetricsHandler", "Landroid/os/Handler;", "getFrameMetricsHandler$metrics_performance_release", "()Landroid/os/Handler;", "setFrameMetricsHandler$metrics_performance_release", "(Landroid/os/Handler;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Handler getFrameMetricsHandler$metrics_performance_release() {
            return JankStatsApi24Impl.frameMetricsHandler;
        }

        public final void setFrameMetricsHandler$metrics_performance_release(Handler handler) {
            JankStatsApi24Impl.frameMetricsHandler = handler;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void removeFrameMetricsListenerDelegate(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        DelegatingFrameMetricsListener delegatingFrameMetricsListener = (DelegatingFrameMetricsListener) window.getDecorView().getTag(R.id.metricsDelegator);
        if (delegatingFrameMetricsListener != null) {
            delegatingFrameMetricsListener.remove(onFrameMetricsAvailableListener, window);
        }
    }

    private final DelegatingFrameMetricsListener getOrCreateFrameMetricsListenerDelegator(Window window) {
        DelegatingFrameMetricsListener delegatingFrameMetricsListener = (DelegatingFrameMetricsListener) window.getDecorView().getTag(R.id.metricsDelegator);
        if (delegatingFrameMetricsListener != null) {
            return delegatingFrameMetricsListener;
        }
        DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = new DelegatingFrameMetricsListener(new ArrayList());
        if (frameMetricsHandler == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            frameMetricsHandler = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(delegatingFrameMetricsListener2, frameMetricsHandler);
        window.getDecorView().setTag(R.id.metricsDelegator, delegatingFrameMetricsListener2);
        return delegatingFrameMetricsListener2;
    }
}
