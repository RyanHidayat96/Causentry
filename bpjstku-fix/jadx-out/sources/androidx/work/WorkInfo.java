package androidx.work;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b0\u0018\u0000 G2\u00020\u0001:\u0003GHIB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u00101\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u001a\u0010;\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010\u001dR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010\u001dR \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F"}, d2 = {"Landroidx/work/WorkInfo;", "", "Ljava/util/UUID;", "p0", "Landroidx/work/WorkInfo$State;", "p1", "", "", "p2", "Landroidx/work/Data;", "p3", "p4", "", "p5", "p6", "Landroidx/work/Constraints;", "p7", "", "p8", "Landroidx/work/WorkInfo$PeriodicityInfo;", "p9", "p10", "p11", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "constraints", "Landroidx/work/Constraints;", "getConstraints", "()Landroidx/work/Constraints;", "generation", "I", "getGeneration", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "initialDelayMillis", "J", "getInitialDelayMillis", "()J", "nextScheduleTimeMillis", "getNextScheduleTimeMillis", "outputData", "Landroidx/work/Data;", "getOutputData", "()Landroidx/work/Data;", "periodicityInfo", "Landroidx/work/WorkInfo$PeriodicityInfo;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "progress", "getProgress", "runAttemptCount", "getRunAttemptCount", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", "stopReason", "getStopReason", "tags", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "Companion", "PeriodicityInfo", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkInfo {
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2, int i3) {
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    public final UUID getId() {
        return this.id;
    }

    public final State getState() {
        return this.state;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, state, set, (i4 & 8) != 0 ? Data.EMPTY : data, (i4 & 16) != 0 ? Data.EMPTY : data2, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? Constraints.NONE : constraints, (i4 & 256) != 0 ? 0L : j, (i4 & 512) != 0 ? null : periodicityInfo, (i4 & 1024) != 0 ? Long.MAX_VALUE : j2, (i4 & 2048) != 0 ? -256 : i3);
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) p0;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.areEqual(this.outputData, workInfo.outputData) && Intrinsics.areEqual(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && Intrinsics.areEqual(this.tags, workInfo.tags)) {
            return Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.state.hashCode();
        int iHashCode3 = this.outputData.hashCode();
        int iHashCode4 = this.tags.hashCode();
        int iHashCode5 = this.progress.hashCode();
        int i = this.runAttemptCount;
        int i2 = this.generation;
        int iHashCode6 = this.constraints.hashCode();
        int iHashCode7 = Long.hashCode(this.initialDelayMillis);
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{id='");
        sb.append(this.id);
        sb.append("', state=");
        sb.append(this.state);
        sb.append(", outputData=");
        sb.append(this.outputData);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", runAttemptCount=");
        sb.append(this.runAttemptCount);
        sb.append(", generation=");
        sb.append(this.generation);
        sb.append(", constraints=");
        sb.append(this.constraints);
        sb.append(", initialDelayMillis=");
        sb.append(this.initialDelayMillis);
        sb.append(", periodicityInfo=");
        sb.append(this.periodicityInfo);
        sb.append(", nextScheduleTimeMillis=");
        sb.append(this.nextScheduleTimeMillis);
        sb.append("}, stopReason=");
        sb.append(this.stopReason);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set) {
        this(uuid, state, set, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data) {
        this(uuid, state, set, data, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2) {
        this(uuid, state, set, data, data2, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i) {
        this(uuid, state, set, data, data2, i, 0, null, 0L, null, 0L, 0, 4032, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2) {
        this(uuid, state, set, data, data2, i, i2, null, 0L, null, 0L, 0, 3968, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints) {
        this(uuid, state, set, data, data2, i, i2, constraints, 0L, null, 0L, 0, 3840, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints, long j) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, null, 0L, 0, 3584, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, j2, 0, 2048, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "<init>", "(Ljava/lang/String;I)V", "", "isFinished", "()Z", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "flexIntervalMillis", "J", "getFlexIntervalMillis", "()J", "repeatIntervalMillis", "getRepeatIntervalMillis"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
                return false;
            }
            PeriodicityInfo periodicityInfo = (PeriodicityInfo) p0;
            return periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis;
        }

        public final int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.repeatIntervalMillis);
            sb.append(", flexIntervalMillis=");
            sb.append(this.flexIntervalMillis);
            sb.append('}');
            return sb.toString();
        }
    }
}
