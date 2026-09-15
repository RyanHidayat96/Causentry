package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.deriveMediaType;
import defpackage.dumpCodecCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWithLatestFrom<T, U, R> extends notifySuspended<T, R> {
    private dumpCodecCapabilities<? super T, ? super U, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ObservableWithLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpcodeccapabilities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk(derivemediatype);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(excludeStretchedVideoQualityQuirk, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        excludeStretchedVideoQualityQuirk.onSubscribe(withLatestFromObserver);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new b(withLatestFromObserver));
        this.TuitionPaymentFragmentbindingInflater1.subscribe(withLatestFromObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -312246233408980075L;
        final dumpCodecCapabilities<? super T, ? super U, ? extends R> combiner;
        final deriveMediaType<? super R> downstream;
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();
        final AtomicReference<BufferProviderState> other = new AtomicReference<>();

        WithLatestFromObserver(deriveMediaType<? super R> derivemediatype, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities) {
            this.downstream = derivemediatype;
            this.combiner = dumpcodeccapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.downstream.onNext(share.b(this.combiner.b(t, u), "The combiner returned a null value"));
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    final class b implements deriveMediaType<U> {
        private final WithLatestFromObserver<T, U, R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
        }

        b(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = withLatestFromObserver;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.other, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(U u) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.lazySet(u);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            WithLatestFromObserver<T, U, R> withLatestFromObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestFromObserver.upstream);
            withLatestFromObserver.downstream.onError(th);
        }
    }
}
