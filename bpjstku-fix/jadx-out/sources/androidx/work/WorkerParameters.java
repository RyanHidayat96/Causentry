package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class WorkerParameters {
    private Executor mBackgroundExecutor;
    private ForegroundUpdater mForegroundUpdater;
    private int mGeneration;
    private UUID mId;
    private Data mInputData;
    private ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;
    private RuntimeExtras mRuntimeExtras;
    private Set<String> mTags;
    private TaskExecutor mWorkTaskExecutor;
    private CoroutineContext mWorkerContext;
    private WorkerFactory mWorkerFactory;

    /* JADX INFO: loaded from: classes6.dex */
    public static class RuntimeExtras {
        public Network network;
        public List<String> triggeredContentAuthorities = Collections.emptyList();
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, Data data, Collection<String> collection, RuntimeExtras runtimeExtras, int i, int i2, Executor executor, CoroutineContext coroutineContext, TaskExecutor taskExecutor, WorkerFactory workerFactory, ProgressUpdater progressUpdater, ForegroundUpdater foregroundUpdater) {
        this.mId = uuid;
        this.mInputData = data;
        this.mTags = new HashSet(collection);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = i;
        this.mGeneration = i2;
        this.mBackgroundExecutor = executor;
        this.mWorkerContext = coroutineContext;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkerFactory = workerFactory;
        this.mProgressUpdater = progressUpdater;
        this.mForegroundUpdater = foregroundUpdater;
    }

    public final UUID getId() {
        return this.mId;
    }

    public final Data getInputData() {
        return this.mInputData;
    }

    public final Set<String> getTags() {
        return this.mTags;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mRuntimeExtras.triggeredContentUris;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mRuntimeExtras.triggeredContentAuthorities;
    }

    public final Network getNetwork() {
        return this.mRuntimeExtras.network;
    }

    public final int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    public final int getGeneration() {
        return this.mGeneration;
    }

    public final Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    public final CoroutineContext getWorkerContext() {
        return this.mWorkerContext;
    }

    public final TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public final ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    public final ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    public final RuntimeExtras getRuntimeExtras() {
        return this.mRuntimeExtras;
    }
}
