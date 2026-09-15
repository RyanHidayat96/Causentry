package io.reactivex.internal.observers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoOutputSourceState;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyCompletableObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // defpackage.VideoOutputSourceState
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new OnErrorNotImplementedException(th));
    }

    @Override // defpackage.VideoOutputSourceState
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
    }
}
