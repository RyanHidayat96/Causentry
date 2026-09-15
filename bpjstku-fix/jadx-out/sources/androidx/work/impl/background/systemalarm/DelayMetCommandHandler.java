package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {
    private static final int STATE_INITIAL = 0;
    private static final int STATE_START_REQUESTED = 1;
    private static final int STATE_STOP_REQUESTED = 2;
    private static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
    private final Context mContext;
    private final CoroutineDispatcher mCoroutineDispatcher;
    private int mCurrentState;
    private final SystemAlarmDispatcher mDispatcher;
    private boolean mHasConstraints;
    private volatile VideoMimeInfoBuilder mJob;
    private final Object mLock;
    private final Executor mMainThreadExecutor;
    private final Executor mSerialExecutor;
    private final int mStartId;
    private final StartStopToken mToken;
    private PowerManager.WakeLock mWakeLock;
    private final WorkConstraintsTracker mWorkConstraintsTracker;
    private final WorkGenerationalId mWorkGenerationalId;

    DelayMetCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher, StartStopToken startStopToken) {
        this.mContext = context;
        this.mStartId = i;
        this.mDispatcher = systemAlarmDispatcher;
        this.mWorkGenerationalId = startStopToken.getId();
        this.mToken = startStopToken;
        Trackers trackers = systemAlarmDispatcher.getWorkManager().getTrackers();
        this.mSerialExecutor = systemAlarmDispatcher.getTaskExecutor().getSerialTaskExecutor();
        this.mMainThreadExecutor = systemAlarmDispatcher.getTaskExecutor().getMainThreadExecutor();
        this.mCoroutineDispatcher = systemAlarmDispatcher.getTaskExecutor().getTaskCoroutineDispatcher();
        this.mWorkConstraintsTracker = new WorkConstraintsTracker(trackers);
        this.mHasConstraints = false;
        this.mCurrentState = 0;
        this.mLock = new Object();
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda1(this));
        } else {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWork() {
        if (this.mCurrentState == 0) {
            this.mCurrentState = 1;
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb = new StringBuilder("onAllConstraintsMet for ");
            sb.append(this.mWorkGenerationalId);
            logger.debug(str, sb.toString());
            if (this.mDispatcher.getProcessor().startWork(this.mToken)) {
                this.mDispatcher.getWorkTimer().startTimer(this.mWorkGenerationalId, 600000L, this);
                return;
            } else {
                cleanUp();
                return;
            }
        }
        Logger logger2 = Logger.get();
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder("Already started work for ");
        sb2.append(this.mWorkGenerationalId);
        logger2.debug(str2, sb2.toString());
    }

    void onExecuted(boolean z) {
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder sb = new StringBuilder("onExecuted ");
        sb.append(this.mWorkGenerationalId);
        sb.append(", ");
        sb.append(z);
        logger.debug(str, sb.toString());
        cleanUp();
        if (z) {
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
        }
        if (this.mHasConstraints) {
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createConstraintsChangedIntent(this.mContext), this.mStartId));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(WorkGenerationalId workGenerationalId) {
        Logger.get().debug(TAG, "Exceeded time limits on execution for ".concat(String.valueOf(workGenerationalId)));
        this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
    }

    void handleProcessWork() {
        String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        Context context = this.mContext;
        StringBuilder sb = new StringBuilder();
        sb.append(workSpecId);
        sb.append(" (");
        sb.append(this.mStartId);
        sb.append(")");
        this.mWakeLock = WakeLocks.newWakeLock(context, sb.toString());
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder sb2 = new StringBuilder("Acquiring wakelock ");
        sb2.append(this.mWakeLock);
        sb2.append("for WorkSpec ");
        sb2.append(workSpecId);
        logger.debug(str, sb2.toString());
        this.mWakeLock.acquire();
        WorkSpec workSpec = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(workSpecId);
        if (workSpec == null) {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
            return;
        }
        boolean zHasConstraints = workSpec.hasConstraints();
        this.mHasConstraints = zHasConstraints;
        if (!zHasConstraints) {
            Logger.get().debug(str, "No constraints for ".concat(String.valueOf(workSpecId)));
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda1(this));
        } else {
            this.mJob = WorkConstraintsTrackerKt.listen(this.mWorkConstraintsTracker, workSpec, this.mCoroutineDispatcher, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopWork() {
        String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        if (this.mCurrentState < 2) {
            this.mCurrentState = 2;
            Logger logger = Logger.get();
            String str = TAG;
            logger.debug(str, "Stopping work for WorkSpec ".concat(String.valueOf(workSpecId)));
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createStopWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
            if (this.mDispatcher.getProcessor().isEnqueued(this.mWorkGenerationalId.getWorkSpecId())) {
                Logger logger2 = Logger.get();
                StringBuilder sb = new StringBuilder("WorkSpec ");
                sb.append(workSpecId);
                sb.append(" needs to be rescheduled");
                logger2.debug(str, sb.toString());
                this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
                return;
            }
            Logger logger3 = Logger.get();
            StringBuilder sb2 = new StringBuilder("Processor does not have WorkSpec ");
            sb2.append(workSpecId);
            sb2.append(". No need to reschedule");
            logger3.debug(str, sb2.toString());
            return;
        }
        Logger.get().debug(TAG, "Already stopped work for ".concat(String.valueOf(workSpecId)));
    }

    private void cleanUp() {
        synchronized (this.mLock) {
            if (this.mJob != null) {
                this.mJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            this.mDispatcher.getWorkTimer().stopTimer(this.mWorkGenerationalId);
            PowerManager.WakeLock wakeLock = this.mWakeLock;
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger logger = Logger.get();
                String str = TAG;
                StringBuilder sb = new StringBuilder("Releasing wakelock ");
                sb.append(this.mWakeLock);
                sb.append("for WorkSpec ");
                sb.append(this.mWorkGenerationalId);
                logger.debug(str, sb.toString());
                this.mWakeLock.release();
            }
        }
    }
}
