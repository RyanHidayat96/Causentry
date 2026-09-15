package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
final class getCompatibleAudioProfile implements Executor {
    public final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getCompatibleAudioProfile(CoroutineDispatcher coroutineDispatcher) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDispatchNeeded(EmptyCoroutineContext.INSTANCE)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispatch(EmptyCoroutineContext.INSTANCE, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString();
    }
}
