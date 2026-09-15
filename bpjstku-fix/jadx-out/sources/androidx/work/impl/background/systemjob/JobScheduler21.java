package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/background/systemjob/JobScheduler21;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "", "Landroid/app/job/JobInfo;", "getAllPendingJobs", "(Landroid/app/job/JobScheduler;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class JobScheduler21 {
    public static final JobScheduler21 INSTANCE = new JobScheduler21();

    private JobScheduler21() {
    }

    public final List<JobInfo> getAllPendingJobs(JobScheduler p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<JobInfo> allPendingJobs = p0.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(allPendingJobs, "");
        return allPendingJobs;
    }
}
