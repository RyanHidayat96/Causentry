package io.reactivex.internal.operators.maybe;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.deriveMediaType;
import defpackage.errorToString;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeToObservable<T> extends VideoRecordEventStart<T> {
    private VideoSpecBuilder<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static <T> errorToString<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super T> derivemediatype) {
        return new MaybeToObservableObserver(derivemediatype);
    }

    static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements errorToString<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        BufferProviderState upstream;

        MaybeToObservableObserver(deriveMediaType<? super T> derivemediatype) {
            super(derivemediatype);
        }

        @Override // defpackage.errorToString
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.errorToString
        public final void b(T t) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(t);
        }

        @Override // defpackage.errorToString
        public final void onError(Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.errorToString
        public final void onComplete() {
            b();
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, defpackage.BufferProviderState
        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        new MaybeToObservableObserver(derivemediatype);
        throw null;
    }
}
