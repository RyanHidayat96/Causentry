package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/background/systemjob/JobScheduler34;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "forNamespace", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class JobScheduler34 {
    public static final JobScheduler34 INSTANCE = new JobScheduler34();

    private JobScheduler34() {
    }

    public final JobScheduler forNamespace(JobScheduler p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        JobScheduler jobSchedulerForNamespace = p0.forNamespace(JobSchedulerExtKt.WORKMANAGER_NAMESPACE);
        Intrinsics.checkNotNullExpressionValue(jobSchedulerForNamespace, "");
        return jobSchedulerForNamespace;
    }
}
