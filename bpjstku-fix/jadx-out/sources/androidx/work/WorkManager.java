package androidx.work;

import android.app.PendingIntent;
import android.content.Context;
import androidx.p002lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 P2\u00020\u0001:\u0002PQB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\rH'¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\rH'¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH'¢\u0006\u0004\b\u001f\u0010!J'\u0010$\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020#H'¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b&\u0010'J-\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\rH'¢\u0006\u0004\b&\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H'¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-H'¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000)2\u0006\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000100032\u0006\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000-2\u0006\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b6\u00107J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0)2\u0006\u0010\u0005\u001a\u000208H'¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0)2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r032\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0-2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r032\u0006\u0010\u0005\u001a\u000208H'¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0)2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\bC\u0010<J#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r032\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\bD\u0010>J#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0-2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\bE\u0010@J#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0-2\u0006\u0010\u0005\u001a\u000208H'¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0012H'¢\u0006\u0004\bH\u0010\u0014J\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0)2\u0006\u0010\u0005\u001a\u00020\u001eH'¢\u0006\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8'X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N"}, d2 = {"Landroidx/work/WorkManager;", "", "<init>", "()V", "", "p0", "Landroidx/work/ExistingWorkPolicy;", "p1", "Landroidx/work/OneTimeWorkRequest;", "p2", "Landroidx/work/WorkContinuation;", "beginUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/WorkContinuation;", "", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/WorkContinuation;", "beginWith", "(Landroidx/work/OneTimeWorkRequest;)Landroidx/work/WorkContinuation;", "(Ljava/util/List;)Landroidx/work/WorkContinuation;", "Landroidx/work/Operation;", "cancelAllWork", "()Landroidx/work/Operation;", "cancelAllWorkByTag", "(Ljava/lang/String;)Landroidx/work/Operation;", "cancelUniqueWork", "Ljava/util/UUID;", "cancelWorkById", "(Ljava/util/UUID;)Landroidx/work/Operation;", "Landroid/app/PendingIntent;", "createCancelPendingIntent", "(Ljava/util/UUID;)Landroid/app/PendingIntent;", "Landroidx/work/WorkRequest;", "enqueue", "(Landroidx/work/WorkRequest;)Landroidx/work/Operation;", "(Ljava/util/List;)Landroidx/work/Operation;", "Landroidx/work/ExistingPeriodicWorkPolicy;", "Landroidx/work/PeriodicWorkRequest;", "enqueueUniquePeriodicWork", "(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/PeriodicWorkRequest;)Landroidx/work/Operation;", "enqueueUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/Operation;", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "getLastCancelAllTimeMillis", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/lifecycle/LiveData;", "getLastCancelAllTimeMillisLiveData", "()Landroidx/lifecycle/LiveData;", "Landroidx/work/WorkInfo;", "getWorkInfoById", "(Ljava/util/UUID;)Lcom/google/common/util/concurrent/ListenableFuture;", "LclampVideoBitrateIfNotSupported;", "getWorkInfoByIdFlow", "(Ljava/util/UUID;)LclampVideoBitrateIfNotSupported;", "getWorkInfoByIdLiveData", "(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;", "Landroidx/work/WorkQuery;", "getWorkInfos", "(Landroidx/work/WorkQuery;)Lcom/google/common/util/concurrent/ListenableFuture;", "getWorkInfosByTag", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;", "getWorkInfosByTagFlow", "(Ljava/lang/String;)LclampVideoBitrateIfNotSupported;", "getWorkInfosByTagLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getWorkInfosFlow", "(Landroidx/work/WorkQuery;)LclampVideoBitrateIfNotSupported;", "getWorkInfosForUniqueWork", "getWorkInfosForUniqueWorkFlow", "getWorkInfosForUniqueWorkLiveData", "getWorkInfosLiveData", "(Landroidx/work/WorkQuery;)Landroidx/lifecycle/LiveData;", "pruneWork", "Landroidx/work/WorkManager$UpdateResult;", "updateWork", "(Landroidx/work/WorkRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "configuration", "Companion", "UpdateResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public abstract WorkContinuation beginUniqueWork(String p0, ExistingWorkPolicy p1, List<OneTimeWorkRequest> p2);

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> p0);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String p0);

    public abstract Operation cancelUniqueWork(String p0);

    public abstract Operation cancelWorkById(UUID p0);

    public abstract PendingIntent createCancelPendingIntent(UUID p0);

    public abstract Operation enqueue(List<? extends WorkRequest> p0);

    public abstract Operation enqueueUniquePeriodicWork(String p0, ExistingPeriodicWorkPolicy p1, PeriodicWorkRequest p2);

    public abstract Operation enqueueUniqueWork(String p0, ExistingWorkPolicy p1, List<OneTimeWorkRequest> p2);

    public abstract Configuration getConfiguration();

    public abstract ListenableFuture<Long> getLastCancelAllTimeMillis();

    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    public abstract ListenableFuture<WorkInfo> getWorkInfoById(UUID p0);

    public abstract clampVideoBitrateIfNotSupported<WorkInfo> getWorkInfoByIdFlow(UUID p0);

    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID p0);

    public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(WorkQuery p0);

    public abstract ListenableFuture<List<WorkInfo>> getWorkInfosByTag(String p0);

    public abstract clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkInfosByTagFlow(String p0);

    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String p0);

    public abstract clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkInfosFlow(WorkQuery p0);

    public abstract ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(String p0);

    public abstract clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(String p0);

    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String p0);

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery p0);

    public abstract Operation pruneWork();

    public abstract ListenableFuture<UpdateResult> updateWork(WorkRequest p0);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/WorkManager$Companion;", "", "<init>", "()V", "Landroidx/work/WorkManager;", "getInstance", "()Landroidx/work/WorkManager;", "Landroid/content/Context;", "p0", "(Landroid/content/Context;)Landroidx/work/WorkManager;", "Landroidx/work/Configuration;", "p1", "", "initialize", "(Landroid/content/Context;Landroidx/work/Configuration;)V", "", "isInitialized", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
        @JvmStatic
        public final WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.".toString());
        }

        @JvmStatic
        public final WorkManager getInstance(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(p0);
            Intrinsics.checkNotNullExpressionValue(workManagerImpl, "");
            return workManagerImpl;
        }

        @JvmStatic
        public final void initialize(Context p0, Configuration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            WorkManagerImpl.initialize(p0, p1);
        }

        @JvmStatic
        public final boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Operation enqueue(WorkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return enqueue(CollectionsKt.listOf(p0));
    }

    public final WorkContinuation beginWith(OneTimeWorkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return beginWith(CollectionsKt.listOf(p0));
    }

    public final WorkContinuation beginUniqueWork(String p0, ExistingWorkPolicy p1, OneTimeWorkRequest p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return beginUniqueWork(p0, p1, CollectionsKt.listOf(p2));
    }

    public Operation enqueueUniqueWork(String p0, ExistingWorkPolicy p1, OneTimeWorkRequest p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return enqueueUniqueWork(p0, p1, CollectionsKt.listOf(p2));
    }

    @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
    @JvmStatic
    public static WorkManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static WorkManager getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    @JvmStatic
    public static void initialize(Context context, Configuration configuration) {
        INSTANCE.initialize(context, configuration);
    }

    @JvmStatic
    public static boolean isInitialized() {
        return INSTANCE.isInitialized();
    }
}
