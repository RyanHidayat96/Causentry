package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.logToString;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableUsing<T, D> extends VideoRecordEventStart<T> {
    private readableMs<? super D, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentbindingInflater1;
    private Callable<? extends D> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private logToString<? super D> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public ObservableUsing(Callable<? extends D> callable, readableMs<? super D, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems, logToString<? super D> logtostring, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
        this.TuitionPaymentFragmentbindingInflater1 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = logtostring;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            D dCall = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.call();
            try {
                ((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentbindingInflater1.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new UsingObserver(derivemediatype, dCall, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b));
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.accept(dCall);
                    EmptyDisposable.b(th, derivemediatype);
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    EmptyDisposable.b(new CompositeException(th, th2), derivemediatype);
                }
            }
        } catch (Throwable th3) {
            dumpMediaCodecListForFormat.b(th3);
            EmptyDisposable.b(th3, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class UsingObserver<T, D> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 5904473792286235046L;
        final logToString<? super D> disposer;
        final deriveMediaType<? super T> downstream;
        final boolean eager;
        final D resource;
        BufferProviderState upstream;

        UsingObserver(deriveMediaType<? super T> derivemediatype, D d, logToString<? super D> logtostring, boolean z) {
            this.downstream = derivemediatype;
            this.resource = d;
            this.disposer = logtostring;
            this.eager = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th2) {
                        dumpMediaCodecListForFormat.b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.upstream.dispose();
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.dispose();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.dispose();
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            TuitionPaymentFragmentbindingInflater1();
            this.upstream.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get();
        }

        private void TuitionPaymentFragmentbindingInflater1() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
            }
        }
    }
}
