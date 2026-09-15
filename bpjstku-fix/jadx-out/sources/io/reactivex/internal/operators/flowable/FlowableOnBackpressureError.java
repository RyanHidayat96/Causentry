package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableOnBackpressureError<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    public FlowableOnBackpressureError(VideoRecordEvent<T> videoRecordEvent) {
        super(videoRecordEvent);
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new BackpressureErrorSubscriber(audioConfig));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BackpressureErrorSubscriber<T> extends AtomicLong implements VideoRecordEventPause<T>, OutputTransform {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final AudioConfig<? super T> downstream;
        OutputTransform upstream;

        BackpressureErrorSubscriber(AudioConfig<? super T> audioConfig) {
            this.downstream = audioConfig;
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.upstream, outputTransform)) {
                this.upstream = outputTransform;
                this.downstream.b(this);
                outputTransform.b(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                isSonyG3125.b(this, 1L);
            } else {
                this.upstream.b();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            if (this.done) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, j);
            }
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            this.upstream.b();
        }
    }
}
