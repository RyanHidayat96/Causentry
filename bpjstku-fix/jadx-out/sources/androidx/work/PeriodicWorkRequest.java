package androidx.work;

import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "Landroidx/work/WorkRequest;", "Landroidx/work/PeriodicWorkRequest$Builder;", "p0", "<init>", "(Landroidx/work/PeriodicWorkRequest$Builder;)V", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PeriodicWorkRequest extends WorkRequest {
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "");
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fB!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010B;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0013B9\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0014B+\b\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0015B)\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00008QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/PeriodicWorkRequest;", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "p0", "", "p1", "Ljava/util/concurrent/TimeUnit;", "p2", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;)V", "p3", "p4", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;Ljava/time/Duration;)V", "buildInternal$work_runtime_release", "()Landroidx/work/PeriodicWorkRequest;", "clearNextScheduleTimeOverride", "()Landroidx/work/PeriodicWorkRequest$Builder;", "setNextScheduleTimeOverride", "(J)Landroidx/work/PeriodicWorkRequest$Builder;", "getThisObject$work_runtime_release", "thisObject"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public final Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(KClass<? extends ListenableWorker> kClass, long j, TimeUnit timeUnit) {
            super(JvmClassMappingKt.getJavaClass((KClass) kClass));
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, Duration duration) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(duration, "");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(KClass<? extends ListenableWorker> kClass, Duration duration) {
            super(JvmClassMappingKt.getJavaClass((KClass) kClass));
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(duration, "");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            Intrinsics.checkNotNullParameter(timeUnit2, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(KClass<? extends ListenableWorker> kClass, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(JvmClassMappingKt.getJavaClass((KClass) kClass));
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            Intrinsics.checkNotNullParameter(timeUnit2, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, Duration duration, Duration duration2) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(duration, "");
            Intrinsics.checkNotNullParameter(duration2, "");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(duration), DurationApi26Impl.toMillisCompat(duration2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(KClass<? extends ListenableWorker> kClass, Duration duration, Duration duration2) {
            super(JvmClassMappingKt.getJavaClass((KClass) kClass));
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(duration, "");
            Intrinsics.checkNotNullParameter(duration2, "");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(duration), DurationApi26Impl.toMillisCompat(duration2));
        }

        public final Builder setNextScheduleTimeOverride(long p0) {
            if (p0 == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time".toString());
            }
            getWorkSpec().setNextScheduleTimeOverride(p0);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        public final Builder clearNextScheduleTimeOverride() {
            getWorkSpec().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public final PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (getWorkSpec().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            return new PeriodicWorkRequest(this);
        }
    }
}
