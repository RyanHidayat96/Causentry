package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservablePublishSelector<T, R> extends notifySuspended<T, R> {
    private readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservablePublishSelector(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        PublishSubject publishSubjectB = PublishSubject.b();
        try {
            AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(publishSubjectB), "The selector returned a null ObservableSource");
            TargetObserver targetObserver = new TargetObserver(derivemediatype);
            autoValue_VideoValidatedEncoderProfilesProxy.subscribe(targetObserver);
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(publishSubjectB, targetObserver));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, R> implements deriveMediaType<T> {
        private AtomicReference<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private PublishSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(PublishSubject<T> publishSubject, AtomicReference<BufferProviderState> atomicReference) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = publishSubject;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReference;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TargetObserver<T, R> extends AtomicReference<BufferProviderState> implements deriveMediaType<R>, BufferProviderState {
        private static final long serialVersionUID = 854110278590336484L;
        final deriveMediaType<? super R> downstream;
        BufferProviderState upstream;

        TargetObserver(deriveMediaType<? super R> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.upstream.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
