package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import defpackage.logToString;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableOnBackpressureDrop<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> implements logToString<T> {
    private logToString<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.logToString
    public final void accept(T t) {
    }

    public FlowableOnBackpressureDrop(VideoRecordEvent<T> videoRecordEvent) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new BackpressureDropSubscriber(audioConfig, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BackpressureDropSubscriber<T> extends AtomicLong implements VideoRecordEventPause<T>, OutputTransform {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final AudioConfig<? super T> downstream;
        final logToString<? super T> onDrop;
        OutputTransform upstream;

        BackpressureDropSubscriber(AudioConfig<? super T> audioConfig, logToString<? super T> logtostring) {
            this.downstream = audioConfig;
            this.onDrop = logtostring;
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
                return;
            }
            try {
                this.onDrop.accept(t);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.b();
                onError(th);
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
