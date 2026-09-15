package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSubscribeOn<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ObservableSubscribeOn(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, appendBackupVideoProfile appendbackupvideoprofile) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(derivemediatype);
        derivemediatype.onSubscribe(subscribeOnObserver);
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(subscribeOnObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentbindingInflater1(subscribeOnObserver)));
    }

    static final class SubscribeOnObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 8094547886072529208L;
        final deriveMediaType<? super T> downstream;
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        SubscribeOnObserver(deriveMediaType<? super T> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }

    final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
        private final SubscribeOnObserver<T> b;

        TuitionPaymentFragmentbindingInflater1(SubscribeOnObserver<T> subscribeOnObserver) {
            this.b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.TuitionPaymentFragmentbindingInflater1.subscribe(this.b);
        }
    }
}
