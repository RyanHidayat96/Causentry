package androidx.work.impl.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u000b\u001a/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "p0", "", "", "p1", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/WorkInfo;", "forStringIds", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;", "forTag", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/util/UUID;", "forUUID", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/util/UUID;)Lcom/google/common/util/concurrent/ListenableFuture;", "forUniqueWork", "Landroidx/work/WorkQuery;", "forWorkQuerySpec", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/WorkQuery;)Lcom/google/common/util/concurrent/ListenableFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "loadStatusFuture", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Lkotlin/jvm/functions/Function1;)Lcom/google/common/util/concurrent/ListenableFuture;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StatusRunnable {
    public static final ListenableFuture<List<WorkInfo>> forStringIds(WorkDatabase workDatabase, TaskExecutor taskExecutor, final List<String> list) {
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        Intrinsics.checkNotNullParameter(list, "");
        return loadStatusFuture(workDatabase, taskExecutor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forStringIds.1
            @Override // kotlin.jvm.functions.Function1
            public final List<WorkInfo> invoke(WorkDatabase workDatabase2) {
                Intrinsics.checkNotNullParameter(workDatabase2, "");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase2.workSpecDao().getWorkStatusPojoForIds(list));
                Intrinsics.checkNotNullExpressionValue(listApply, "");
                return listApply;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final ListenableFuture<WorkInfo> forUUID(WorkDatabase workDatabase, TaskExecutor taskExecutor, final UUID uuid) {
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        return loadStatusFuture(workDatabase, taskExecutor, new Function1<WorkDatabase, WorkInfo>() { // from class: androidx.work.impl.utils.StatusRunnable.forUUID.1
            @Override // kotlin.jvm.functions.Function1
            public final WorkInfo invoke(WorkDatabase workDatabase2) {
                Intrinsics.checkNotNullParameter(workDatabase2, "");
                WorkSpecDao workSpecDao = workDatabase2.workSpecDao();
                String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forTag(WorkDatabase workDatabase, TaskExecutor taskExecutor, final String str) {
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        Intrinsics.checkNotNullParameter(str, "");
        return loadStatusFuture(workDatabase, taskExecutor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forTag.1
            @Override // kotlin.jvm.functions.Function1
            public final List<WorkInfo> invoke(WorkDatabase workDatabase2) {
                Intrinsics.checkNotNullParameter(workDatabase2, "");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase2.workSpecDao().getWorkStatusPojoForTag(str));
                Intrinsics.checkNotNullExpressionValue(listApply, "");
                return listApply;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forUniqueWork(WorkDatabase workDatabase, TaskExecutor taskExecutor, final String str) {
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        Intrinsics.checkNotNullParameter(str, "");
        return loadStatusFuture(workDatabase, taskExecutor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forUniqueWork.1
            @Override // kotlin.jvm.functions.Function1
            public final List<WorkInfo> invoke(WorkDatabase workDatabase2) {
                Intrinsics.checkNotNullParameter(workDatabase2, "");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase2.workSpecDao().getWorkStatusPojoForName(str));
                Intrinsics.checkNotNullExpressionValue(listApply, "");
                return listApply;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor taskExecutor, final WorkQuery workQuery) {
        Intrinsics.checkNotNullParameter(workDatabase, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        Intrinsics.checkNotNullParameter(workQuery, "");
        return loadStatusFuture(workDatabase, taskExecutor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec.1
            @Override // kotlin.jvm.functions.Function1
            public final List<WorkInfo> invoke(WorkDatabase workDatabase2) {
                Intrinsics.checkNotNullParameter(workDatabase2, "");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase2.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(workQuery)));
                Intrinsics.checkNotNullExpressionValue(listApply, "");
                return listApply;
            }

            {
                super(1);
            }
        });
    }

    private static final <T> ListenableFuture<T> loadStatusFuture(final WorkDatabase workDatabase, TaskExecutor taskExecutor, final Function1<? super WorkDatabase, ? extends T> function1) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new Function0<T>() { // from class: androidx.work.impl.utils.StatusRunnable.loadStatusFuture.1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return function1.invoke(workDatabase);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }
}
