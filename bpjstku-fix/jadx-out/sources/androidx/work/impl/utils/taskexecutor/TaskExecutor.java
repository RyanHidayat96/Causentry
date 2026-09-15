package androidx.work.impl.utils.taskexecutor;

import defpackage.MimeInfo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public interface TaskExecutor {
    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    default void executeOnTaskThread(Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    default CoroutineDispatcher getTaskCoroutineDispatcher() {
        return MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getSerialTaskExecutor());
    }
}
