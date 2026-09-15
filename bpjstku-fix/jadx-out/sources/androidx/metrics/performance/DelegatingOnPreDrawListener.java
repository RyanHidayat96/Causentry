package androidx.metrics.performance;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u0000 52\u00020\u0001:\u00015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&"}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View;", "p0", "Landroid/view/Choreographer;", "p1", "", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "p2", "<init>", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)V", "", "add", "(Landroidx/metrics/performance/OnFrameListenerDelegate;)V", "", "getFrameStartTime", "()J", "", "onPreDraw", "()Z", "Landroid/view/ViewTreeObserver;", "remove", "(Landroidx/metrics/performance/OnFrameListenerDelegate;Landroid/view/ViewTreeObserver;)V", "Landroid/os/Message;", "setMessageAsynchronicity$metrics_performance_release", "(Landroid/os/Message;)V", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef", "()Ljava/lang/ref/WeakReference;", "delegates", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "iterating", "Z", "getIterating", "setIterating", "(Z)V", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "metricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getMetricsStateHolder", "()Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "toBeAdded", "getToBeAdded", "toBeRemoved", "getToBeRemoved", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DelegatingOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Field choreographerLastFrameTimeField;
    private final Choreographer choreographer;
    private final WeakReference<View> decorViewRef;
    private final List<OnFrameListenerDelegate> delegates;
    private boolean iterating;
    private final PerformanceMetricsState.Holder metricsStateHolder;
    private final List<OnFrameListenerDelegate> toBeAdded;
    private final List<OnFrameListenerDelegate> toBeRemoved;

    public DelegatingOnPreDrawListener(View view, Choreographer choreographer, List<OnFrameListenerDelegate> list) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(choreographer, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.choreographer = choreographer;
        this.delegates = list;
        this.toBeAdded = new ArrayList();
        this.toBeRemoved = new ArrayList();
        this.decorViewRef = new WeakReference<>(view);
        this.metricsStateHolder = PerformanceMetricsState.INSTANCE.getHolderForHierarchy(view);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final List<OnFrameListenerDelegate> getDelegates() {
        return this.delegates;
    }

    public final boolean getIterating() {
        return this.iterating;
    }

    public final void setIterating(boolean z) {
        this.iterating = z;
    }

    public final List<OnFrameListenerDelegate> getToBeAdded() {
        return this.toBeAdded;
    }

    public final List<OnFrameListenerDelegate> getToBeRemoved() {
        return this.toBeRemoved;
    }

    public final WeakReference<View> getDecorViewRef() {
        return this.decorViewRef;
    }

    public final PerformanceMetricsState.Holder getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() throws IllegalAccessException {
        final View view = this.decorViewRef.get();
        if (view == null) {
            return true;
        }
        final long frameStartTime = getFrameStartTime();
        Handler handler = view.getHandler();
        Message messageObtain = Message.obtain(view.getHandler(), new Runnable() { // from class: androidx.metrics.performance.DelegatingOnPreDrawListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingOnPreDrawListener.onPreDraw$lambda$4$lambda$3$lambda$1(view, this, frameStartTime, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(messageObtain, "");
        setMessageAsynchronicity$metrics_performance_release(messageObtain);
        handler.sendMessageAtFrontOfQueue(messageObtain);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreDraw$lambda$4$lambda$3$lambda$1(View view, DelegatingOnPreDrawListener delegatingOnPreDrawListener, long j, View view2) {
        Intrinsics.checkNotNullParameter(delegatingOnPreDrawListener, "");
        Intrinsics.checkNotNullParameter(view2, "");
        long jNanoTime = System.nanoTime();
        long expectedFrameDuration = INSTANCE.getExpectedFrameDuration(view);
        synchronized (delegatingOnPreDrawListener) {
            delegatingOnPreDrawListener.iterating = true;
            Iterator<OnFrameListenerDelegate> it = delegatingOnPreDrawListener.delegates.iterator();
            while (it.hasNext()) {
                it.next().onFrame(j, jNanoTime - j, expectedFrameDuration);
            }
            if (!delegatingOnPreDrawListener.toBeAdded.isEmpty()) {
                Iterator<OnFrameListenerDelegate> it2 = delegatingOnPreDrawListener.toBeAdded.iterator();
                while (it2.hasNext()) {
                    delegatingOnPreDrawListener.delegates.add(it2.next());
                }
                delegatingOnPreDrawListener.toBeAdded.clear();
            }
            if (!delegatingOnPreDrawListener.toBeRemoved.isEmpty()) {
                boolean zIsEmpty = delegatingOnPreDrawListener.delegates.isEmpty();
                Iterator<OnFrameListenerDelegate> it3 = delegatingOnPreDrawListener.toBeRemoved.iterator();
                while (it3.hasNext()) {
                    delegatingOnPreDrawListener.delegates.remove(it3.next());
                }
                delegatingOnPreDrawListener.toBeRemoved.clear();
                if (!zIsEmpty && delegatingOnPreDrawListener.delegates.isEmpty()) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(delegatingOnPreDrawListener);
                    view2.setTag(R.id.metricsDelegator, null);
                }
            }
            delegatingOnPreDrawListener.iterating = false;
            Unit unit = Unit.INSTANCE;
        }
        PerformanceMetricsState state = delegatingOnPreDrawListener.metricsStateHolder.getState();
        if (state != null) {
            state.cleanupSingleFrameStates$metrics_performance_release();
        }
    }

    public final void add(OnFrameListenerDelegate p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            if (this.iterating) {
                this.toBeAdded.add(p0);
            } else {
                this.delegates.add(p0);
            }
        }
    }

    public final void remove(OnFrameListenerDelegate p0, ViewTreeObserver p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this) {
            if (this.iterating) {
                this.toBeRemoved.add(p0);
            } else {
                boolean zIsEmpty = this.delegates.isEmpty();
                this.delegates.remove(p0);
                if (zIsEmpty || !this.delegates.isEmpty()) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    p1.removeOnPreDrawListener(this);
                    View view = this.decorViewRef.get();
                    if (view != null) {
                        view.setTag(R.id.metricsDelegator, null);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final long getFrameStartTime() throws IllegalAccessException {
        Object obj = choreographerLastFrameTimeField.get(this.choreographer);
        Intrinsics.checkNotNull(obj, "");
        return ((Long) obj).longValue();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener$Companion;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getExpectedFrameDuration", "(Landroid/view/View;)J", "Ljava/lang/reflect/Field;", "choreographerLastFrameTimeField", "Ljava/lang/reflect/Field;", "getChoreographerLastFrameTimeField", "()Ljava/lang/reflect/Field;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Field getChoreographerLastFrameTimeField() {
            return DelegatingOnPreDrawListener.choreographerLastFrameTimeField;
        }

        public final long getExpectedFrameDuration(View p0) {
            if (JankStatsBaseImpl.INSTANCE.getFrameDuration() < 0) {
                Window window = null;
                if ((p0 != null ? p0.getContext() : null) instanceof Activity) {
                    Context context = p0.getContext();
                    Intrinsics.checkNotNull(context, "");
                    window = ((Activity) context).getWindow();
                }
                float f = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f = refreshRate;
                }
                JankStatsBaseImpl.INSTANCE.setFrameDuration((long) ((1000.0f / f) * 1000000.0f));
            }
            return JankStatsBaseImpl.INSTANCE.getFrameDuration();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        choreographerLastFrameTimeField = declaredField;
        declaredField.setAccessible(true);
    }

    public void setMessageAsynchronicity$metrics_performance_release(Message p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
