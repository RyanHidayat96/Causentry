package androidx.work;

import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import defpackage.MimeInfo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Q2\u00020\u0001:\u0003RQSB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8GX\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010(R\u001a\u0010+\u001a\u00020%8GX\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000fR\u001a\u00100\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b1\u0010\u000fR\u001a\u00102\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000fR\u001a\u00105\u001a\u0002048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u00109\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001fR\u001a\u0010;\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0017\u001a\u0004\b<\u0010\u0019R\u001a\u0010>\u001a\u00020=8GX\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u001d\u001a\u0004\bI\u0010\u001fR\u001a\u0010K\u001a\u00020J8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\"\u0010O\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u001d\u001a\u0004\bP\u0010\u001f"}, d2 = {"Landroidx/work/Configuration;", "", "Landroidx/work/Configuration$Builder;", "p0", "<init>", "(Landroidx/work/Configuration$Builder;)V", "Landroidx/work/Clock;", "clock", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "", "contentUriTriggerWorkersLimit", "I", "getContentUriTriggerWorkersLimit", "()I", "", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName", "()Ljava/lang/String;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "", "isMarkingJobsAsImportantWhileForeground", "Z", "()Z", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isUsingDefaultTaskExecutor", "maxJobSchedulerId", "getMaxJobSchedulerId", "maxSchedulerLimit", "getMaxSchedulerLimit", "minJobSchedulerId", "getMinJobSchedulerId", "minimumLoggingLevel", "getMinimumLoggingLevel", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "schedulingExceptionHandler", "getSchedulingExceptionHandler", "taskExecutor", "getTaskExecutor", "Landroidx/work/Tracer;", "tracer", "Landroidx/work/Tracer;", "getTracer", "()Landroidx/work/Tracer;", "Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/work/WorkerExceptionInfo;", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler", "Landroidx/work/WorkerFactory;", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler", "Companion", "Builder", "Provider"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final String defaultProcessName;
    private final Executor executor;
    private final Consumer<Throwable> initializationExceptionHandler;
    private final InputMergerFactory inputMergerFactory;
    private final boolean isMarkingJobsAsImportantWhileForeground;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final RunnableScheduler runnableScheduler;
    private final Consumer<Throwable> schedulingExceptionHandler;
    private final Executor taskExecutor;
    private final Tracer tracer;
    private final CoroutineContext workerCoroutineContext;
    private final Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
    private final WorkerFactory workerFactory;
    private final Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "workManagerConfiguration"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public static /* synthetic */ void isMarkingJobsAsImportantWhileForeground$annotations() {
    }

    public Configuration(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        CoroutineDispatcher workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? ConfigurationKt.asExecutor(workerContext) : null;
            if (executor == null) {
                executor = ConfigurationKt.createDefaultExecutor(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = builder.getExecutor() != null ? MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(executor) : Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor;
        SystemClock clock = builder.getClock();
        this.clock = clock == null ? new SystemClock() : clock;
        DefaultWorkerFactory workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? DefaultWorkerFactory.INSTANCE : workerFactory;
        NoOpInputMergerFactory inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory;
        DefaultRunnableScheduler runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new DefaultRunnableScheduler() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        Tracer tracer = builder.getTracer();
        this.tracer = tracer == null ? ConfigurationKt.createDefaultTracer() : tracer;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* JADX INFO: renamed from: isUsingDefaultTaskExecutor, reason: from getter */
    public final boolean getIsUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    /* JADX INFO: renamed from: isMarkingJobsAsImportantWhileForeground, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }

    public final Tracer getTracer() {
        return this.tracer;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b(\u0010\u0014J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020/0\u0015H\u0007¢\u0006\u0004\b0\u0010\u0018J\u0017\u00102\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020/0\u0015H\u0007¢\u0006\u0004\b4\u0010\u0018R$\u00105\u001a\u0004\u0018\u00010\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010S\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010>\"\u0004\b[\u0010@R\"\u0010\\\u001a\u00020\u001f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bb\u0010<\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R\"\u0010e\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\be\u0010<\u001a\u0004\bf\u0010>\"\u0004\bg\u0010@R\"\u0010h\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bh\u0010<\u001a\u0004\bi\u0010>\"\u0004\bj\u0010@R$\u0010k\u001a\u0004\u0018\u00010$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bq\u0010N\u001a\u0004\br\u0010P\"\u0004\bs\u0010RR$\u0010t\u001a\u0004\u0018\u00010\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bt\u0010H\u001a\u0004\bu\u0010J\"\u0004\bv\u0010LR$\u0010w\u001a\u0004\u0018\u00010)8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R'\u0010}\u001a\u0004\u0018\u00010,8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R.\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010N\u001a\u0005\b\u0084\u0001\u0010P\"\u0005\b\u0085\u0001\u0010RR+\u0010\u0086\u0001\u001a\u0004\u0018\u0001018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R.\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010N\u001a\u0005\b\u008d\u0001\u0010P\"\u0005\b\u008e\u0001\u0010R"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "<init>", "()V", "Landroidx/work/Configuration;", "p0", "(Landroidx/work/Configuration;)V", "build", "()Landroidx/work/Configuration;", "Landroidx/work/Clock;", "setClock", "(Landroidx/work/Clock;)Landroidx/work/Configuration$Builder;", "", "setContentUriTriggerWorkersLimit", "(I)Landroidx/work/Configuration$Builder;", "", "setDefaultProcessName", "(Ljava/lang/String;)Landroidx/work/Configuration$Builder;", "Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/work/Configuration$Builder;", "Landroidx/core/util/Consumer;", "", "setInitializationExceptionHandler", "(Landroidx/core/util/Consumer;)Landroidx/work/Configuration$Builder;", "Landroidx/work/InputMergerFactory;", "setInputMergerFactory", "(Landroidx/work/InputMergerFactory;)Landroidx/work/Configuration$Builder;", "p1", "setJobSchedulerJobIdRange", "(II)Landroidx/work/Configuration$Builder;", "", "setMarkingJobsAsImportantWhileForeground", "(Z)Landroidx/work/Configuration$Builder;", "setMaxSchedulerLimit", "setMinimumLoggingLevel", "Landroidx/work/RunnableScheduler;", "setRunnableScheduler", "(Landroidx/work/RunnableScheduler;)Landroidx/work/Configuration$Builder;", "setSchedulingExceptionHandler", "setTaskExecutor", "Landroidx/work/Tracer;", "setTracer", "(Landroidx/work/Tracer;)Landroidx/work/Configuration$Builder;", "Lkotlin/coroutines/CoroutineContext;", "setWorkerCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/work/Configuration$Builder;", "Landroidx/work/WorkerExceptionInfo;", "setWorkerExecutionExceptionHandler", "Landroidx/work/WorkerFactory;", "setWorkerFactory", "(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;", "setWorkerInitializationExceptionHandler", "clock", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", "contentUriTriggerWorkersLimit", "I", "getContentUriTriggerWorkersLimit$work_runtime_release", "()I", "setContentUriTriggerWorkersLimit$work_runtime_release", "(I)V", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "loggingLevel", "getLoggingLevel$work_runtime_release", "setLoggingLevel$work_runtime_release", "markJobsAsImportantWhileForeground", "Z", "getMarkJobsAsImportantWhileForeground$work_runtime_release", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "maxJobSchedulerId", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "maxSchedulerLimit", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "minJobSchedulerId", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", "schedulingExceptionHandler", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "taskExecutor", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "tracer", "Landroidx/work/Tracer;", "getTracer$work_runtime_release", "()Landroidx/work/Tracer;", "setTracer$work_runtime_release", "(Landroidx/work/Tracer;)V", "workerContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerContext$work_runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler$work_runtime_release", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler$work_runtime_release", "setWorkerInitializationExceptionHandler$work_runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Clock clock;
        private int contentUriTriggerWorkersLimit;
        private String defaultProcessName;
        private Executor executor;
        private Consumer<Throwable> initializationExceptionHandler;
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private boolean markJobsAsImportantWhileForeground;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;
        private RunnableScheduler runnableScheduler;
        private Consumer<Throwable> schedulingExceptionHandler;
        private Executor taskExecutor;
        private Tracer tracer;
        private CoroutineContext workerContext;
        private Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        private WorkerFactory workerFactory;
        private Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: getExecutor$work_runtime_release, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        public final void setExecutor$work_runtime_release(Executor executor) {
            this.executor = executor;
        }

        /* JADX INFO: renamed from: getWorkerContext$work_runtime_release, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        public final void setWorkerContext$work_runtime_release(CoroutineContext coroutineContext) {
            this.workerContext = coroutineContext;
        }

        /* JADX INFO: renamed from: getWorkerFactory$work_runtime_release, reason: from getter */
        public final WorkerFactory getWorkerFactory() {
            return this.workerFactory;
        }

        public final void setWorkerFactory$work_runtime_release(WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        /* JADX INFO: renamed from: getInputMergerFactory$work_runtime_release, reason: from getter */
        public final InputMergerFactory getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        public final void setInputMergerFactory$work_runtime_release(InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        /* JADX INFO: renamed from: getTaskExecutor$work_runtime_release, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        public final void setTaskExecutor$work_runtime_release(Executor executor) {
            this.taskExecutor = executor;
        }

        /* JADX INFO: renamed from: getClock$work_runtime_release, reason: from getter */
        public final Clock getClock() {
            return this.clock;
        }

        public final void setClock$work_runtime_release(Clock clock) {
            this.clock = clock;
        }

        /* JADX INFO: renamed from: getRunnableScheduler$work_runtime_release, reason: from getter */
        public final RunnableScheduler getRunnableScheduler() {
            return this.runnableScheduler;
        }

        public final void setRunnableScheduler$work_runtime_release(RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.workerInitializationExceptionHandler;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.workerExecutionExceptionHandler;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        /* JADX INFO: renamed from: getDefaultProcessName$work_runtime_release, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        public final void setDefaultProcessName$work_runtime_release(String str) {
            this.defaultProcessName = str;
        }

        /* JADX INFO: renamed from: getLoggingLevel$work_runtime_release, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.loggingLevel = i;
        }

        /* JADX INFO: renamed from: getMinJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.minJobSchedulerId = i;
        }

        /* JADX INFO: renamed from: getMaxJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.maxJobSchedulerId = i;
        }

        /* JADX INFO: renamed from: getMaxSchedulerLimit$work_runtime_release, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.maxSchedulerLimit = i;
        }

        /* JADX INFO: renamed from: getContentUriTriggerWorkersLimit$work_runtime_release, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.contentUriTriggerWorkersLimit = i;
        }

        /* JADX INFO: renamed from: getMarkJobsAsImportantWhileForeground$work_runtime_release, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
        }

        /* JADX INFO: renamed from: getTracer$work_runtime_release, reason: from getter */
        public final Tracer getTracer() {
            return this.tracer;
        }

        public final void setTracer$work_runtime_release(Tracer tracer) {
            this.tracer = tracer;
        }

        public Builder() {
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
        }

        public Builder(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "");
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.getIsMarkingJobsAsImportantWhileForeground();
            this.tracer = configuration.getTracer();
        }

        public final Builder setWorkerFactory(WorkerFactory p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workerFactory = p0;
            return this;
        }

        public final Builder setInputMergerFactory(InputMergerFactory p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.inputMergerFactory = p0;
            return this;
        }

        public final Builder setExecutor(Executor p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.executor = p0;
            return this;
        }

        public final Builder setWorkerCoroutineContext(CoroutineContext p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workerContext = p0;
            return this;
        }

        public final Builder setTaskExecutor(Executor p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.taskExecutor = p0;
            return this;
        }

        public final Builder setClock(Clock p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.clock = p0;
            return this;
        }

        public final Builder setJobSchedulerJobIdRange(int p0, int p1) {
            if (p1 - p0 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
            }
            this.minJobSchedulerId = p0;
            this.maxJobSchedulerId = p1;
            return this;
        }

        public final Builder setMaxSchedulerLimit(int p0) {
            if (p0 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
            }
            this.maxSchedulerLimit = Math.min(p0, 50);
            return this;
        }

        public final Builder setContentUriTriggerWorkersLimit(int p0) {
            this.contentUriTriggerWorkersLimit = Math.max(p0, 0);
            return this;
        }

        public final Builder setMinimumLoggingLevel(int p0) {
            this.loggingLevel = p0;
            return this;
        }

        public final Builder setRunnableScheduler(RunnableScheduler p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.runnableScheduler = p0;
            return this;
        }

        public final Builder setInitializationExceptionHandler(Consumer<Throwable> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.initializationExceptionHandler = p0;
            return this;
        }

        public final Builder setSchedulingExceptionHandler(Consumer<Throwable> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.schedulingExceptionHandler = p0;
            return this;
        }

        public final Builder setWorkerInitializationExceptionHandler(Consumer<WorkerExceptionInfo> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workerInitializationExceptionHandler = p0;
            return this;
        }

        public final Builder setWorkerExecutionExceptionHandler(Consumer<WorkerExceptionInfo> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.workerExecutionExceptionHandler = p0;
            return this;
        }

        public final Builder setDefaultProcessName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.defaultProcessName = p0;
            return this;
        }

        public final Builder setMarkingJobsAsImportantWhileForeground(boolean p0) {
            this.markJobsAsImportantWhileForeground = p0;
            return this;
        }

        public final Builder setTracer(Tracer p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.tracer = p0;
            return this;
        }

        public final Configuration build() {
            return new Configuration(this);
        }
    }
}
