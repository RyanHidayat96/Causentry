package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.MimeInfo;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Landroidx/work/impl/model/WorkSpec;", "p2", "runWorker", "(Landroidx/work/ListenableWorker;Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupAndRunConstraintTrackingWork", "workerParameters", "Landroidx/work/WorkerParameters;", "ConstraintUnsatisfiedException"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {125}, m = "runWorker", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.runWorker(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {0, 0}, l = {97}, m = "setupAndRunConstraintTrackingWork", n = {"this", "delegate"}, s = {"L$0", "L$1"})
    static final class C06981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C06981(Continuation<? super C06981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object obj2 = ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "");
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(backgroundExecutor), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object setupAndRunConstraintTrackingWork(Continuation<? super ListenableWorker.Result> continuation) {
        C06981 c06981;
        ListenableWorker listenableWorker;
        CancellationException e2;
        ConstraintTrackingWorker constraintTrackingWorker;
        int stopReason;
        if (continuation instanceof C06981) {
            c06981 = (C06981) continuation;
            if ((c06981.label & Integer.MIN_VALUE) != 0) {
                c06981.label -= Integer.MIN_VALUE;
            } else {
                c06981 = new C06981(continuation);
            }
        } else {
            c06981 = new C06981(continuation);
        }
        Object obj = c06981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06981.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
            String str = string;
            if (str == null || str.length() == 0) {
                Logger.get().error(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
                ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure, "");
                return resultFailure;
            }
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(workManagerImpl, "");
            WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
            String string2 = getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            WorkSpec workSpec = workSpecDao.getWorkSpec(string2);
            if (workSpec == null) {
                ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure2, "");
                return resultFailure2;
            }
            Trackers trackers = workManagerImpl.getTrackers();
            Intrinsics.checkNotNullExpressionValue(trackers, "");
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
            if (!workConstraintsTracker.areAllConstraintsMet(workSpec)) {
                String str2 = ConstraintTrackingWorkerKt.TAG;
                Logger logger = Logger.get();
                StringBuilder sb = new StringBuilder("Constraints not met for delegate ");
                sb.append(string);
                sb.append(". Requesting retry.");
                logger.debug(str2, sb.toString());
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry, "");
                return resultRetry;
            }
            Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Constraints met for delegate ".concat(String.valueOf(string)));
            try {
                WorkerFactory workerFactory = getWorkerFactory();
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(applicationContext, string, this.workerParameters);
                Executor mainThreadExecutor = this.workerParameters.getTaskExecutor().getMainThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
                try {
                    CoroutineDispatcher coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mainThreadExecutor);
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(listenableWorkerCreateWorkerWithDefaultFallback, workConstraintsTracker, workSpec, null);
                    c06981.L$0 = this;
                    c06981.L$1 = listenableWorkerCreateWorkerWithDefaultFallback;
                    c06981.label = 1;
                    Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2, anonymousClass5, c06981);
                    if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    listenableWorker = listenableWorkerCreateWorkerWithDefaultFallback;
                    obj = objTuitionPaymentFragmentbindingInflater1;
                    constraintTrackingWorker = this;
                } catch (CancellationException e3) {
                    listenableWorker = listenableWorkerCreateWorkerWithDefaultFallback;
                    e2 = e3;
                    constraintTrackingWorker = this;
                    if (!constraintTrackingWorker.isStopped() || (e2 instanceof ConstraintUnsatisfiedException)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                        } else if (constraintTrackingWorker.isStopped()) {
                            stopReason = constraintTrackingWorker.getStopReason();
                        } else {
                            if (!(e2 instanceof ConstraintUnsatisfiedException)) {
                                throw new IllegalStateException("Unreachable");
                            }
                            stopReason = ((ConstraintUnsatisfiedException) e2).getStopReason();
                        }
                        listenableWorker.stop(stopReason);
                    }
                    if (e2 instanceof ConstraintUnsatisfiedException) {
                        throw e2;
                    }
                    ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
                    Intrinsics.checkNotNullExpressionValue(resultRetry2, "");
                    return resultRetry2;
                }
            } catch (Throwable th) {
                Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
                Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = workManagerImpl.getConfiguration().getWorkerInitializationExceptionHandler();
                if (workerInitializationExceptionHandler != null) {
                    WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, new WorkerExceptionInfo(string, this.workerParameters, th), ConstraintTrackingWorkerKt.TAG);
                }
                ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure3, "");
                return resultFailure3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listenableWorker = (ListenableWorker) c06981.L$1;
            constraintTrackingWorker = (ConstraintTrackingWorker) c06981.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e4) {
                e2 = e4;
                if (!constraintTrackingWorker.isStopped()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                    } else if (constraintTrackingWorker.isStopped()) {
                        stopReason = constraintTrackingWorker.getStopReason();
                    } else {
                        if (!(e2 instanceof ConstraintUnsatisfiedException)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        stopReason = ((ConstraintUnsatisfiedException) e2).getStopReason();
                    }
                    listenableWorker.stop(stopReason);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                    } else if (constraintTrackingWorker.isStopped()) {
                        stopReason = constraintTrackingWorker.getStopReason();
                    } else {
                        if (!(e2 instanceof ConstraintUnsatisfiedException)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        stopReason = ((ConstraintUnsatisfiedException) e2).getStopReason();
                    }
                    listenableWorker.stop(stopReason);
                }
                if (e2 instanceof ConstraintUnsatisfiedException) {
                    throw e2;
                }
                ListenableWorker.Result resultRetry3 = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry3, "");
                return resultRetry3;
            }
        }
        return (ListenableWorker.Result) obj;
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objRunWorker = ConstraintTrackingWorker.this.runWorker(this.$delegate, this.$workConstraintsTracker, this.$workSpec, this);
            return objRunWorker == coroutine_suspended ? coroutine_suspended : objRunWorker;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new AnonymousClass5(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object runWorker(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ListenableWorker.Result> continuation) {
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            C06972 c06972 = new C06972(listenableWorker, workConstraintsTracker, workSpec, null);
            anonymousClass1.label = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(c06972, anonymousClass1);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
    static final class C06972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Code duplicated, block: B:32:0x00da  */
        /* JADX WARN: Code duplicated, block: B:33:0x00db  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e2 A[ADDED_TO_REGION] */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x00f0: INVOKE (r6 I:VideoMimeInfoBuilder) STATIC call: VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(VideoMimeInfoBuilder):void A[MD:(VideoMimeInfoBuilder):void (m)] (LINE:149), block:B:41:0x00f0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
            AtomicInteger atomicInteger;
            ListenableFuture<ListenableWorker.Result> listenableFutureStartWork;
            Object objAwait;
            AtomicInteger atomicInteger2;
            VideoMimeInfoBuilder videoMimeInfoBuilder;
            ListenableFuture<ListenableWorker.Result> listenableFuture;
            AtomicInteger atomicInteger3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    atomicInteger = new AtomicInteger(-256);
                    listenableFutureStartWork = this.$delegate.startWork();
                    Intrinsics.checkNotNullExpressionValue(listenableFutureStartWork, "");
                    VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater2 = b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger, listenableFutureStartWork, null), 3, null);
                    try {
                        this.L$0 = atomicInteger;
                        this.L$1 = listenableFutureStartWork;
                        this.L$2 = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater2;
                        this.label = 1;
                        objAwait = ListenableFutureKt.await(listenableFutureStartWork, this);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicInteger2 = atomicInteger;
                        videoMimeInfoBuilder = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater2;
                        listenableFuture = listenableFutureStartWork;
                    } catch (CancellationException e2) {
                        e = e2;
                        String str = ConstraintTrackingWorkerKt.TAG;
                        ListenableWorker listenableWorker = this.$delegate;
                        Logger logger = Logger.get();
                        StringBuilder sb = new StringBuilder("Delegated worker ");
                        sb.append(listenableWorker.getClass());
                        sb.append(" was cancelled");
                        logger.debug(str, sb.toString(), e);
                        if (atomicInteger.get() == -256) {
                            z = false;
                        }
                        if (!listenableFutureStartWork.isCancelled()) {
                        }
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        String str2 = ConstraintTrackingWorkerKt.TAG;
                        ListenableWorker listenableWorker2 = this.$delegate;
                        Logger logger2 = Logger.get();
                        StringBuilder sb2 = new StringBuilder("Delegated worker ");
                        sb2.append(listenableWorker2.getClass());
                        sb2.append(" threw exception in startWork.");
                        logger2.debug(str2, sb2.toString(), th);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    videoMimeInfoBuilder = (VideoMimeInfoBuilder) this.L$2;
                    listenableFuture = (ListenableFuture) this.L$1;
                    atomicInteger3 = (AtomicInteger) this.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            atomicInteger2 = atomicInteger3;
                            objAwait = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            String str3 = ConstraintTrackingWorkerKt.TAG;
                            ListenableWorker listenableWorker3 = this.$delegate;
                            Logger logger3 = Logger.get();
                            StringBuilder sb3 = new StringBuilder("Delegated worker ");
                            sb3.append(listenableWorker3.getClass());
                            sb3.append(" threw exception in startWork.");
                            logger3.debug(str3, sb3.toString(), th);
                            throw th;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        listenableFutureStartWork = listenableFuture;
                        atomicInteger = atomicInteger3;
                        String str4 = ConstraintTrackingWorkerKt.TAG;
                        ListenableWorker listenableWorker4 = this.$delegate;
                        Logger logger4 = Logger.get();
                        StringBuilder sb4 = new StringBuilder("Delegated worker ");
                        sb4.append(listenableWorker4.getClass());
                        sb4.append(" was cancelled");
                        logger4.debug(str4, sb4.toString(), e);
                        if (atomicInteger.get() == -256) {
                            z = false;
                        }
                        if (!listenableFutureStartWork.isCancelled() && z) {
                            throw new ConstraintUnsatisfiedException(atomicInteger.get());
                        }
                        throw e;
                    }
                }
                try {
                    ListenableWorker.Result result = (ListenableWorker.Result) objAwait;
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                    return result;
                } catch (CancellationException e4) {
                    e = e4;
                    atomicInteger3 = atomicInteger2;
                    listenableFutureStartWork = listenableFuture;
                    atomicInteger = atomicInteger3;
                    String str5 = ConstraintTrackingWorkerKt.TAG;
                    ListenableWorker listenableWorker5 = this.$delegate;
                    Logger logger5 = Logger.get();
                    StringBuilder sb5 = new StringBuilder("Delegated worker ");
                    sb5.append(listenableWorker5.getClass());
                    sb5.append(" was cancelled");
                    logger5.debug(str5, sb5.toString(), e);
                    if (atomicInteger.get() == -256) {
                        z = false;
                    }
                    if (!listenableFutureStartWork.isCancelled()) {
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                throw th3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06972(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super C06972> continuation) {
            super(2, continuation);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06972 c06972 = new C06972(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
            c06972.L$0 = obj;
            return c06972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((C06972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }
}
