package io.reactivex.internal.observers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getDefaultVideoProfile;
import defpackage.logToString;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T>, BufferProviderState {
    private static final long serialVersionUID = -7012088219455310787L;
    final logToString<? super Throwable> onError;
    final logToString<? super T> onSuccess;

    public ConsumerSingleObserver(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2) {
        this.onSuccess = logtostring;
        this.onError = logtostring2;
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            dumpMediaCodecListForFormat.b(th2);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void b(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
