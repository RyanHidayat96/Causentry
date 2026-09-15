package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0007Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u0014\u0012\b\b\u0002\u0010$\u001a\u00020\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012HÇ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0016HÇ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b1\u0010(J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b4\u0010(J\u0010\u00105\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u001eHÇ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\bHÇ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b<\u0010.J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010(J\u0010\u0010>\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b>\u0010.J\u0010\u0010?\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b?\u0010.J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010*J\u0010\u0010A\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bA\u0010*J\u0010\u0010B\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bB\u0010*J\u0010\u0010C\u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\bE\u0010DJ\u0010\u0010F\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bF\u0010(J\u0010\u0010G\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bG\u0010(J\u0010\u0010H\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bH\u0010(J\u0082\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010K\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u001c¢\u0006\u0004\bM\u00106J\u0010\u0010N\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bN\u0010.J\u0015\u0010P\u001a\u00020O2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020O2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\bR\u0010QJ\u001d\u0010R\u001a\u00020O2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0002H\u0017¢\u0006\u0004\bT\u0010*R\u0016\u0010U\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u001a\u0010^\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010.R\u0014\u0010a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u0010VR\u0016\u0010d\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bf\u0010bR\u0016\u0010g\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010VR\u0011\u0010h\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\bh\u00106R\u0011\u0010i\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\bi\u00106R\u0016\u0010j\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bj\u0010VR\u0016\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bk\u0010VR\"\u0010l\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010V\u001a\u0004\bm\u0010(\"\u0004\bn\u0010QR\"\u0010o\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010_\u001a\u0004\bp\u0010.\"\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bu\u0010eR\"\u0010v\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010_\u001a\u0004\bw\u0010.\"\u0004\bx\u0010rR\u0016\u0010y\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\by\u0010_R\u0016\u0010z\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bz\u0010VR\u0016\u0010{\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010}\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010_\u001a\u0004\b~\u0010.R'\u0010\u007f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0004\b\u007f\u0010b\u001a\u0005\b\u0080\u0001\u0010*\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010b"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "Landroidx/work/WorkInfo$State;", "p2", "p3", "Landroidx/work/Data;", "p4", "p5", "", "p6", "p7", "p8", "Landroidx/work/Constraints;", "p9", "", "p10", "Landroidx/work/BackoffPolicy;", "p11", "p12", "p13", "p14", "p15", "", "p16", "Landroidx/work/OutOfQuotaPolicy;", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V", "calculateNextRunTime", "()J", "component1", "()Ljava/lang/String;", "component10", "()Landroidx/work/Constraints;", "component11", "()I", "component12", "()Landroidx/work/BackoffPolicy;", "component13", "component14", "component15", "component16", "component17", "()Z", "component18", "()Landroidx/work/OutOfQuotaPolicy;", "component19", "component2", "()Landroidx/work/WorkInfo$State;", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "()Landroidx/work/Data;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "equals", "(Ljava/lang/Object;)Z", "hasConstraints", "hashCode", "", "setBackoffDelayDuration", "(J)V", "setPeriodic", "(JJ)V", "toString", "backoffDelayDuration", "J", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "constraints", "Landroidx/work/Constraints;", "expedited", "Z", "flexDuration", "generation", "I", "getGeneration", "id", "Ljava/lang/String;", "initialDelay", "input", "Landroidx/work/Data;", "inputMergerClassName", "intervalDuration", "isBackedOff", "isPeriodic", "lastEnqueueTime", "minimumRetentionDuration", "nextScheduleTimeOverride", "getNextScheduleTimeOverride", "setNextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "(I)V", "outOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "output", "periodCount", "getPeriodCount", "setPeriodCount", "runAttemptCount", "scheduleRequestedAt", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/WorkInfo$State;", "stopReason", "getStopReason", "traceTag", "getTraceTag", "setTraceTag", "(Ljava/lang/String;)V", "workerClassName", "Companion", "IdAndState", "WorkInfoPojo"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WorkSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    private long nextScheduleTimeOverride;
    private int nextScheduleTimeOverrideGeneration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    private final int stopReason;
    private String traceTag;
    public String workerClassName;

    public WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(data2, "");
        Intrinsics.checkNotNullParameter(constraints, "");
        Intrinsics.checkNotNullParameter(backoffPolicy, "");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "");
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i2;
        this.generation = i3;
        this.nextScheduleTimeOverride = j8;
        this.nextScheduleTimeOverrideGeneration = i4;
        this.stopReason = i5;
        this.traceTag = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        WorkInfo.State state2 = (i6 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        if ((i6 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, state2, str2, str5, (i6 & 16) != 0 ? Data.EMPTY : data, (i6 & 32) != 0 ? Data.EMPTY : data2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? Constraints.NONE : constraints, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i6 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (i6 & 8388608) != 0 ? null : str4);
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final void setNextScheduleTimeOverride(long j) {
        this.nextScheduleTimeOverride = j;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final String getTraceTag() {
        return this.traceTag;
    }

    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, WorkSpec workSpec) {
        this(str, workSpec.state, workSpec.workerClassName, workSpec.inputMergerClassName, new Data(workSpec.input), new Data(workSpec.output), workSpec.initialDelay, workSpec.intervalDuration, workSpec.flexDuration, new Constraints(workSpec.constraints), workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, workSpec.nextScheduleTimeOverride, workSpec.nextScheduleTimeOverrideGeneration, workSpec.stopReason, workSpec.traceTag, 524288, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(workSpec, "");
    }

    public final void setBackoffDelayDuration(long p0) {
        if (p0 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (p0 < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.coerceIn(p0, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final void setPeriodic(long p0) {
        if (p0 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(RangesKt.coerceAtLeast(p0, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), RangesKt.coerceAtLeast(p0, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long p0, long p1) {
        if (p0 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.coerceAtLeast(p0, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (p1 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (p1 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to ".concat(String.valueOf(p0)));
        }
        this.flexDuration = RangesKt.coerceIn(p1, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public final long calculateNextRunTime() {
        return INSTANCE.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.id);
        sb.append('}');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "", "p0", "Landroidx/work/WorkInfo$State;", "p1", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/work/WorkInfo$State;", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/WorkInfo$State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IdAndState {
        public String id;
        public WorkInfo.State state;

        public IdAndState(String str, WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(state, "");
            this.id = str;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        public final IdAndState copy(String p0, WorkInfo.State p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return new IdAndState(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) p0;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IdAndState(id=");
            sb.append(this.id);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018HÇ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÇ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010\u001eJ\u0010\u00102\u001a\u00020\fHÇ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\u0010HÇ\u0003¢\u0006\u0004\b5\u00106JÆ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÇ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u0002092\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b?\u0010$J\u0010\u0010@\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b@\u0010 J\u000f\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bB\u0010CR\"\u0010D\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u00106\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u00103R\u001a\u0010Q\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010\u001eR\u001a\u0010S\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010$R\u001a\u0010V\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010 R\u001a\u0010Y\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010\u001eR\u001a\u0010[\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010\u001eR\u0011\u0010]\u001a\u0002098G¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010_\u001a\u0002098G¢\u0006\u0006\u001a\u0004\b_\u0010^R\"\u0010`\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010E\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010HR\u001a\u0010c\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010E\u001a\u0004\bd\u0010\u001eR\u001a\u0010e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010.R\"\u0010h\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010T\u001a\u0004\bi\u0010$\"\u0004\bj\u0010kR \u0010l\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010)R\u001a\u0010o\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010T\u001a\u0004\bp\u0010$R\u001a\u0010q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010,R\u001a\u0010t\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010T\u001a\u0004\bu\u0010$R \u0010v\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010m\u001a\u0004\bw\u0010)"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "", "p0", "Landroidx/work/WorkInfo$State;", "p1", "Landroidx/work/Data;", "p2", "", "p3", "p4", "p5", "Landroidx/work/Constraints;", "p6", "", "p7", "Landroidx/work/BackoffPolicy;", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "", "p15", "p16", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "calculateNextRunTimeMillis", "()J", "component1", "()Ljava/lang/String;", "component10", "component11", "component12", "()I", "component13", "component14", "component15", "component16", "()Ljava/util/List;", "component17", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "()Landroidx/work/Data;", "component4", "component5", "component6", "component7", "()Landroidx/work/Constraints;", "component8", "component9", "()Landroidx/work/BackoffPolicy;", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/work/WorkInfo$PeriodicityInfo;", "getPeriodicityOrNull", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "hashCode", "toString", "Landroidx/work/WorkInfo;", "toWorkInfo", "()Landroidx/work/WorkInfo;", "backoffDelayDuration", "J", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "getBackoffPolicy", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", "constraints", "Landroidx/work/Constraints;", "getConstraints", "flexDuration", "getFlexDuration", "generation", "I", "getGeneration", "id", "Ljava/lang/String;", "getId", "initialDelay", "getInitialDelay", "intervalDuration", "getIntervalDuration", "isBackedOff", "()Z", "isPeriodic", "lastEnqueueTime", "getLastEnqueueTime", "setLastEnqueueTime", "nextScheduleTimeOverride", "getNextScheduleTimeOverride", "output", "Landroidx/work/Data;", "getOutput", "periodCount", "getPeriodCount", "setPeriodCount", "(I)V", "progress", "Ljava/util/List;", "getProgress", "runAttemptCount", "getRunAttemptCount", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/WorkInfo$State;", "getState", "stopReason", "getStopReason", "tags", "getTags"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WorkInfoPojo {
        private long backoffDelayDuration;
        private BackoffPolicy backoffPolicy;
        private final Constraints constraints;
        private final long flexDuration;
        private final int generation;
        private final String id;
        private final long initialDelay;
        private final long intervalDuration;
        private long lastEnqueueTime;
        private final long nextScheduleTimeOverride;
        private final Data output;
        private int periodCount;
        private final List<Data> progress;
        private final int runAttemptCount;
        private final WorkInfo.State state;
        private final int stopReason;
        private final List<String> tags;

        public WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List<String> list, List<Data> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(data, "");
            Intrinsics.checkNotNullParameter(constraints, "");
            Intrinsics.checkNotNullParameter(backoffPolicy, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.id = str;
            this.state = state;
            this.output = data;
            this.initialDelay = j;
            this.intervalDuration = j2;
            this.flexDuration = j3;
            this.constraints = constraints;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j4;
            this.lastEnqueueTime = j5;
            this.periodCount = i2;
            this.generation = i3;
            this.nextScheduleTimeOverride = j6;
            this.stopReason = i4;
            this.tags = list;
            this.progress = list2;
        }

        public final String getId() {
            return this.id;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, state, data, (i5 & 8) != 0 ? 0L : j, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? 0L : j3, constraints, i, (i5 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 512) != 0 ? 30000L : j4, (i5 & 1024) != 0 ? 0L : j5, (i5 & 2048) != 0 ? 0 : i2, i3, j6, i4, list, list2);
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "");
            this.backoffPolicy = backoffPolicy;
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final void setBackoffDelayDuration(long j) {
            this.backoffDelayDuration = j;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final void setLastEnqueueTime(long j) {
            this.lastEnqueueTime = j;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final void setPeriodCount(int i) {
            this.periodCount = i;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final WorkInfo toWorkInfo() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY;
            UUID uuidFromString = UUID.fromString(this.id);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j = this.intervalDuration;
            if (j != 0) {
                return new WorkInfo.PeriodicityInfo(j, this.flexDuration);
            }
            return null;
        }

        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.INSTANCE.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getPeriodCount() {
            return this.periodCount;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Data getOutput() {
            return this.output;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getInitialDelay() {
            return this.initialDelay;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getFlexDuration() {
            return this.flexDuration;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String p0, WorkInfo.State p1, Data p2, long p3, long p4, long p5, Constraints p6, int p7, BackoffPolicy p8, long p9, long p10, int p11, int p12, long p13, int p14, List<String> p15, List<Data> p16) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p6, "");
            Intrinsics.checkNotNullParameter(p8, "");
            Intrinsics.checkNotNullParameter(p15, "");
            Intrinsics.checkNotNullParameter(p16, "");
            return new WorkInfoPojo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) p0;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && Intrinsics.areEqual(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
            sb.append(this.id);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", output=");
            sb.append(this.output);
            sb.append(", initialDelay=");
            sb.append(this.initialDelay);
            sb.append(", intervalDuration=");
            sb.append(this.intervalDuration);
            sb.append(", flexDuration=");
            sb.append(this.flexDuration);
            sb.append(", constraints=");
            sb.append(this.constraints);
            sb.append(", runAttemptCount=");
            sb.append(this.runAttemptCount);
            sb.append(", backoffPolicy=");
            sb.append(this.backoffPolicy);
            sb.append(", backoffDelayDuration=");
            sb.append(this.backoffDelayDuration);
            sb.append(", lastEnqueueTime=");
            sb.append(this.lastEnqueueTime);
            sb.append(", periodCount=");
            sb.append(this.periodCount);
            sb.append(", generation=");
            sb.append(this.generation);
            sb.append(", nextScheduleTimeOverride=");
            sb.append(this.nextScheduleTimeOverride);
            sb.append(", stopReason=");
            sb.append(this.stopReason);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "Landroidx/work/BackoffPolicy;", "p2", "", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "calculateNextRunTime", "(ZILandroidx/work/BackoffPolicy;JJIZJJJJ)J", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long calculateNextRunTime(boolean p0, int p1, BackoffPolicy p2, long p3, long p4, int p5, boolean p6, long p7, long p8, long p9, long p10) {
            Intrinsics.checkNotNullParameter(p2, "");
            if (p10 != Long.MAX_VALUE && p6) {
                return p5 == 0 ? p10 : RangesKt.coerceAtLeast(p10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + p4);
            }
            if (p0) {
                return RangesKt.coerceAtMost(p2 == BackoffPolicy.LINEAR ? ((long) p1) * p3 : (long) Math.scalb(p3, p1 - 1), WorkRequest.MAX_BACKOFF_MILLIS) + p4;
            }
            if (p6) {
                long j = p5 == 0 ? p4 + p7 : p4 + p9;
                return (p8 == p9 || p5 != 0) ? j : j + (p9 - p8);
            }
            if (p4 == -1) {
                return Long.MAX_VALUE;
            }
            return p4 + p7;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.WorkSpec$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, int i6, Object obj) {
        String str5 = (i6 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state2 = (i6 & 2) != 0 ? workSpec.state : state;
        String str6 = (i6 & 4) != 0 ? workSpec.workerClassName : str2;
        String str7 = (i6 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data3 = (i6 & 16) != 0 ? workSpec.input : data;
        Data data4 = (i6 & 32) != 0 ? workSpec.output : data2;
        long j9 = (i6 & 64) != 0 ? workSpec.initialDelay : j;
        long j10 = (i6 & 128) != 0 ? workSpec.intervalDuration : j2;
        long j11 = (i6 & 256) != 0 ? workSpec.flexDuration : j3;
        Constraints constraints2 = (i6 & 512) != 0 ? workSpec.constraints : constraints;
        return workSpec.copy(str5, state2, str6, str7, data3, data4, j9, j10, j11, constraints2, (i6 & 1024) != 0 ? workSpec.runAttemptCount : i, (i6 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy, (i6 & 4096) != 0 ? workSpec.backoffDelayDuration : j4, (i6 & 8192) != 0 ? workSpec.lastEnqueueTime : j5, (i6 & 16384) != 0 ? workSpec.minimumRetentionDuration : j6, (i6 & 32768) != 0 ? workSpec.scheduleRequestedAt : j7, (i6 & 65536) != 0 ? workSpec.expedited : z, (131072 & i6) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy, (i6 & 262144) != 0 ? workSpec.periodCount : i2, (i6 & 524288) != 0 ? workSpec.generation : i3, (i6 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j8, (i6 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i4, (4194304 & i6) != 0 ? workSpec.stopReason : i5, (i6 & 8388608) != 0 ? workSpec.traceTag : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Constraints getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkInfo.State getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Data getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Data getOutput() {
        return this.output;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String p0, WorkInfo.State p1, String p2, String p3, Data p4, Data p5, long p6, long p7, long p8, Constraints p9, int p10, BackoffPolicy p11, long p12, long p13, long p14, long p15, boolean p16, OutOfQuotaPolicy p17, int p18, int p19, long p20, int p21, int p22, String p23) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p17, "");
        return new WorkSpec(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) p0;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && Intrinsics.areEqual(this.traceTag, workSpec.traceTag);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.state.hashCode();
        int iHashCode3 = this.workerClassName.hashCode();
        int iHashCode4 = this.inputMergerClassName.hashCode();
        int iHashCode5 = this.input.hashCode();
        int iHashCode6 = this.output.hashCode();
        int iHashCode7 = Long.hashCode(this.initialDelay);
        int iHashCode8 = Long.hashCode(this.intervalDuration);
        int iHashCode9 = Long.hashCode(this.flexDuration);
        int iHashCode10 = this.constraints.hashCode();
        int iHashCode11 = Integer.hashCode(this.runAttemptCount);
        int iHashCode12 = this.backoffPolicy.hashCode();
        int iHashCode13 = Long.hashCode(this.backoffDelayDuration);
        int iHashCode14 = Long.hashCode(this.lastEnqueueTime);
        int iHashCode15 = Long.hashCode(this.minimumRetentionDuration);
        int iHashCode16 = Long.hashCode(this.scheduleRequestedAt);
        int iHashCode17 = Boolean.hashCode(this.expedited);
        int iHashCode18 = this.outOfQuotaPolicy.hashCode();
        int iHashCode19 = Integer.hashCode(this.periodCount);
        int iHashCode20 = Integer.hashCode(this.generation);
        int iHashCode21 = Long.hashCode(this.nextScheduleTimeOverride);
        int iHashCode22 = Integer.hashCode(this.nextScheduleTimeOverrideGeneration);
        int iHashCode23 = Integer.hashCode(this.stopReason);
        String str = this.traceTag;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str == null ? 0 : str.hashCode());
    }
}
