package androidx.metrics.performance;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/metrics/performance/FrameDataApi24;", "Landroidx/metrics/performance/FrameData;", "", "p0", "p1", "p2", "", "p3", "", "Landroidx/metrics/performance/StateInfo;", "p4", "<init>", "(JJJZLjava/util/List;)V", "copy", "()Landroidx/metrics/performance/FrameData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update$metrics_performance_release", "(JJJZ)V", "frameDurationCpuNanos", "J", "getFrameDurationCpuNanos", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FrameDataApi24 extends FrameData {
    private long frameDurationCpuNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameDataApi24(long j, long j2, long j3, boolean z, List<StateInfo> list) {
        super(j, j2, z, list);
        Intrinsics.checkNotNullParameter(list, "");
        this.frameDurationCpuNanos = j3;
    }

    public final long getFrameDurationCpuNanos() {
        return this.frameDurationCpuNanos;
    }

    @Override // androidx.metrics.performance.FrameData
    public FrameData copy() {
        return new FrameDataApi24(getFrameStartNanos(), getFrameDurationUiNanos(), this.frameDurationCpuNanos, getIsJank(), new ArrayList(getStates()));
    }

    public final void update$metrics_performance_release(long p0, long p1, long p2, boolean p3) {
        super.update$metrics_performance_release(p0, p1, p3);
        this.frameDurationCpuNanos = p2;
    }

    @Override // androidx.metrics.performance.FrameData
    public boolean equals(Object p0) {
        return (p0 instanceof FrameDataApi24) && super.equals(p0) && this.frameDurationCpuNanos == ((FrameDataApi24) p0).frameDurationCpuNanos;
    }

    @Override // androidx.metrics.performance.FrameData
    public int hashCode() {
        return (super.hashCode() * 31) + Long.hashCode(this.frameDurationCpuNanos);
    }

    @Override // androidx.metrics.performance.FrameData
    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(getFrameStartNanos());
        sb.append(", frameDurationUiNanos=");
        sb.append(getFrameDurationUiNanos());
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.frameDurationCpuNanos);
        sb.append(", isJank=");
        sb.append(getIsJank());
        sb.append(", states=");
        sb.append(getStates());
        sb.append(')');
        return sb.toString();
    }
}
