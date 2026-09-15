package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CommandHandler implements ExecutionListener {
    static final String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final String KEY_WORKSPEC_GENERATION = "KEY_WORKSPEC_GENERATION";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final String TAG = Logger.tagWithPrefix("CommandHandler");
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final Clock mClock;
    private final Context mContext;
    private final StartStopTokens mStartStopTokens;
    private final Map<WorkGenerationalId, DelayMetCommandHandler> mPendingDelayMet = new HashMap();
    private final Object mLock = new Object();

    static Intent createScheduleWorkIntent(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_SCHEDULE_WORK);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    private static Intent writeWorkGenerationalId(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_WORKSPEC_GENERATION, workGenerationalId.getGeneration());
        return intent;
    }

    static WorkGenerationalId readWorkGenerationalId(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra(KEY_WORKSPEC_ID), intent.getIntExtra(KEY_WORKSPEC_GENERATION, 0));
    }

    static Intent createDelayMetIntent(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_DELAY_MET);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    static Intent createStopWorkIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    static Intent createStopWorkIntent(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    static Intent createConstraintsChangedIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_CONSTRAINTS_CHANGED);
        return intent;
    }

    static Intent createRescheduleIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_RESCHEDULE);
        return intent;
    }

    static Intent createExecutionCompletedIntent(Context context, WorkGenerationalId workGenerationalId, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(ACTION_EXECUTION_COMPLETED);
        intent.putExtra(KEY_NEEDS_RESCHEDULE, z);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    CommandHandler(Context context, Clock clock, StartStopTokens startStopTokens) {
        this.mContext = context;
        this.mClock = clock;
        this.mStartStopTokens = startStopTokens;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.mLock) {
            DelayMetCommandHandler delayMetCommandHandlerRemove = this.mPendingDelayMet.remove(workGenerationalId);
            this.mStartStopTokens.remove(workGenerationalId);
            if (delayMetCommandHandlerRemove != null) {
                delayMetCommandHandlerRemove.onExecuted(z);
            }
        }
    }

    boolean hasPendingCommands() {
        boolean zIsEmpty;
        synchronized (this.mLock) {
            zIsEmpty = this.mPendingDelayMet.isEmpty();
        }
        return !zIsEmpty;
    }

    void onHandleIntent(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if (ACTION_CONSTRAINTS_CHANGED.equals(action)) {
            handleConstraintsChanged(intent, i, systemAlarmDispatcher);
            return;
        }
        if (ACTION_RESCHEDULE.equals(action)) {
            handleReschedule(intent, i, systemAlarmDispatcher);
            return;
        }
        if (!hasKeys(intent.getExtras(), KEY_WORKSPEC_ID)) {
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb = new StringBuilder("Invalid request for ");
            sb.append(action);
            sb.append(" , requires KEY_WORKSPEC_ID .");
            logger.error(str, sb.toString());
            return;
        }
        if (ACTION_SCHEDULE_WORK.equals(action)) {
            handleScheduleWorkIntent(intent, i, systemAlarmDispatcher);
            return;
        }
        if (ACTION_DELAY_MET.equals(action)) {
            handleDelayMet(intent, i, systemAlarmDispatcher);
            return;
        }
        if (ACTION_STOP_WORK.equals(action)) {
            handleStopWork(intent, systemAlarmDispatcher);
        } else if (ACTION_EXECUTION_COMPLETED.equals(action)) {
            handleExecutionCompleted(intent, i);
        } else {
            Logger.get().warning(TAG, "Ignoring intent ".concat(String.valueOf(intent)));
        }
    }

    private void handleScheduleWorkIntent(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        WorkGenerationalId workGenerationalId = readWorkGenerationalId(intent);
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Handling schedule work for ".concat(String.valueOf(workGenerationalId)));
        WorkDatabase workDatabase = systemAlarmDispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(workGenerationalId.getWorkSpecId());
            if (workSpec == null) {
                Logger logger2 = Logger.get();
                StringBuilder sb = new StringBuilder("Skipping scheduling ");
                sb.append(workGenerationalId);
                sb.append(" because it's no longer in the DB");
                logger2.warning(str, sb.toString());
                return;
            }
            if (workSpec.state.isFinished()) {
                Logger logger3 = Logger.get();
                StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                sb2.append(workGenerationalId);
                sb2.append("because it is finished.");
                logger3.warning(str, sb2.toString());
                return;
            }
            long jCalculateNextRunTime = workSpec.calculateNextRunTime();
            if (!workSpec.hasConstraints()) {
                Logger logger4 = Logger.get();
                StringBuilder sb3 = new StringBuilder("Setting up Alarms for ");
                sb3.append(workGenerationalId);
                sb3.append("at ");
                sb3.append(jCalculateNextRunTime);
                logger4.debug(str, sb3.toString());
                Alarms.setAlarm(this.mContext, workDatabase, workGenerationalId, jCalculateNextRunTime);
            } else {
                Logger logger5 = Logger.get();
                StringBuilder sb4 = new StringBuilder("Opportunistically setting an alarm for ");
                sb4.append(workGenerationalId);
                sb4.append("at ");
                sb4.append(jCalculateNextRunTime);
                logger5.debug(str, sb4.toString());
                Alarms.setAlarm(this.mContext, workDatabase, workGenerationalId, jCalculateNextRunTime);
                systemAlarmDispatcher.getTaskExecutor().getMainThreadExecutor().execute(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, createConstraintsChangedIntent(this.mContext), i));
            }
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleDelayMet(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        synchronized (this.mLock) {
            WorkGenerationalId workGenerationalId = readWorkGenerationalId(intent);
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb = new StringBuilder("Handing delay met for ");
            sb.append(workGenerationalId);
            logger.debug(str, sb.toString());
            if (!this.mPendingDelayMet.containsKey(workGenerationalId)) {
                DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.mContext, i, systemAlarmDispatcher, this.mStartStopTokens.tokenFor(workGenerationalId));
                this.mPendingDelayMet.put(workGenerationalId, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            } else {
                Logger logger2 = Logger.get();
                StringBuilder sb2 = new StringBuilder("WorkSpec ");
                sb2.append(workGenerationalId);
                sb2.append(" is is already being handled for ACTION_DELAY_MET");
                logger2.debug(str, sb2.toString());
            }
        }
    }

    private void handleStopWork(Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString(KEY_WORKSPEC_ID);
        if (extras.containsKey(KEY_WORKSPEC_GENERATION)) {
            int i = extras.getInt(KEY_WORKSPEC_GENERATION);
            listRemove = new ArrayList<>(1);
            StartStopToken startStopTokenRemove = this.mStartStopTokens.remove(new WorkGenerationalId(string, i));
            if (startStopTokenRemove != null) {
                listRemove.add(startStopTokenRemove);
            }
        } else {
            listRemove = this.mStartStopTokens.remove(string);
        }
        for (StartStopToken startStopToken : listRemove) {
            Logger.get().debug(TAG, "Handing stopWork work for ".concat(String.valueOf(string)));
            systemAlarmDispatcher.getWorkerLauncher().stopWork(startStopToken);
            Alarms.cancelAlarm(this.mContext, systemAlarmDispatcher.getWorkManager().getWorkDatabase(), startStopToken.getId());
            systemAlarmDispatcher.onExecuted(startStopToken.getId(), false);
        }
    }

    private void handleConstraintsChanged(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.get().debug(TAG, "Handling constraints changed ".concat(String.valueOf(intent)));
        new ConstraintsCommandHandler(this.mContext, this.mClock, i, systemAlarmDispatcher).handleConstraintsChanged();
    }

    private void handleReschedule(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Handling reschedule ");
        sb.append(intent);
        sb.append(", ");
        sb.append(i);
        logger.debug(str, sb.toString());
        systemAlarmDispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleExecutionCompleted(Intent intent, int i) {
        WorkGenerationalId workGenerationalId = readWorkGenerationalId(intent);
        boolean z = intent.getExtras().getBoolean(KEY_NEEDS_RESCHEDULE);
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Handling onExecutionCompleted ");
        sb.append(intent);
        sb.append(", ");
        sb.append(i);
        logger.debug(str, sb.toString());
        onExecuted(workGenerationalId, z);
    }

    private static boolean hasKeys(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
