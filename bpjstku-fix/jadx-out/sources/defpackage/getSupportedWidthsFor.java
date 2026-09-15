package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\nj\u0002`\tH\u0017¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\nj\u0002`\tH\u0016¢\u0006\u0002\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "dispatchYield", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatch", "limitedParallelism", "parallelism", "", "name", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSupportedWidthsFor extends CoroutineDispatcher {
    public static final getSupportedWidthsFor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getSupportedWidthsFor();

    private getSupportedWidthsFor() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext context, Runnable block) {
        getHeightAlignment.INSTANCE.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(block, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext context, Runnable block) {
        getHeightAlignment.INSTANCE.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(block, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int parallelism, String name) {
        if (parallelism > 0) {
            if (parallelism >= getSupportedHeights.b) {
                getSupportedWidthsFor getsupportedwidthsfor = this;
                return name != null ? new lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(getsupportedwidthsfor, name) : getsupportedwidthsfor;
            }
            return super.limitedParallelism(parallelism, name);
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got ".concat(String.valueOf(parallelism)).toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
