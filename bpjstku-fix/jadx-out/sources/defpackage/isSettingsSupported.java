package defpackage;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
public abstract class isSettingsSupported<T> extends CountDownLatch implements deriveMediaType<T>, BufferProviderState {
    Throwable TuitionPaymentFragmentbindingInflater1;
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    T TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    BufferProviderState b;

    public isSettingsSupported() {
        super(1);
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        this.b = bufferProviderState;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        countDown();
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        BufferProviderState bufferProviderState = this.b;
        if (bufferProviderState != null) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final T TuitionPaymentFragmentbindingInflater1() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e2) {
                dispose();
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
            }
        }
        Throwable th = this.TuitionPaymentFragmentbindingInflater1;
        if (th != null) {
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
