package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/WorkLauncherImpl;", "Landroidx/work/impl/WorkLauncher;", "Landroidx/work/impl/Processor;", "p0", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "p1", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/StartStopToken;", "Landroidx/work/WorkerParameters$RuntimeExtras;", "", "startWork", "(Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V", "", "stopWork", "(Landroidx/work/impl/StartStopToken;I)V", "processor", "Landroidx/work/impl/Processor;", "getProcessor", "()Landroidx/work/impl/Processor;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkLauncherImpl implements WorkLauncher {
    private final Processor processor;
    private final TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(Processor processor, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        this.processor = processor;
        this.workTaskExecutor = taskExecutor;
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        workLauncherImpl.processor.startWork(startStopToken, runtimeExtras);
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void startWork(final StartStopToken p0, final WorkerParameters.RuntimeExtras p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.WorkLauncherImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WorkLauncherImpl.startWork$lambda$0(this.f$0, p0, p1);
            }
        });
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void stopWork(StartStopToken p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.workTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this.processor, p0, false, p1));
    }
}
