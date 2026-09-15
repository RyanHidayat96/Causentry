package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u001d\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroid/content/Context;", "p0", "Landroidx/work/impl/WorkDatabase;", "p1", "Landroidx/work/Configuration;", "p2", "", "createErrorMessage", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "WORKMANAGER_NAMESPACE", "Landroid/app/job/JobScheduler;", "", "Landroid/app/job/JobInfo;", "getSafePendingJobs", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "getWmJobScheduler", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JobSchedulerExtKt {
    private static final String TAG;
    public static final String WORKMANAGER_NAMESPACE = "androidx.work.systemjobscheduler";

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "");
        TAG = strTagWithPrefix;
    }

    public static final JobScheduler getWmJobScheduler(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? JobScheduler34.INSTANCE.forNamespace(jobScheduler) : jobScheduler;
    }

    public static final List<JobInfo> getSafePendingJobs(JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "");
        try {
            return JobScheduler21.INSTANCE.getAllPendingJobs(jobScheduler);
        } catch (Throwable th) {
            Logger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    public static final String createErrorMessage(Context context, WorkDatabase workDatabase, Configuration configuration) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        int i = Build.VERSION.SDK_INT >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        if (Build.VERSION.SDK_INT >= 34) {
            JobScheduler wmJobScheduler = getWmJobScheduler(context);
            List<JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                List<JobInfo> pendingJobs = SystemJobScheduler.getPendingJobs(context, wmJobScheduler);
                int size2 = pendingJobs != null ? safePendingJobs.size() - pendingJobs.size() : 0;
                String string3 = null;
                if (size2 == 0) {
                    string2 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(size2);
                    sb.append(" of which are not owned by WorkManager");
                    string2 = sb.toString();
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.checkNotNull(systemService, "");
                List<JobInfo> pendingJobs2 = SystemJobScheduler.getPendingJobs(context, (JobScheduler) systemService);
                int size3 = pendingJobs2 != null ? pendingJobs2.size() : 0;
                if (size3 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size3);
                    sb2.append(" from WorkManager in the default namespace");
                    string3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(safePendingJobs.size());
                sb3.append(" jobs in \"androidx.work.systemjobscheduler\" namespace");
                string = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{sb3.toString(), string2, string3}), ",\n", null, null, 0, null, null, 62, null);
            } else {
                string = "<faulty JobScheduler failed to getPendingJobs>";
            }
        } else {
            List<JobInfo> pendingJobs3 = SystemJobScheduler.getPendingJobs(context, getWmJobScheduler(context));
            if (pendingJobs3 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(pendingJobs3.size());
                sb4.append(" jobs from WorkManager");
                string = sb4.toString();
            } else {
                string = "<faulty JobScheduler failed to getPendingJobs>";
            }
        }
        StringBuilder sb5 = new StringBuilder("JobScheduler ");
        sb5.append(i);
        sb5.append(" job limit exceeded.\nIn JobScheduler there are ");
        sb5.append(string);
        sb5.append(".\nThere are ");
        sb5.append(size);
        sb5.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        sb5.append(configuration.getMaxSchedulerLimit());
        sb5.append('.');
        return sb5.toString();
    }
}
