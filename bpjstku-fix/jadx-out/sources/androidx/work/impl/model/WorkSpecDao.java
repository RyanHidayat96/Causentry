package androidx.work.impl.model;

import androidx.p002lifecycle.LiveData;
import androidx.work.Data;
import androidx.work.WorkInfo;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001b\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\u001c\u0010\u000fJ\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00112\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\u001f\u0010\u000fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b$\u0010\u0018J\u0019\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b(\u0010\u0018J)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0)2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0)2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0)2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b/\u0010.J\u0019\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b0\u00101J#\u00102\u001a\b\u0012\u0004\u0012\u00020*0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020*0\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b4\u0010\u0018J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020*0\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b5\u0010\u0018J)\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'¢\u0006\u0004\b6\u00107J#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0\u00112\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b8\u0010\u001eJ#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\n0\u00112\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b9\u0010\u001eJ\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0)H'¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b=\u0010\tJ\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b>\u0010\tJ\u0017\u0010?\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH'¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0019H'¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0007H'¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0002H'¢\u0006\u0004\bH\u0010\u0004J\u001f\u0010I\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0002H'¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\bK\u0010@J\u0017\u0010L\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\bL\u0010@J\u001f\u0010M\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0019H'¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0019H'¢\u0006\u0004\bO\u0010NJ\u001f\u0010P\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0016H'¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010C\u001a\u00020\u0005H'¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0002H'¢\u0006\u0004\bT\u0010JJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH'¢\u0006\u0004\bU\u0010Bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "", "countNonFinishedContentUriTriggerWorkers", "()I", "", "p0", "", "delete", "(Ljava/lang/String;)V", "", "Landroidx/work/impl/model/WorkSpec;", "getAllEligibleWorkSpecsForScheduling", "(I)Ljava/util/List;", "getAllUnfinishedWork", "()Ljava/util/List;", "getAllWorkSpecIds", "Landroidx/lifecycle/LiveData;", "getAllWorkSpecIdsLiveData", "()Landroidx/lifecycle/LiveData;", "getEligibleWorkForScheduling", "getEligibleWorkForSchedulingWithContentUris", "Landroidx/work/Data;", "getInputsFromPrerequisites", "(Ljava/lang/String;)Ljava/util/List;", "", "getRecentlyCompletedWork", "(J)Ljava/util/List;", "getRunningWork", "getScheduleRequestedAtLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getScheduledWork", "Landroidx/work/WorkInfo$State;", "getState", "(Ljava/lang/String;)Landroidx/work/WorkInfo$State;", "getUnfinishedWorkWithName", "getUnfinishedWorkWithTag", "getWorkSpec", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkSpecIdAndStatesForName", "LclampVideoBitrateIfNotSupported;", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoFlowDataForIds", "(Ljava/util/List;)LclampVideoBitrateIfNotSupported;", "getWorkStatusPojoFlowForName", "(Ljava/lang/String;)LclampVideoBitrateIfNotSupported;", "getWorkStatusPojoFlowForTag", "getWorkStatusPojoForId", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForIds", "(Ljava/util/List;)Ljava/util/List;", "getWorkStatusPojoForName", "getWorkStatusPojoForTag", "getWorkStatusPojoLiveDataForIds", "(Ljava/util/List;)Landroidx/lifecycle/LiveData;", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoLiveDataForTag", "", "hasUnfinishedWorkFlow", "()LclampVideoBitrateIfNotSupported;", "incrementGeneration", "incrementPeriodCount", "incrementWorkSpecRunAttemptCount", "(Ljava/lang/String;)I", "insertWorkSpec", "(Landroidx/work/impl/model/WorkSpec;)V", "p1", "markWorkSpecScheduled", "(Ljava/lang/String;J)I", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "()V", "resetScheduledState", "resetWorkSpecNextScheduleTimeOverride", "(Ljava/lang/String;I)V", "resetWorkSpecRunAttemptCount", "setCancelledState", "setLastEnqueueTime", "(Ljava/lang/String;J)V", "setNextScheduleTimeOverride", "setOutput", "(Ljava/lang/String;Landroidx/work/Data;)V", "setState", "(Landroidx/work/WorkInfo$State;Ljava/lang/String;)I", "setStopReason", "updateWorkSpec"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkSpecDao {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(String p0);

    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int p0);

    List<String> getAllUnfinishedWork();

    List<String> getAllWorkSpecIds();

    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    List<WorkSpec> getEligibleWorkForScheduling(int p0);

    List<WorkSpec> getEligibleWorkForSchedulingWithContentUris();

    List<Data> getInputsFromPrerequisites(String p0);

    List<WorkSpec> getRecentlyCompletedWork(long p0);

    List<WorkSpec> getRunningWork();

    LiveData<Long> getScheduleRequestedAtLiveData(String p0);

    List<WorkSpec> getScheduledWork();

    WorkInfo.State getState(String p0);

    List<String> getUnfinishedWorkWithName(String p0);

    List<String> getUnfinishedWorkWithTag(String p0);

    WorkSpec getWorkSpec(String p0);

    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String p0);

    clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(List<String> p0);

    clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(String p0);

    clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(String p0);

    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String p0);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> p0);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String p0);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String p0);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> p0);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String p0);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String p0);

    clampVideoBitrateIfNotSupported<Boolean> hasUnfinishedWorkFlow();

    void incrementGeneration(String p0);

    void incrementPeriodCount(String p0);

    int incrementWorkSpecRunAttemptCount(String p0);

    void insertWorkSpec(WorkSpec p0);

    int markWorkSpecScheduled(String p0, long p1);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(String p0, int p1);

    int resetWorkSpecRunAttemptCount(String p0);

    int setCancelledState(String p0);

    void setLastEnqueueTime(String p0, long p1);

    void setNextScheduleTimeOverride(String p0, long p1);

    void setOutput(String p0, Data p1);

    int setState(WorkInfo.State p0, String p1);

    void setStopReason(String p0, int p1);

    void updateWorkSpec(WorkSpec p0);
}
