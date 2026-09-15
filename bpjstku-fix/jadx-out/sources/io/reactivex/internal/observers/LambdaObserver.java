package io.reactivex.internal.observers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.formatInterval;
import defpackage.logToString;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class LambdaObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
    private static final long serialVersionUID = -7251123623727029452L;
    final formatInterval onComplete;
    final logToString<? super Throwable> onError;
    final logToString<? super T> onNext;
    final logToString<? super BufferProviderState> onSubscribe;

    public LambdaObserver(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval, logToString<? super BufferProviderState> logtostring3) {
        this.onNext = logtostring;
        this.onError = logtostring2;
        this.onComplete = formatinterval;
        this.onSubscribe = logtostring3;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                bufferProviderState.dispose();
                onError(th);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
                return;
            }
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
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
