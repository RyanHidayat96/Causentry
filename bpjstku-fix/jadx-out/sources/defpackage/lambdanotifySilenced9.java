package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdanotifySilenced9<T> extends CountDownLatch implements deriveMediaType<T>, Future<T>, BufferProviderState {
    private T TuitionPaymentFragmentbindingInflater1;
    private AtomicReference<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.BufferProviderState
    public final void dispose() {
    }

    public lambdanotifySilenced9() {
        super(1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        BufferProviderState bufferProviderState;
        do {
            bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
            if (bufferProviderState == this || bufferProviderState == DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState, DisposableHelper.DISPOSED));
        if (bufferProviderState != null) {
            bufferProviderState.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (th != null) {
            throw new ExecutionException(th);
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.TuitionPaymentFragmentbindingInflater1(j, timeUnit));
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (th != null) {
            throw new ExecutionException(th);
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState);
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = t;
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        BufferProviderState bufferProviderState;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
            do {
                bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
                if (bufferProviderState == this || bufferProviderState == DisposableHelper.DISPOSED) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    return;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState, this));
            countDown();
            return;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        BufferProviderState bufferProviderState;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
            if (bufferProviderState == this || bufferProviderState == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState, this));
        countDown();
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return isDone();
    }
}
