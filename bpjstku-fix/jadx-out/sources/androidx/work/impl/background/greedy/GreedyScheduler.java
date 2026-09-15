package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import defpackage.VideoMimeInfoBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public class GreedyScheduler implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {
    private static final int NON_THROTTLE_RUN_ATTEMPT_COUNT = 5;
    private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
    private final Configuration mConfiguration;
    private final WorkConstraintsTracker mConstraintsTracker;
    private final Context mContext;
    private DelayedWorkTracker mDelayedWorkTracker;
    Boolean mInDefaultProcess;
    private final Processor mProcessor;
    private boolean mRegisteredExecutionListener;
    private final TaskExecutor mTaskExecutor;
    private final TimeLimiter mTimeLimiter;
    private final WorkLauncher mWorkLauncher;
    private final Map<WorkGenerationalId, VideoMimeInfoBuilder> mConstrainedWorkSpecs = new HashMap();
    private final Object mLock = new Object();
    private final StartStopTokens mStartStopTokens = StartStopTokens.create();
    private final Map<WorkGenerationalId, AttemptData> mFirstRunAttempts = new HashMap();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(Context context, Configuration configuration, Trackers trackers, Processor processor, WorkLauncher workLauncher, TaskExecutor taskExecutor) {
        this.mContext = context;
        RunnableScheduler runnableScheduler = configuration.getRunnableScheduler();
        this.mDelayedWorkTracker = new DelayedWorkTracker(this, runnableScheduler, configuration.getClock());
        this.mTimeLimiter = new TimeLimiter(runnableScheduler, workLauncher);
        this.mTaskExecutor = taskExecutor;
        this.mConstraintsTracker = new WorkConstraintsTracker(trackers);
        this.mConfiguration = configuration;
        this.mProcessor = processor;
        this.mWorkLauncher = workLauncher;
    }

    public void setDelayedWorkTracker(DelayedWorkTracker delayedWorkTracker) {
        this.mDelayedWorkTracker = delayedWorkTracker;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(WorkSpec... workSpecArr) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in a secondary process");
            return;
        }
        registerExecutionListenerIfNeeded();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                long jMax = Math.max(workSpec.calculateNextRunTime(), throttleIfNeeded(workSpec));
                long jCurrentTimeMillis = this.mConfiguration.getClock().currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec, jMax);
                        }
                    } else if (workSpec.hasConstraints()) {
                        Constraints constraints = workSpec.constraints;
                        if (constraints.getRequiresDeviceIdle()) {
                            Logger logger = Logger.get();
                            String str = TAG;
                            StringBuilder sb = new StringBuilder("Ignoring ");
                            sb.append(workSpec);
                            sb.append(". Requires device idle.");
                            logger.debug(str, sb.toString());
                        } else if (constraints.hasContentUriTriggers()) {
                            Logger logger2 = Logger.get();
                            String str2 = TAG;
                            StringBuilder sb2 = new StringBuilder("Ignoring ");
                            sb2.append(workSpec);
                            sb2.append(". Requires ContentUri triggers.");
                            logger2.debug(str2, sb2.toString());
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                        Logger logger3 = Logger.get();
                        String str3 = TAG;
                        StringBuilder sb3 = new StringBuilder("Starting work for ");
                        sb3.append(workSpec.id);
                        logger3.debug(str3, sb3.toString());
                        StartStopToken startStopToken = this.mStartStopTokens.tokenFor(workSpec);
                        this.mTimeLimiter.track(startStopToken);
                        this.mWorkLauncher.startWork(startStopToken);
                    }
                }
            }
        }
        synchronized (this.mLock) {
            if (!hashSet.isEmpty()) {
                String strJoin = TextUtils.join(",", hashSet2);
                Logger logger4 = Logger.get();
                String str4 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Starting tracking for ");
                sb4.append(strJoin);
                logger4.debug(str4, sb4.toString());
                for (WorkSpec workSpec2 : hashSet) {
                    WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec2);
                    if (!this.mConstrainedWorkSpecs.containsKey(workGenerationalIdGenerationalId)) {
                        this.mConstrainedWorkSpecs.put(workGenerationalIdGenerationalId, WorkConstraintsTrackerKt.listen(this.mConstraintsTracker, workSpec2, this.mTaskExecutor.getTaskCoroutineDispatcher(), this));
                    }
                }
            }
        }
    }

    private void checkDefaultProcess() {
        this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, this.mConfiguration));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(String str) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in non-main process");
            return;
        }
        registerExecutionListenerIfNeeded();
        Logger.get().debug(TAG, "Cancelling work ID ".concat(String.valueOf(str)));
        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(str);
        }
        for (StartStopToken startStopToken : this.mStartStopTokens.remove(str)) {
            this.mTimeLimiter.cancel(startStopToken);
            this.mWorkLauncher.stopWork(startStopToken);
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            if (this.mStartStopTokens.contains(workGenerationalIdGenerationalId)) {
                return;
            }
            Logger.get().debug(TAG, "Constraints met: Scheduling work ID ".concat(String.valueOf(workGenerationalIdGenerationalId)));
            StartStopToken startStopToken = this.mStartStopTokens.tokenFor(workGenerationalIdGenerationalId);
            this.mTimeLimiter.track(startStopToken);
            this.mWorkLauncher.startWork(startStopToken);
            return;
        }
        Logger.get().debug(TAG, "Constraints not met: Cancelling work ID ".concat(String.valueOf(workGenerationalIdGenerationalId)));
        StartStopToken startStopTokenRemove = this.mStartStopTokens.remove(workGenerationalIdGenerationalId);
        if (startStopTokenRemove != null) {
            this.mTimeLimiter.cancel(startStopTokenRemove);
            this.mWorkLauncher.stopWorkWithReason(startStopTokenRemove, ((ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        StartStopToken startStopTokenRemove = this.mStartStopTokens.remove(workGenerationalId);
        if (startStopTokenRemove != null) {
            this.mTimeLimiter.cancel(startStopTokenRemove);
        }
        removeConstraintTrackingFor(workGenerationalId);
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            this.mFirstRunAttempts.remove(workGenerationalId);
        }
    }

    private void removeConstraintTrackingFor(WorkGenerationalId workGenerationalId) {
        VideoMimeInfoBuilder videoMimeInfoBuilderRemove;
        synchronized (this.mLock) {
            videoMimeInfoBuilderRemove = this.mConstrainedWorkSpecs.remove(workGenerationalId);
        }
        if (videoMimeInfoBuilderRemove != null) {
            Logger.get().debug(TAG, "Stopping tracking for ".concat(String.valueOf(workGenerationalId)));
            videoMimeInfoBuilderRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
    }

    private void registerExecutionListenerIfNeeded() {
        if (this.mRegisteredExecutionListener) {
            return;
        }
        this.mProcessor.addExecutionListener(this);
        this.mRegisteredExecutionListener = true;
    }

    private long throttleIfNeeded(WorkSpec workSpec) {
        long j;
        long jMax;
        synchronized (this.mLock) {
            WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
            AttemptData attemptData = this.mFirstRunAttempts.get(workGenerationalIdGenerationalId);
            if (attemptData == null) {
                attemptData = new AttemptData(workSpec.runAttemptCount, this.mConfiguration.getClock().currentTimeMillis());
                this.mFirstRunAttempts.put(workGenerationalIdGenerationalId, attemptData);
            }
            j = attemptData.mTimeStamp;
            jMax = Math.max((workSpec.runAttemptCount - attemptData.mRunAttemptCount) - 5, 0);
        }
        return j + (jMax * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }

    static class AttemptData {
        final int mRunAttemptCount;
        final long mTimeStamp;

        private AttemptData(int i, long j) {
            this.mRunAttemptCount = i;
            this.mTimeStamp = j;
        }
    }
}
