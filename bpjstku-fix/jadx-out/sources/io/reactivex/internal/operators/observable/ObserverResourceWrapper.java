package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.deriveMediaType;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
    private static final long serialVersionUID = -8612022020200669122L;
    final deriveMediaType<? super T> downstream;
    final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(deriveMediaType<? super T> derivemediatype) {
        this.downstream = derivemediatype;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }
}
