package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderNotUsePersistentInputSurfaceQuirk<T> implements deriveMediaType<T>, BufferProviderState {
    private deriveMediaType<? super T> TuitionPaymentFragmentbindingInflater1;
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean b;

    public EncoderNotUsePersistentInputSurfaceQuirk(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
            try {
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.b = true;
                try {
                    bufferProviderState.dispose();
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.b) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.b = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.TuitionPaymentFragmentbindingInflater1.onError(nullPointerException);
                    return;
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(nullPointerException, th));
                    return;
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (t == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th3) {
                dumpMediaCodecListForFormat.b(th3);
                onError(new CompositeException(nullPointerException2, th3));
                return;
            }
        }
        try {
            this.TuitionPaymentFragmentbindingInflater1.onNext(t);
        } catch (Throwable th4) {
            dumpMediaCodecListForFormat.b(th4);
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                onError(th4);
            } catch (Throwable th5) {
                dumpMediaCodecListForFormat.b(th5);
                onError(new CompositeException(th4, th5));
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.b) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        this.b = true;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.TuitionPaymentFragmentbindingInflater1.onError(new CompositeException(th, nullPointerException));
                    return;
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                dumpMediaCodecListForFormat.b(th3);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        } catch (Throwable th4) {
            dumpMediaCodecListForFormat.b(th4);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th4));
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.onComplete();
                return;
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.TuitionPaymentFragmentbindingInflater1.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.TuitionPaymentFragmentbindingInflater1.onError(nullPointerException);
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            dumpMediaCodecListForFormat.b(th3);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(nullPointerException, th3));
        }
    }
}
