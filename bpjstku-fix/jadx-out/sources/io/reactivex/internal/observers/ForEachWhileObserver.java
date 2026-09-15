package io.reactivex.internal.observers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.findQualityInTargetQualities;
import defpackage.formatInterval;
import defpackage.logToString;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final formatInterval onComplete;
    final logToString<? super Throwable> onError;
    final findQualityInTargetQualities<? super T> onNext;

    public ForEachWhileObserver(findQualityInTargetQualities<? super T> findqualityintargetqualities, logToString<? super Throwable> logtostring, formatInterval formatinterval) {
        this.onNext = findqualityintargetqualities;
        this.onError = logtostring;
        this.onComplete = formatinterval;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.b(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.done) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            dumpMediaCodecListForFormat.b(th2);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
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
        return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
    }
}
