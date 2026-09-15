package androidx.work.impl.model;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import defpackage.acquireInputBuffer;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.lambdaaddSignalEosTimeoutIfNeeded9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a3\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0000*\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00010\u0000*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00010\u0000*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"LclampVideoBitrateIfNotSupported;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Lkotlinx/coroutines/CoroutineDispatcher;", "p0", "Landroidx/work/WorkInfo;", "dedup", "(LclampVideoBitrateIfNotSupported;Lkotlinx/coroutines/CoroutineDispatcher;)LclampVideoBitrateIfNotSupported;", "Landroidx/work/impl/model/WorkSpecDao;", "Ljava/util/UUID;", "getWorkStatusPojoFlowDataForIds", "(Landroidx/work/impl/model/WorkSpecDao;Ljava/util/UUID;)LclampVideoBitrateIfNotSupported;", "", "p1", "getWorkStatusPojoFlowForName", "(Landroidx/work/impl/model/WorkSpecDao;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)LclampVideoBitrateIfNotSupported;", "getWorkStatusPojoFlowForTag", "WORK_INFO_BY_IDS", "Ljava/lang/String;", "WORK_INFO_BY_NAME", "WORK_INFO_BY_TAG", "WORK_INFO_COLUMNS"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final clampVideoBitrateIfNotSupported<WorkInfo> getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID uuid) {
        Intrinsics.checkNotNullParameter(workSpecDao, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        final clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(CollectionsKt.listOf(String.valueOf(uuid)));
        return acquireInputBuffer.b(new clampVideoBitrateIfNotSupported<WorkInfo>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
                final /* synthetic */ addSignalEosTimeoutIfNeeded $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$this_unsafeFlow;
                        WorkSpec.WorkInfoPojo workInfoPojo = (WorkSpec.WorkInfoPojo) CollectionsKt.firstOrNull((List) obj);
                        WorkInfo workInfo = workInfoPojo != null ? workInfoPojo.toWorkInfo() : null;
                        anonymousClass1.label = 1;
                        if (addsignaleostimeoutifneeded.emit(workInfo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
                    this.$this_unsafeFlow = addsignaleostimeoutifneeded;
                }
            }

            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super WorkInfo> addsignaleostimeoutifneeded, Continuation continuation) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new AnonymousClass2(addsignaleostimeoutifneeded), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public static final clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, CoroutineDispatcher coroutineDispatcher, String str) {
        Intrinsics.checkNotNullParameter(workSpecDao, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(str, "");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(str), coroutineDispatcher);
    }

    public static final clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, CoroutineDispatcher coroutineDispatcher, String str) {
        Intrinsics.checkNotNullParameter(workSpecDao, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(str, "");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(str), coroutineDispatcher);
    }

    public static final clampVideoBitrateIfNotSupported<List<WorkInfo>> dedup(final clampVideoBitrateIfNotSupported<? extends List<WorkSpec.WorkInfoPojo>> clampvideobitrateifnotsupported, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return lambdaaddSignalEosTimeoutIfNeeded9.TuitionPaymentFragmentspecialinlinedviewModeldefault2(acquireInputBuffer.b(new clampVideoBitrateIfNotSupported<List<? extends WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
                final /* synthetic */ addSignalEosTimeoutIfNeeded $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$this_unsafeFlow;
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).toWorkInfo());
                        }
                        anonymousClass1.label = 1;
                        if (addsignaleostimeoutifneeded.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
                    this.$this_unsafeFlow = addsignaleostimeoutifneeded;
                }
            }

            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super List<? extends WorkInfo>> addsignaleostimeoutifneeded, Continuation continuation) {
                Object objCollect = clampvideobitrateifnotsupported.collect(new AnonymousClass2(addsignaleostimeoutifneeded), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), coroutineDispatcher);
    }
}
