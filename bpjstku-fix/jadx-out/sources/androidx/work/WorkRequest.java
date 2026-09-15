package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0014\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "p0", "Landroidx/work/impl/model/WorkSpec;", "p1", "", "", "p2", "<init>", "(Ljava/util/UUID;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)V", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "getStringId", "()Ljava/lang/String;", "stringId", "tags", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    private static final int MAX_TRACE_SPAN_LENGTH = 127;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    public WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(workSpec, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.id = uuid;
        this.workSpec = workSpec;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final String getStringId() {
        String string = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0001H!¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0011\u0010\u0016J\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0010H\u0017¢\u0006\u0004\b%\u0010\u0012J\u001f\u0010%\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b/\u0010\u0016J\u001f\u00100\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b0\u0010\u0016J\u0017\u00101\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b1\u0010\fR\"\u00103\u001a\u0002028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020\n0?8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00028\u00008!X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\"\u0010H\u001a\u00020G8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", ExifInterface.LONGITUDE_WEST, "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "Ljava/time/Duration;", "keepResultsForAtLeast", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/BackoffPolicy;", "setBackoffCriteria", "(Landroidx/work/BackoffPolicy;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "p2", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Constraints;", "setConstraints", "(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OutOfQuotaPolicy;", "setExpedited", "(Landroidx/work/OutOfQuotaPolicy;)Landroidx/work/WorkRequest$Builder;", "Ljava/util/UUID;", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/WorkInfo$State;", "setInitialState", "(Landroidx/work/WorkInfo$State;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Data;", "setInputData", "(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;", "setLastEnqueueTime", "setScheduleRequestedAt", "setTraceTag", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "id", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "thisObject", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec$work_runtime_release", "()Landroidx/work/impl/model/WorkSpec;", "setWorkSpec$work_runtime_release", "(Landroidx/work/impl/model/WorkSpec;)V", "workerClass", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public abstract W buildInternal$work_runtime_release();

        public abstract B getThisObject$work_runtime_release();

        public Builder(Class<? extends ListenableWorker> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            this.workerClass = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "");
            this.id = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            this.workSpec = new WorkSpec(string, name);
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            this.tags = SetsKt.mutableSetOf(name2);
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        /* JADX INFO: renamed from: getBackoffCriteriaSet$work_runtime_release, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        /* JADX INFO: renamed from: getId$work_runtime_release, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final void setId$work_runtime_release(UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "");
            this.id = uuid;
        }

        /* JADX INFO: renamed from: getWorkSpec$work_runtime_release, reason: from getter */
        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final void setWorkSpec$work_runtime_release(WorkSpec workSpec) {
            Intrinsics.checkNotNullParameter(workSpec, "");
            this.workSpec = workSpec;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public final B setId(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.id = p0;
            String string = p0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.workSpec = new WorkSpec(string, this.workSpec);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy p0, long p1, TimeUnit p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = p0;
            this.workSpec.setBackoffDelayDuration(p2.toMillis(p1));
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy p0, Duration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = p0;
            this.workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(p1));
            return (B) getThisObject$work_runtime_release();
        }

        public final B setConstraints(Constraints p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.constraints = p0;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInputData(Data p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.input = p0;
            return (B) getThisObject$work_runtime_release();
        }

        public final B addTag(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.tags.add(p0);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setTraceTag(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.setTraceTag(p0);
            return (B) getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.workSpec.minimumRetentionDuration = p1.toMillis(p0);
            return (B) getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(Duration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(p0);
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.workSpec.initialDelay = p1.toMillis(p0);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(p0);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return (B) getThisObject$work_runtime_release();
        }

        public B setExpedited(OutOfQuotaPolicy p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.expedited = true;
            this.workSpec.outOfQuotaPolicy = p0;
            return (B) getThisObject$work_runtime_release();
        }

        public final W build() {
            W w = (W) buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            boolean z = constraints.hasContentUriTriggers() || constraints.getRequiresBatteryNotLow() || constraints.getRequiresCharging() || constraints.getRequiresDeviceIdle();
            if (this.workSpec.expedited) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (this.workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            if (this.workSpec.getTraceTag() == null) {
                this.workSpec.setTraceTag(WorkRequest.INSTANCE.deriveTraceTagFromClassName(this.workSpec.workerClassName));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "");
            setId(uuidRandomUUID);
            return w;
        }

        public final B setInitialState(WorkInfo.State p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workSpec.state = p0;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInitialRunAttemptCount(int p0) {
            this.workSpec.runAttemptCount = p0;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.workSpec.lastEnqueueTime = p1.toMillis(p0);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.workSpec.scheduleRequestedAt = p1.toMillis(p0);
            return (B) getThisObject$work_runtime_release();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\n"}, d2 = {"Landroidx/work/WorkRequest$Companion;", "", "<init>", "()V", "", "p0", "deriveTraceTagFromClassName", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String deriveTraceTagFromClassName(String p0) {
            String str;
            List listSplit$default = StringsKt.split$default((CharSequence) p0, new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 1) {
                str = (String) listSplit$default.get(0);
            } else {
                str = (String) CollectionsKt.last(listSplit$default);
            }
            return str.length() <= 127 ? str : StringsKt.take(str, 127);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
