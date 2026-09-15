package androidx.metrics.performance;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0011¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\b\u0012\u0004\u0012\u0002020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Landroidx/metrics/performance/JankStatsApi16Impl;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "Landroidx/metrics/performance/JankStats;", "p0", "Landroid/view/View;", "p1", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;)V", "Landroid/view/Choreographer;", "", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "p2", "Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "createDelegatingOnDrawListener$metrics_performance_release", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "", "getExpectedFrameDuration", "(Landroid/view/View;)J", "Landroidx/metrics/performance/FrameData;", "getFrameData$metrics_performance_release", "(JJJ)Landroidx/metrics/performance/FrameData;", "getFrameStartTime$metrics_performance_release", "()J", "", "", "setupFrameTimer", "(Z)V", "getOrCreateOnPreDrawListenerDelegator", "(Landroid/view/View;)Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "removeOnPreDrawListenerDelegate", "(Landroid/view/View;Landroidx/metrics/performance/OnFrameListenerDelegate;)V", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef$metrics_performance_release", "()Ljava/lang/ref/WeakReference;", "frameData", "Landroidx/metrics/performance/FrameData;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "metricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getMetricsStateHolder", "()Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Landroidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1;", "onFrameListenerDelegate", "Landroidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1;", "Landroidx/metrics/performance/StateInfo;", "stateInfo", "Ljava/util/List;", "getStateInfo", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JankStatsApi16Impl extends JankStatsBaseImpl {
    private final Choreographer choreographer;
    private final WeakReference<View> decorViewRef;
    private final FrameData frameData;
    private final PerformanceMetricsState.Holder metricsStateHolder;
    private final JankStatsApi16Impl$onFrameListenerDelegate$1 onFrameListenerDelegate;
    private final List<StateInfo> stateInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1] */
    public JankStatsApi16Impl(final JankStats jankStats, View view) {
        super(jankStats);
        Intrinsics.checkNotNullParameter(jankStats, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.decorViewRef = new WeakReference<>(view);
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "");
        this.choreographer = choreographer;
        this.metricsStateHolder = PerformanceMetricsState.INSTANCE.getHolderForHierarchy(view);
        ArrayList arrayList = new ArrayList();
        this.stateInfo = arrayList;
        this.frameData = new FrameData(0L, 0L, false, arrayList);
        this.onFrameListenerDelegate = new OnFrameListenerDelegate() { // from class: androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1
            @Override // androidx.metrics.performance.OnFrameListenerDelegate
            public final void onFrame(long p0, long p1, long p2) {
                JankStats jankStats2 = jankStats;
                jankStats2.logFrameData$metrics_performance_release(this.getFrameData$metrics_performance_release(p0, p1, (long) (p2 * jankStats2.getJankHeuristicMultiplier())));
            }
        };
    }

    public final WeakReference<View> getDecorViewRef$metrics_performance_release() {
        return this.decorViewRef;
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final PerformanceMetricsState.Holder getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    public final List<StateInfo> getStateInfo() {
        return this.stateInfo;
    }

    @Override // androidx.metrics.performance.JankStatsBaseImpl
    public void setupFrameTimer(boolean p0) {
        View view = this.decorViewRef.get();
        if (view != null) {
            if (p0) {
                getOrCreateOnPreDrawListenerDelegator(view).add(this.onFrameListenerDelegate);
            } else {
                removeOnPreDrawListenerDelegate(view, this.onFrameListenerDelegate);
            }
        }
    }

    public FrameData getFrameData$metrics_performance_release(long p0, long p1, long p2) {
        PerformanceMetricsState state = this.metricsStateHolder.getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(p0, p0 + p1, this.stateInfo);
        }
        this.frameData.update$metrics_performance_release(p0, p1, p1 > p2);
        return this.frameData;
    }

    private final void removeOnPreDrawListenerDelegate(View view, OnFrameListenerDelegate onFrameListenerDelegate) {
        DelegatingOnPreDrawListener delegatingOnPreDrawListener = (DelegatingOnPreDrawListener) view.getTag(R.id.metricsDelegator);
        if (delegatingOnPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "");
            delegatingOnPreDrawListener.remove(onFrameListenerDelegate, viewTreeObserver);
        }
    }

    private final DelegatingOnPreDrawListener getOrCreateOnPreDrawListenerDelegator(View view) {
        DelegatingOnPreDrawListener delegatingOnPreDrawListener = (DelegatingOnPreDrawListener) view.getTag(R.id.metricsDelegator);
        if (delegatingOnPreDrawListener != null) {
            return delegatingOnPreDrawListener;
        }
        DelegatingOnPreDrawListener delegatingOnPreDrawListenerCreateDelegatingOnDrawListener$metrics_performance_release = createDelegatingOnDrawListener$metrics_performance_release(view, this.choreographer, new ArrayList());
        view.getViewTreeObserver().addOnPreDrawListener(delegatingOnPreDrawListenerCreateDelegatingOnDrawListener$metrics_performance_release);
        view.setTag(R.id.metricsDelegator, delegatingOnPreDrawListenerCreateDelegatingOnDrawListener$metrics_performance_release);
        return delegatingOnPreDrawListenerCreateDelegatingOnDrawListener$metrics_performance_release;
    }

    public DelegatingOnPreDrawListener createDelegatingOnDrawListener$metrics_performance_release(View p0, Choreographer p1, List<OnFrameListenerDelegate> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new DelegatingOnPreDrawListener(p0, p1, p2);
    }

    public final long getFrameStartTime$metrics_performance_release() throws IllegalAccessException {
        Object obj = DelegatingOnPreDrawListener.INSTANCE.getChoreographerLastFrameTimeField().get(this.choreographer);
        Intrinsics.checkNotNull(obj, "");
        return ((Long) obj).longValue();
    }

    public final long getExpectedFrameDuration(View p0) {
        return DelegatingOnPreDrawListener.INSTANCE.getExpectedFrameDuration(p0);
    }
}
