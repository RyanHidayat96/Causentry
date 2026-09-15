package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatWithCompletable<T> extends notifySuspended<T, T> {
    private VideoEncoderSessionExternalSyntheticLambda6 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ObservableConcatWithCompletable(VideoRecordEventStart<T> videoRecordEventStart, VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoEncoderSessionExternalSyntheticLambda6;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatWithObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, VideoOutputSourceState, BufferProviderState {
        private static final long serialVersionUID = -1953724749712440952L;
        final deriveMediaType<? super T> downstream;
        boolean inCompletable;
        VideoEncoderSessionExternalSyntheticLambda6 other;

        ConcatWithObserver(deriveMediaType<? super T> derivemediatype, VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
            this.downstream = derivemediatype;
            this.other = videoEncoderSessionExternalSyntheticLambda6;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (!DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState) || this.inCompletable) {
                return;
            }
            this.downstream.onSubscribe(this);
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
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, (BufferProviderState) null);
            VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = this.other;
            this.other = null;
            videoEncoderSessionExternalSyntheticLambda6.b(this);
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
