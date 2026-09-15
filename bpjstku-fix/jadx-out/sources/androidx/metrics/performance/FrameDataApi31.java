package androidx.metrics.performance;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!"}, d2 = {"Landroidx/metrics/performance/FrameDataApi31;", "Landroidx/metrics/performance/FrameDataApi24;", "", "p0", "p1", "p2", "p3", "p4", "", "p5", "", "Landroidx/metrics/performance/StateInfo;", "p6", "<init>", "(JJJJJZLjava/util/List;)V", "Landroidx/metrics/performance/FrameData;", "copy", "()Landroidx/metrics/performance/FrameData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update$metrics_performance_release", "(JJJJJZ)V", "frameDurationTotalNanos", "J", "getFrameDurationTotalNanos", "()J", "frameOverrunNanos", "getFrameOverrunNanos"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FrameDataApi31 extends FrameDataApi24 {
    private long frameDurationTotalNanos;
    private long frameOverrunNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameDataApi31(long j, long j2, long j3, long j4, long j5, boolean z, List<StateInfo> list) {
        super(j, j2, j3, z, list);
        Intrinsics.checkNotNullParameter(list, "");
        this.frameDurationTotalNanos = j4;
        this.frameOverrunNanos = j5;
    }

    public final long getFrameDurationTotalNanos() {
        return this.frameDurationTotalNanos;
    }

    public final long getFrameOverrunNanos() {
        return this.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final FrameData copy() {
        return new FrameDataApi31(getFrameStartNanos(), getFrameDurationUiNanos(), getFrameDurationCpuNanos(), this.frameDurationTotalNanos, this.frameOverrunNanos, getIsJank(), new ArrayList(getStates()));
    }

    public final void update$metrics_performance_release(long p0, long p1, long p2, long p3, long p4, boolean p5) {
        super.update$metrics_performance_release(p0, p1, p2, p5);
        this.frameDurationTotalNanos = p3;
        this.frameOverrunNanos = p4;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final boolean equals(Object p0) {
        if (!(p0 instanceof FrameDataApi31) || !super.equals(p0)) {
            return false;
        }
        FrameDataApi31 frameDataApi31 = (FrameDataApi31) p0;
        return this.frameDurationTotalNanos == frameDataApi31.frameDurationTotalNanos && this.frameOverrunNanos == frameDataApi31.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final int hashCode() {
        return (super.hashCode() * 31) + (Long.hashCode(this.frameDurationTotalNanos) * 31) + Long.hashCode(this.frameOverrunNanos);
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(getFrameStartNanos());
        sb.append(", frameDurationUiNanos=");
        sb.append(getFrameDurationUiNanos());
        sb.append(", frameDurationCpuNanos=");
        sb.append(getFrameDurationCpuNanos());
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.frameDurationTotalNanos);
        sb.append(", frameOverrunNanos=");
        sb.append(this.frameOverrunNanos);
        sb.append(", isJank=");
        sb.append(getIsJank());
        sb.append(", states=");
        sb.append(getStates());
        sb.append(')');
        return sb.toString();
    }
}
