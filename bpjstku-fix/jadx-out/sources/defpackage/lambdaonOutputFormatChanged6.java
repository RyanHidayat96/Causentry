package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000eH\u0016¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000eH\u0017¢\u0006\u0002\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000e2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001fR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u001eH\u0082\b¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0002J\u0015\u0010#\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0007H\u0016J\u0011\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0097AJ%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(2\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u001f\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160.H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u0018\u0010\f\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00060\u0012j\u0002`\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "name", "", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;ILjava/lang/String;)V", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "workerAllocationLock", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "Ljava/lang/Object;", "limitedParallelism", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "(Ljava/lang/Runnable;Lkotlin/jvm/functions/Function1;)V", "tryAllocateWorker", "", "obtainTaskOrDeallocateWorker", "()Ljava/lang/Runnable;", "toString", "delay", "time", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaonOutputFormatChanged6 extends CoroutineDispatcher implements selectSampleRateOrNearestSupported {
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicIntegerFieldUpdater.newUpdater(lambdaonOutputFormatChanged6.class, "runningWorkers$volatile");
    private final CoroutineDispatcher TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final /* synthetic */ selectSampleRateOrNearestSupported TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1252a;
    private final int b;
    private final sendEncodedData<Runnable> d;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaonOutputFormatChanged6(CoroutineDispatcher coroutineDispatcher, int i, String str) {
        selectSampleRateOrNearestSupported selectsamplerateornearestsupported = coroutineDispatcher instanceof selectSampleRateOrNearestSupported ? (selectSampleRateOrNearestSupported) coroutineDispatcher : null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = selectsamplerateornearestsupported == null ? resolveAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : selectsamplerateornearestsupported;
        this.TuitionPaymentFragmentbindingInflater1 = coroutineDispatcher;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.d = new sendEncodedData<>();
        this.f1252a = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int parallelism, String name) {
        if (parallelism > 0) {
            if (parallelism < this.b) {
                return super.limitedParallelism(parallelism, name);
            }
            lambdaonOutputFormatChanged6 lambdaonoutputformatchanged6 = this;
            return name != null ? new lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(lambdaonoutputformatchanged6, name) : lambdaonoutputformatchanged6;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got ".concat(String.valueOf(parallelism)).toString());
    }

    private final boolean b() {
        synchronized (this.f1252a) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (atomicIntegerFieldUpdater.get(this) >= this.b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        while (true) {
            Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                return runnableTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            synchronized (this.f1252a) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                long j = updatePauseRangeStateAndCheckIfBufferPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get((updatePauseRangeStateAndCheckIfBufferPaused) sendEncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this.d));
                if (((((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823) == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(".limitedParallelism(");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
        private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentbindingInflater1(Runnable runnable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.run();
                } catch (Throwable th) {
                    AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaonOutputFormatChanged6.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i++;
                if (i >= 16 && lambdaonOutputFormatChanged6.this.TuitionPaymentFragmentbindingInflater1.isDispatchNeeded(lambdaonOutputFormatChanged6.this)) {
                    lambdaonOutputFormatChanged6.this.TuitionPaymentFragmentbindingInflater1.dispatch(lambdaonOutputFormatChanged6.this, this);
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext context, Runnable block) {
        Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(block);
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this) >= this.b || !b() || (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispatch(this, new TuitionPaymentFragmentbindingInflater1(runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext context, Runnable block) {
        Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(block);
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this) >= this.b || !b() || (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispatchYield(this, new TuitionPaymentFragmentbindingInflater1(runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, runnable, coroutineContext);
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, mediaFormatMustNotUseFrameRateToFindEncoderQuirk);
    }
}
