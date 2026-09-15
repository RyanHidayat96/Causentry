package androidx.metrics.performance;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/metrics/performance/FrameData;", "", "", "p0", "p1", "", "p2", "", "Landroidx/metrics/performance/StateInfo;", "p3", "<init>", "(JJZLjava/util/List;)V", "copy", "()Landroidx/metrics/performance/FrameData;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update$metrics_performance_release", "(JJZ)V", "frameDurationUiNanos", "J", "getFrameDurationUiNanos", "()J", "frameStartNanos", "getFrameStartNanos", "isJank", "Z", "()Z", "states", "Ljava/util/List;", "getStates", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FrameData {
    private long frameDurationUiNanos;
    private long frameStartNanos;
    private boolean isJank;
    private final List<StateInfo> states;

    public FrameData(long j, long j2, boolean z, List<StateInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.states = list;
        this.frameStartNanos = j;
        this.frameDurationUiNanos = j2;
        this.isJank = z;
    }

    public final List<StateInfo> getStates() {
        return this.states;
    }

    public final long getFrameStartNanos() {
        return this.frameStartNanos;
    }

    public final long getFrameDurationUiNanos() {
        return this.frameDurationUiNanos;
    }

    /* JADX INFO: renamed from: isJank, reason: from getter */
    public final boolean getIsJank() {
        return this.isJank;
    }

    public FrameData copy() {
        return new FrameData(this.frameStartNanos, this.frameDurationUiNanos, this.isJank, new ArrayList(this.states));
    }

    public final void update$metrics_performance_release(long p0, long p1, boolean p2) {
        this.frameStartNanos = p0;
        this.frameDurationUiNanos = p1;
        this.isJank = p2;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        FrameData frameData = (FrameData) p0;
        return this.frameStartNanos == frameData.frameStartNanos && this.frameDurationUiNanos == frameData.frameDurationUiNanos && this.isJank == frameData.isJank && Intrinsics.areEqual(this.states, frameData.states);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.frameStartNanos);
        return (((((iHashCode * 31) + Long.hashCode(this.frameDurationUiNanos)) * 31) + Boolean.hashCode(this.isJank)) * 31) + this.states.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.frameStartNanos);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.frameDurationUiNanos);
        sb.append(", isJank=");
        sb.append(this.isJank);
        sb.append(", states=");
        sb.append(this.states);
        sb.append(')');
        return sb.toString();
    }
}
