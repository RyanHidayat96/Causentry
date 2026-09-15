package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public class Processor implements ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map<String, Set<StartStopToken>> mWorkRuns = new HashMap();

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
    }

    public boolean startWork(StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId id2 = startStopToken.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m7518lambda$startWork$0$androidxworkimplProcessor(arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            Logger.get().warning(TAG, "Didn't find WorkSpec for id ".concat(String.valueOf(id2)));
            runOnExecuted(id2, false);
            return false;
        }
        synchronized (this.mLock) {
            if (isEnqueued(workSpecId)) {
                Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                    set.add(startStopToken);
                    Logger logger = Logger.get();
                    String str = TAG;
                    StringBuilder sb = new StringBuilder("Work ");
                    sb.append(id2);
                    sb.append(" is already enqueued for processing");
                    logger.debug(str, sb.toString());
                } else {
                    runOnExecuted(id2, false);
                }
                return false;
            }
            if (workSpec.getGeneration() != id2.getGeneration()) {
                runOnExecuted(id2, false);
                return false;
            }
            final WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
            final ListenableFuture<Boolean> listenableFutureLaunch = workerWrapperBuild.launch();
            listenableFutureLaunch.addListener(new Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7519lambda$startWork$1$androidxworkimplProcessor(listenableFutureLaunch, workerWrapperBuild);
                }
            }, this.mWorkTaskExecutor.getMainThreadExecutor());
            this.mEnqueuedWorkMap.put(workSpecId, workerWrapperBuild);
            HashSet hashSet = new HashSet();
            hashSet.add(startStopToken);
            this.mWorkRuns.put(workSpecId, hashSet);
            Logger logger2 = Logger.get();
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(": processing ");
            sb2.append(id2);
            logger2.debug(str2, sb2.toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: lambda$startWork$0$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ WorkSpec m7518lambda$startWork$0$androidxworkimplProcessor(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return this.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    /* JADX INFO: renamed from: lambda$startWork$1$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ void m7519lambda$startWork$1$androidxworkimplProcessor(ListenableFuture listenableFuture, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) listenableFuture.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        onExecuted(workerWrapper, zBooleanValue);
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Moving WorkSpec (");
            sb.append(str);
            sb.append(") to the foreground");
            logger.info(str2, sb.toString());
            WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
            if (workerWrapperRemove != null) {
                if (this.mForegroundLock == null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                    this.mForegroundLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
                this.mForegroundWorkMap.put(str, workerWrapperRemove);
                ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, workerWrapperRemove.getWorkGenerationalId(), foregroundInfo));
            }
        }
    }

    public boolean stopForegroundWork(StartStopToken startStopToken, int i) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(workSpecId);
        }
        return interrupt(workSpecId, workerWrapperCleanUpWorkerUnsafe, i);
    }

    public boolean stopWork(StartStopToken startStopToken, int i) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            if (this.mForegroundWorkMap.get(workSpecId) != null) {
                Logger logger = Logger.get();
                String str = TAG;
                StringBuilder sb = new StringBuilder("Ignored stopWork. WorkerWrapper ");
                sb.append(workSpecId);
                sb.append(" is in foreground");
                logger.debug(str, sb.toString());
                return false;
            }
            Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
            if (set != null && set.contains(startStopToken)) {
                return interrupt(workSpecId, cleanUpWorkerUnsafe(workSpecId), i);
            }
            return false;
        }
    }

    public boolean stopAndCancelWork(String str, int i) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        synchronized (this.mLock) {
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Processor cancelling ");
            sb.append(str);
            logger.debug(str2, sb.toString());
            this.mCancelledIds.add(str);
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(str);
        }
        return interrupt(str, workerWrapperCleanUpWorkerUnsafe, i);
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCancelledIds.contains(str);
        }
        return zContains;
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            z = (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) ? false : true;
        }
        return z;
    }

    public boolean isEnqueued(String str) {
        boolean z;
        synchronized (this.mLock) {
            z = getWorkerWrapperUnsafe(str) != null;
        }
        return z;
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    private void onExecuted(WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.mLock) {
            WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
            String workSpecId = workGenerationalId.getWorkSpecId();
            if (getWorkerWrapperUnsafe(workSpecId) == workerWrapper) {
                cleanUpWorkerUnsafe(workSpecId);
            }
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" ");
            sb.append(workSpecId);
            sb.append(" executed; reschedule = ");
            sb.append(z);
            logger.debug(str, sb.toString());
            Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
            while (it.hasNext()) {
                it.next().onExecuted(workGenerationalId, z);
            }
        }
    }

    private WorkerWrapper getWorkerWrapperUnsafe(String str) {
        WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(str);
        return workerWrapper == null ? this.mEnqueuedWorkMap.get(str) : workerWrapper;
    }

    public WorkSpec getRunningWorkSpec(String str) {
        synchronized (this.mLock) {
            WorkerWrapper workerWrapperUnsafe = getWorkerWrapperUnsafe(str);
            if (workerWrapperUnsafe == null) {
                return null;
            }
            return workerWrapperUnsafe.getWorkSpec();
        }
    }

    private void runOnExecuted(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7517lambda$runOnExecuted$2$androidxworkimplProcessor(workGenerationalId, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$runOnExecuted$2$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ void m7517lambda$runOnExecuted$2$androidxworkimplProcessor(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.mLock) {
            Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
            while (it.hasNext()) {
                it.next().onExecuted(workGenerationalId, z);
            }
        }
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            if (this.mForegroundWorkMap.isEmpty()) {
                try {
                    this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                } catch (Throwable th) {
                    Logger.get().error(TAG, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.mForegroundLock;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.mForegroundLock = null;
                }
            }
        }
    }

    private WorkerWrapper cleanUpWorkerUnsafe(String str) {
        WorkerWrapper workerWrapperRemove = this.mForegroundWorkMap.remove(str);
        boolean z = workerWrapperRemove != null;
        if (!z) {
            workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
        }
        this.mWorkRuns.remove(str);
        if (z) {
            stopForegroundService();
        }
        return workerWrapperRemove;
    }

    private static boolean interrupt(String str, WorkerWrapper workerWrapper, int i) {
        if (workerWrapper != null) {
            workerWrapper.interrupt(i);
            Logger.get().debug(TAG, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
            return true;
        }
        Logger.get().debug(TAG, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
        return false;
    }
}
