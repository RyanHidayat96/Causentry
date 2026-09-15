package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.deriveMediaType;
import defpackage.errorToString;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatWithMaybe<T> extends notifySuspended<T, T> {
    private VideoSpecBuilder<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ObservableConcatWithMaybe(VideoRecordEventStart<T> videoRecordEventStart, VideoSpecBuilder<? extends T> videoSpecBuilder) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoSpecBuilder;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatWithObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, errorToString<T>, BufferProviderState {
        private static final long serialVersionUID = -1953724749712440952L;
        final deriveMediaType<? super T> downstream;
        boolean inMaybe;
        VideoSpecBuilder<? extends T> other;

        ConcatWithObserver(deriveMediaType<? super T> derivemediatype, VideoSpecBuilder<? extends T> videoSpecBuilder) {
            this.downstream = derivemediatype;
            this.other = videoSpecBuilder;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (!DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState) || this.inMaybe) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.errorToString
        public final void b(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, (BufferProviderState) null);
            VideoSpecBuilder<? extends T> videoSpecBuilder = this.other;
            this.other = null;
            videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(this);
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
}
