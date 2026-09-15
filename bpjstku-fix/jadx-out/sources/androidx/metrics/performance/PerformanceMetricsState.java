package androidx.metrics.performance;

import android.view.View;
import android.view.ViewParent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0003'()B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0003J-\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010!"}, d2 = {"Landroidx/metrics/performance/PerformanceMetricsState;", "", "<init>", "()V", "", "p0", "p1", "", "Landroidx/metrics/performance/StateInfo;", "p2", "Landroidx/metrics/performance/PerformanceMetricsState$StateData;", "p3", "", "addFrameState", "(JJLjava/util/List;Ljava/util/List;)V", "cleanupSingleFrameStates$metrics_performance_release", "getIntervalStates$metrics_performance_release", "(JJLjava/util/List;)V", "getStateData$metrics_performance_release", "(JJLandroidx/metrics/performance/StateInfo;)Landroidx/metrics/performance/PerformanceMetricsState$StateData;", "", "markStateForRemoval", "(Ljava/lang/String;)V", "", "(Ljava/lang/String;Ljava/util/List;J)V", "putSingleFrameState", "(Ljava/lang/String;Ljava/lang/String;)V", "putState", "removeState", "removeStateNow$metrics_performance_release", "returnStateDataToPool$metrics_performance_release", "(Landroidx/metrics/performance/PerformanceMetricsState$StateData;)V", "singleFrameStates", "Ljava/util/List;", "stateDataPool", "states", "statesHolder", "", "statesToBeCleared", "Companion", "Holder", "StateData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PerformanceMetricsState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<StateData> singleFrameStates;
    private final List<StateData> stateDataPool;
    private List<StateData> states;
    private final List<StateData> statesHolder;
    private final List<Integer> statesToBeCleared;

    private PerformanceMetricsState() {
        this.states = new ArrayList();
        this.singleFrameStates = new ArrayList();
        this.statesHolder = new ArrayList();
        this.statesToBeCleared = new ArrayList();
        this.stateDataPool = new ArrayList();
    }

    private final void addFrameState(long p0, long p1, List<StateInfo> p2, List<StateData> p3) {
        int size = p3.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                StateData stateData = p3.get(size);
                if (stateData.getTimeRemoved() > 0 && stateData.getTimeRemoved() < p0) {
                    returnStateDataToPool$metrics_performance_release(p3.remove(size));
                } else if (stateData.getTimeAdded() < p1) {
                    this.statesHolder.add(stateData);
                    if (Intrinsics.areEqual(p3, this.singleFrameStates) && stateData.getTimeRemoved() == -1) {
                        stateData.setTimeRemoved(System.nanoTime());
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (this.statesHolder.size() > 0) {
            int size2 = this.statesHolder.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!this.statesToBeCleared.contains(Integer.valueOf(i2))) {
                    StateData stateData2 = this.statesHolder.get(i2);
                    int size3 = this.statesHolder.size();
                    for (int i3 = i2 + 1; i3 < size3; i3++) {
                        StateData stateData3 = this.statesHolder.get(i3);
                        if (Intrinsics.areEqual(stateData2.getState().getKey(), stateData3.getState().getKey())) {
                            if (stateData2.getTimeAdded() < stateData3.getTimeAdded()) {
                                this.statesToBeCleared.add(Integer.valueOf(i2));
                            } else {
                                this.statesToBeCleared.add(Integer.valueOf(i3));
                            }
                        }
                    }
                }
            }
            for (int size4 = this.statesToBeCleared.size() - 1; size4 >= 0; size4--) {
                this.statesHolder.remove(this.statesToBeCleared.get(size4).intValue());
            }
            int size5 = this.statesHolder.size();
            for (int i4 = 0; i4 < size5; i4++) {
                p2.add(this.statesHolder.get(i4).getState());
            }
            this.statesHolder.clear();
            this.statesToBeCleared.clear();
        }
    }

    private final void markStateForRemoval(String p0, List<StateData> p1, long p2) {
        synchronized (this.singleFrameStates) {
            int size = p1.size();
            for (int i = 0; i < size; i++) {
                StateData stateData = p1.get(i);
                if (Intrinsics.areEqual(stateData.getState().getKey(), p0) && stateData.getTimeRemoved() < 0) {
                    stateData.setTimeRemoved(p2);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void putState(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this.singleFrameStates) {
            long jNanoTime = System.nanoTime();
            markStateForRemoval(p0, this.states, jNanoTime);
            this.states.add(getStateData$metrics_performance_release(jNanoTime, -1L, new StateInfo(p0, p1)));
        }
    }

    public final void putSingleFrameState(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this.singleFrameStates) {
            long jNanoTime = System.nanoTime();
            markStateForRemoval(p0, this.singleFrameStates, jNanoTime);
            this.singleFrameStates.add(getStateData$metrics_performance_release(jNanoTime, -1L, new StateInfo(p0, p1)));
        }
    }

    private final void markStateForRemoval(String p0) {
        markStateForRemoval(p0, this.states, System.nanoTime());
    }

    public final void removeStateNow$metrics_performance_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.singleFrameStates) {
            int size = this.states.size();
            for (int i = 0; i < size; i++) {
                StateData stateData = this.states.get(i);
                if (Intrinsics.areEqual(stateData.getState().getKey(), p0)) {
                    this.states.remove(stateData);
                    returnStateDataToPool$metrics_performance_release(stateData);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014"}, d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$StateData;", "", "", "p0", "p1", "Landroidx/metrics/performance/StateInfo;", "p2", "<init>", "(JJLandroidx/metrics/performance/StateInfo;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/metrics/performance/StateInfo;", "getState", "()Landroidx/metrics/performance/StateInfo;", "setState", "(Landroidx/metrics/performance/StateInfo;)V", "timeAdded", "J", "getTimeAdded", "()J", "setTimeAdded", "(J)V", "timeRemoved", "getTimeRemoved", "setTimeRemoved"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StateData {
        private StateInfo state;
        private long timeAdded;
        private long timeRemoved;

        public StateData(long j, long j2, StateInfo stateInfo) {
            Intrinsics.checkNotNullParameter(stateInfo, "");
            this.timeAdded = j;
            this.timeRemoved = j2;
            this.state = stateInfo;
        }

        public final long getTimeAdded() {
            return this.timeAdded;
        }

        public final void setTimeAdded(long j) {
            this.timeAdded = j;
        }

        public final long getTimeRemoved() {
            return this.timeRemoved;
        }

        public final void setTimeRemoved(long j) {
            this.timeRemoved = j;
        }

        public final StateInfo getState() {
            return this.state;
        }

        public final void setState(StateInfo stateInfo) {
            Intrinsics.checkNotNullParameter(stateInfo, "");
            this.state = stateInfo;
        }
    }

    public final StateData getStateData$metrics_performance_release(long p0, long p1, StateInfo p2) {
        Intrinsics.checkNotNullParameter(p2, "");
        synchronized (this.stateDataPool) {
            if (this.stateDataPool.isEmpty()) {
                return new StateData(p0, p1, p2);
            }
            StateData stateDataRemove = this.stateDataPool.remove(0);
            stateDataRemove.setTimeAdded(p0);
            stateDataRemove.setTimeRemoved(p1);
            stateDataRemove.setState(p2);
            return stateDataRemove;
        }
    }

    public final void returnStateDataToPool$metrics_performance_release(StateData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.stateDataPool) {
            try {
                this.stateDataPool.add(p0);
            } catch (OutOfMemoryError unused) {
                this.stateDataPool.clear();
                this.stateDataPool.add(p0);
            }
        }
    }

    public final void removeState(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        markStateForRemoval(p0);
    }

    public final void getIntervalStates$metrics_performance_release(long p0, long p1, List<StateInfo> p2) {
        Intrinsics.checkNotNullParameter(p2, "");
        synchronized (this.singleFrameStates) {
            p2.clear();
            addFrameState(p0, p1, p2, this.states);
            addFrameState(p0, p1, p2, this.singleFrameStates);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void cleanupSingleFrameStates$metrics_performance_release() {
        synchronized (this.singleFrameStates) {
            for (int size = this.singleFrameStates.size() - 1; size >= 0; size--) {
                if (this.singleFrameStates.get(size).getTimeRemoved() != -1) {
                    returnStateDataToPool$metrics_performance_release(this.singleFrameStates.remove(size));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$Companion;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "create$metrics_performance_release", "(Landroid/view/View;)Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getHolderForHierarchy", "getRootView$metrics_performance_release", "(Landroid/view/View;)Landroid/view/View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Holder getHolderForHierarchy(View p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            View rootView$metrics_performance_release = getRootView$metrics_performance_release(p0);
            Object tag = rootView$metrics_performance_release.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new Holder();
                rootView$metrics_performance_release.setTag(R.id.metricsStateHolder, tag);
            }
            return (Holder) tag;
        }

        @JvmStatic
        public final Holder create$metrics_performance_release(View p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Holder holderForHierarchy = getHolderForHierarchy(p0);
            if (holderForHierarchy.getState() == null) {
                holderForHierarchy.setState$metrics_performance_release(new PerformanceMetricsState(null));
            }
            return holderForHierarchy;
        }

        public final View getRootView$metrics_performance_release(View p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            ViewParent parent = p0.getParent();
            while (parent instanceof View) {
                p0 = parent;
                parent = p0.getParent();
            }
            return p0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PerformanceMetricsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final Holder getHolderForHierarchy(View view) {
        return INSTANCE.getHolderForHierarchy(view);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "", "<init>", "()V", "Landroidx/metrics/performance/PerformanceMetricsState;", "p0", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/metrics/performance/PerformanceMetricsState;", "getState", "()Landroidx/metrics/performance/PerformanceMetricsState;", "setState$metrics_performance_release", "(Landroidx/metrics/performance/PerformanceMetricsState;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Holder {
        private PerformanceMetricsState state;

        public final PerformanceMetricsState getState() {
            return this.state;
        }

        public final void setState$metrics_performance_release(PerformanceMetricsState performanceMetricsState) {
            this.state = performanceMetricsState;
        }
    }
}
