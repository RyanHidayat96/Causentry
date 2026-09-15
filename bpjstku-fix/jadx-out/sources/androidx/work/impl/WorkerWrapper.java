package androidx.work.impl;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ForegroundUpdater;
import androidx.work.InputMerger;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.MimeInfo;
import defpackage.SizeCannotEncodeVideoQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002RSB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b \u0010\rJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0011\u0010B\u001a\u00020?8G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\u00020C8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010>R\u0014\u0010M\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010Q"}, d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "Landroidx/work/impl/WorkerWrapper$Builder;", "p0", "<init>", "(Landroidx/work/impl/WorkerWrapper$Builder;)V", "", "", "createWorkDescription", "(Ljava/util/List;)Ljava/lang/String;", "Landroidx/work/ListenableWorker$Result;", "", "handleResult", "(Landroidx/work/ListenableWorker$Result;)Z", "", "", "interrupt", "(I)V", "iterativelyFailWorkAndDependents", "(Ljava/lang/String;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "launch", "()Lcom/google/common/util/concurrent/ListenableFuture;", "onWorkFinished", "reschedule", "(I)Z", "resetPeriodic", "()Z", "resetWorkerStatus", "Landroidx/work/impl/WorkerWrapper$Resolution;", "runWorker", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFailed", "setSucceeded", "trySetRunning", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Landroidx/work/ListenableWorker;", "builderWorker", "Landroidx/work/ListenableWorker;", "Landroidx/work/Clock;", "clock", "Landroidx/work/Clock;", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/Configuration;", "Landroidx/work/impl/model/DependencyDao;", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "Landroidx/work/impl/foreground/ForegroundProcessor;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "Landroidx/work/WorkerParameters$RuntimeExtras;", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "tags", "Ljava/util/List;", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "workDescription", "Ljava/lang/String;", "Landroidx/work/impl/model/WorkGenerationalId;", "getWorkGenerationalId", "()Landroidx/work/impl/model/WorkGenerationalId;", "workGenerationalId", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecId", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "LSizeCannotEncodeVideoQuirk;", "workerJob", "LSizeCannotEncodeVideoQuirk;", "Builder", "Resolution"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkerWrapper {
    private final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    private final Configuration configuration;
    private final DependencyDao dependencyDao;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final List<String> tags;
    private final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    private final TaskExecutor workTaskExecutor;
    private final SizeCannotEncodeVideoQuirk workerJob;

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$runWorker$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0, 0}, l = {299}, m = "runWorker", n = {"this", "params"}, s = {"L$0", "L$1"})
    static final class C06881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C06881(Continuation<? super C06881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    public WorkerWrapper(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        this.workerJob = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) null);
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$launch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Resolution.Failed failed;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            ListenableWorker.Result result = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = BuildersKt.TuitionPaymentFragmentbindingInflater1(WorkerWrapper.this.workerJob, new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                failed = (Resolution) obj;
            } catch (WorkerStoppedException e2) {
                failed = new Resolution.ResetWorkerStatus(e2.getReason());
            } catch (CancellationException unused) {
                failed = new Resolution.Failed(result, i2, objArr3 == true ? 1 : 0);
            } catch (Throwable th) {
                Logger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                failed = new Resolution.Failed(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = WorkerWrapper.this.workDatabase;
            final WorkerWrapper workerWrapper = WorkerWrapper.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.WorkerWrapper$launch$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.AnonymousClass1.invokeSuspend$lambda$1(failed, workerWrapper);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "");
            return objRunInTransaction;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean invokeSuspend$lambda$1(Resolution resolution, WorkerWrapper workerWrapper) {
            boolean zResetWorkerStatus;
            if (resolution instanceof Resolution.Finished) {
                zResetWorkerStatus = workerWrapper.onWorkFinished(((Resolution.Finished) resolution).getResult());
            } else if (resolution instanceof Resolution.Failed) {
                workerWrapper.setFailed(((Resolution.Failed) resolution).getResult());
                zResetWorkerStatus = false;
            } else {
                if (!(resolution instanceof Resolution.ResetWorkerStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                zResetWorkerStatus = workerWrapper.resetWorkerStatus(((Resolution.ResetWorkerStatus) resolution).getReason());
            }
            return Boolean.valueOf(zResetWorkerStatus);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorkerWrapper.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final ListenableFuture<Boolean> launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) null)), null, new AnonymousClass1(null), 2, null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution;", "", "<init>", "()V", "Failed", "Finished", "ResetWorkerStatus", "Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class Resolution {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "", "p0", "<init>", "(I)V", "reason", "I", "getReason", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            public ResetWorkerStatus(int i) {
                super(null);
                this.reason = i;
            }

            public /* synthetic */ ResetWorkerStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -256 : i);
            }

            public final int getReason() {
                return this.reason;
            }

            public ResetWorkerStatus() {
                this(0, 1, null);
            }
        }

        private Resolution() {
        }

        public /* synthetic */ Resolution(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "Landroidx/work/ListenableWorker$Result;", "p0", "<init>", "(Landroidx/work/ListenableWorker$Result;)V", "result", "Landroidx/work/ListenableWorker$Result;", "getResult", "()Landroidx/work/ListenableWorker$Result;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(ListenableWorker.Result result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "");
                this.result = result;
            }

            public /* synthetic */ Failed(ListenableWorker.Result.Failure failure, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new ListenableWorker.Result.Failure() : failure);
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Failed() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "Landroidx/work/ListenableWorker$Result;", "p0", "<init>", "(Landroidx/work/ListenableWorker$Result;)V", "result", "Landroidx/work/ListenableWorker$Result;", "getResult", "()Landroidx/work/ListenableWorker$Result;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "");
                this.result = result;
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:67:0x022a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object runWorker(Continuation<? super Resolution> continuation) {
        C06881 c06881;
        Data dataMerge;
        WorkerParameters workerParameters;
        WorkerWrapper workerWrapper;
        WorkerParameters workerParameters2;
        Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        if (continuation instanceof C06881) {
            c06881 = (C06881) continuation;
            if ((c06881.label & Integer.MIN_VALUE) != 0) {
                c06881.label -= Integer.MIN_VALUE;
            } else {
                c06881 = new C06881(continuation);
            }
        } else {
            c06881 = new C06881(continuation);
        }
        Object objTuitionPaymentFragmentbindingInflater1 = c06881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06881.label;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
            final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
            final String traceTag = this.workSpec.getTraceTag();
            if (zIsEnabled && traceTag != null) {
                this.configuration.getTracer().beginAsyncSection(traceTag, this.workSpec.hashCode());
            }
            Boolean bool = (Boolean) this.workDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.runWorker$lambda$1(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bool, "");
            int i3 = 0;
            if (bool.booleanValue()) {
                return new Resolution.ResetWorkerStatus(i3, i2, defaultConstructorMarker);
            }
            if (this.workSpec.isPeriodic()) {
                dataMerge = this.workSpec.input;
            } else {
                InputMerger inputMergerCreateInputMergerWithDefaultFallback = this.configuration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.workSpec.inputMergerClassName);
                if (inputMergerCreateInputMergerWithDefaultFallback == null) {
                    String str = WorkerWrapperKt.TAG;
                    Logger logger = Logger.get();
                    StringBuilder sb = new StringBuilder("Could not create Input Merger ");
                    sb.append(this.workSpec.inputMergerClassName);
                    logger.error(str, sb.toString());
                    return new Resolution.Failed(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                }
                dataMerge = inputMergerCreateInputMergerWithDefaultFallback.merge(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.workSpec.input), (Iterable) this.workSpecDao.getInputsFromPrerequisites(this.workSpecId)));
            }
            workerParameters = new WorkerParameters(UUID.fromString(this.workSpecId), dataMerge, this.tags, this.runtimeExtras, this.workSpec.runAttemptCount, this.workSpec.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new WorkProgressUpdater(this.workDatabase, this.workTaskExecutor), new WorkForegroundUpdater(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
            final ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = this.builderWorker;
            if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
                try {
                    listenableWorkerCreateWorkerWithDefaultFallback = this.configuration.getWorkerFactory().createWorkerWithDefaultFallback(this.appContext, this.workSpec.workerClassName, workerParameters);
                } catch (Throwable th) {
                    String str2 = WorkerWrapperKt.TAG;
                    Logger logger2 = Logger.get();
                    StringBuilder sb2 = new StringBuilder("Could not create Worker ");
                    sb2.append(this.workSpec.workerClassName);
                    logger2.error(str2, sb2.toString());
                    Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = this.configuration.getWorkerInitializationExceptionHandler();
                    if (workerInitializationExceptionHandler != null) {
                        WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, new WorkerExceptionInfo(this.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.TAG);
                    }
                    return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
                }
            }
            listenableWorkerCreateWorkerWithDefaultFallback.setUsed();
            CoroutineContext.Element element = c06881.getContext().get(VideoMimeInfoBuilder.b);
            Intrinsics.checkNotNull(element);
            VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) element;
            videoMimeInfoBuilder.a_(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapper.runWorker.2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    if (th2 instanceof WorkerStoppedException) {
                        listenableWorkerCreateWorkerWithDefaultFallback.stop(((WorkerStoppedException) th2).getReason());
                    }
                    if (!zIsEnabled || traceTag == null) {
                        return;
                    }
                    this.configuration.getTracer().endAsyncSection(traceTag, this.getWorkSpec().hashCode());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            if (!trySetRunning()) {
                return new Resolution.ResetWorkerStatus(0, 1, null);
            }
            int i4 = 0;
            int i5 = 1;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if (videoMimeInfoBuilder.d()) {
                return new Resolution.ResetWorkerStatus(i4, i5, defaultConstructorMarker2);
            }
            ForegroundUpdater foregroundUpdater = workerParameters.getForegroundUpdater();
            Intrinsics.checkNotNullExpressionValue(foregroundUpdater, "");
            Executor mainThreadExecutor = this.workTaskExecutor.getMainThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
            try {
                CoroutineDispatcher coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainThreadExecutor);
                WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(this, listenableWorkerCreateWorkerWithDefaultFallback, foregroundUpdater, null);
                c06881.L$0 = this;
                c06881.L$1 = workerParameters;
                c06881.label = 1;
                objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2, workerWrapper$runWorker$result$1, c06881);
                if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workerWrapper = this;
                workerParameters2 = workerParameters;
            } catch (CancellationException e2) {
                e = e2;
                workerWrapper = this;
                String str3 = WorkerWrapperKt.TAG;
                Logger logger3 = Logger.get();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(workerWrapper.workDescription);
                sb3.append(" was cancelled");
                logger3.info(str3, sb3.toString(), e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                workerWrapper = this;
                String str4 = WorkerWrapperKt.TAG;
                Logger logger4 = Logger.get();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(workerWrapper.workDescription);
                sb4.append(" failed because it threw an exception/error");
                logger4.error(str4, sb4.toString(), th);
                workerExecutionExceptionHandler = workerWrapper.configuration.getWorkerExecutionExceptionHandler();
                if (workerExecutionExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerExecutionExceptionHandler, new WorkerExceptionInfo(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.TAG);
                }
                return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            workerParameters2 = (WorkerParameters) c06881.L$1;
            workerWrapper = (WorkerWrapper) c06881.L$0;
            try {
                ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
            } catch (CancellationException e3) {
                e = e3;
                String str5 = WorkerWrapperKt.TAG;
                Logger logger5 = Logger.get();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(workerWrapper.workDescription);
                sb5.append(" was cancelled");
                logger5.info(str5, sb5.toString(), e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                workerParameters = workerParameters2;
                String str6 = WorkerWrapperKt.TAG;
                Logger logger6 = Logger.get();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(workerWrapper.workDescription);
                sb6.append(" failed because it threw an exception/error");
                logger6.error(str6, sb6.toString(), th);
                workerExecutionExceptionHandler = workerWrapper.configuration.getWorkerExecutionExceptionHandler();
                if (workerExecutionExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerExecutionExceptionHandler, new WorkerExceptionInfo(workerWrapper.workSpec.workerClassName, workerParameters, th), WorkerWrapperKt.TAG);
                }
                return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
            }
        }
        ListenableWorker.Result result = (ListenableWorker.Result) objTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullExpressionValue(result, "");
        return new Resolution.Finished(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        WorkInfo.State state = workerWrapper.workSpec.state;
        WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
        Boolean bool = Boolean.TRUE;
        if (state != state2) {
            String str = WorkerWrapperKt.TAG;
            Logger logger = Logger.get();
            StringBuilder sb = new StringBuilder();
            sb.append(workerWrapper.workSpec.workerClassName);
            sb.append(" is not in ENQUEUED state. Nothing more to do");
            logger.debug(str, sb.toString());
            return bool;
        }
        if ((workerWrapper.workSpec.isPeriodic() || workerWrapper.workSpec.isBackedOff()) && workerWrapper.clock.currentTimeMillis() < workerWrapper.workSpec.calculateNextRunTime()) {
            Logger logger2 = Logger.get();
            String str2 = WorkerWrapperKt.TAG;
            StringBuilder sb2 = new StringBuilder("Delaying execution for ");
            sb2.append(workerWrapper.workSpec.workerClassName);
            sb2.append(" because it is being executed before schedule.");
            logger2.debug(str2, sb2.toString());
            return bool;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result p0) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(p0);
        }
        if (state.isFinished()) {
            return false;
        }
        return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
    }

    public final void interrupt(int p0) {
        this.workerJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new WorkerStoppedException(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int p0) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            String str = WorkerWrapperKt.TAG;
            Logger logger = Logger.get();
            StringBuilder sb = new StringBuilder("Status for ");
            sb.append(this.workSpecId);
            sb.append(" is ");
            sb.append(state);
            sb.append(" ; not doing any work");
            logger.debug(str, sb.toString());
            return false;
        }
        String str2 = WorkerWrapperKt.TAG;
        Logger logger2 = Logger.get();
        StringBuilder sb2 = new StringBuilder("Status for ");
        sb2.append(this.workSpecId);
        sb2.append(" is ");
        sb2.append(state);
        sb2.append("; not doing any work and rescheduling for later execution");
        logger2.debug(str2, sb2.toString());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, p0);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    private final boolean handleResult(ListenableWorker.Result p0) {
        if (p0 instanceof ListenableWorker.Result.Success) {
            String str = WorkerWrapperKt.TAG;
            Logger logger = Logger.get();
            StringBuilder sb = new StringBuilder("Worker result SUCCESS for ");
            sb.append(this.workDescription);
            logger.info(str, sb.toString());
            if (this.workSpec.isPeriodic()) {
                return resetPeriodic();
            }
            return setSucceeded(p0);
        }
        if (p0 instanceof ListenableWorker.Result.Retry) {
            String str2 = WorkerWrapperKt.TAG;
            Logger logger2 = Logger.get();
            StringBuilder sb2 = new StringBuilder("Worker result RETRY for ");
            sb2.append(this.workDescription);
            logger2.info(str2, sb2.toString());
            return reschedule(-256);
        }
        String str3 = WorkerWrapperKt.TAG;
        Logger logger3 = Logger.get();
        StringBuilder sb3 = new StringBuilder("Worker result FAILURE for ");
        sb3.append(this.workDescription);
        logger3.info(str3, sb3.toString());
        if (this.workSpec.isPeriodic()) {
            return resetPeriodic();
        }
        if (p0 == null) {
            p0 = new ListenableWorker.Result.Failure();
        }
        return setFailed(p0);
    }

    private final boolean trySetRunning() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.trySetRunning$lambda$11(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$11(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean setFailed(ListenableWorker.Result p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) p0).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }

    private final void iterativelyFailWorkAndDependents(String p0) {
        List listMutableListOf = CollectionsKt.mutableListOf(p0);
        while (!listMutableListOf.isEmpty()) {
            String str = (String) CollectionsKt.removeLast(listMutableListOf);
            if (this.workSpecDao.getState(str) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str);
            }
            listMutableListOf.addAll(this.dependencyDao.getDependentWorkIds(str));
        }
    }

    private final boolean reschedule(int p0) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, p0);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    private final boolean setSucceeded(ListenableWorker.Result p0) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        Intrinsics.checkNotNull(p0, "");
        Data outputData = ((ListenableWorker.Result.Success) p0).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str)) {
                Logger.get().info(WorkerWrapperKt.TAG, "Setting status to enqueued for ".concat(String.valueOf(str)));
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    private final String createWorkDescription(List<String> p0) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.workSpecId);
        sb.append(", tags={ ");
        sb.append(CollectionsKt.joinToString$default(p0, ",", null, null, 0, null, null, 62, null));
        sb.append(" } ]");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Builder;", "", "Landroid/content/Context;", "p0", "Landroidx/work/Configuration;", "p1", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "p2", "Landroidx/work/impl/foreground/ForegroundProcessor;", "p3", "Landroidx/work/impl/WorkDatabase;", "p4", "Landroidx/work/impl/model/WorkSpec;", "p5", "", "", "p6", "<init>", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/foreground/ForegroundProcessor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/model/WorkSpec;Ljava/util/List;)V", "Landroidx/work/impl/WorkerWrapper;", "build", "()Landroidx/work/impl/WorkerWrapper;", "Landroidx/work/WorkerParameters$RuntimeExtras;", "withRuntimeExtras", "(Landroidx/work/WorkerParameters$RuntimeExtras;)Landroidx/work/impl/WorkerWrapper$Builder;", "Landroidx/work/ListenableWorker;", "withWorker", "(Landroidx/work/ListenableWorker;)Landroidx/work/impl/WorkerWrapper$Builder;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "getForegroundProcessor", "()Landroidx/work/impl/foreground/ForegroundProcessor;", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "getRuntimeExtras", "()Landroidx/work/WorkerParameters$RuntimeExtras;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$RuntimeExtras;)V", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "getWorkDatabase", "()Landroidx/work/impl/WorkDatabase;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "worker", "Landroidx/work/ListenableWorker;", "getWorker", "()Landroidx/work/ListenableWorker;", "setWorker", "(Landroidx/work/ListenableWorker;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras;
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        public Builder(Context context, Configuration configuration, TaskExecutor taskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(configuration, "");
            Intrinsics.checkNotNullParameter(taskExecutor, "");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "");
            Intrinsics.checkNotNullParameter(workDatabase, "");
            Intrinsics.checkNotNullParameter(workSpec, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.configuration = configuration;
            this.workTaskExecutor = taskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = list;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.RuntimeExtras();
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final ListenableWorker getWorker() {
            return this.worker;
        }

        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            Intrinsics.checkNotNullParameter(runtimeExtras, "");
            this.runtimeExtras = runtimeExtras;
        }

        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras p0) {
            if (p0 != null) {
                this.runtimeExtras = p0;
            }
            return this;
        }

        public final Builder withWorker(ListenableWorker p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.worker = p0;
            return this;
        }

        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }
    }
}
