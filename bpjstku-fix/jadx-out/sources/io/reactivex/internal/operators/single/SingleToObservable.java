package io.reactivex.internal.operators.single;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleToObservable<T> extends VideoRecordEventStart<T> {
    private generateBackupProfile<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public SingleToObservable(generateBackupProfile<? extends T> generatebackupprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = generatebackupprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new SingleToObservableObserver(derivemediatype));
    }

    public static <T> getDefaultVideoProfile<T> TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype) {
        return new SingleToObservableObserver(derivemediatype);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements getDefaultVideoProfile<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        BufferProviderState upstream;

        SingleToObservableObserver(deriveMediaType<? super T> derivemediatype) {
            super(derivemediatype);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(t);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, defpackage.BufferProviderState
        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
