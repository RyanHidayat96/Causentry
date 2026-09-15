package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.appendBackupVideoProfile;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableUnsubscribeOn<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;

    public FlowableUnsubscribeOn(VideoRecordEvent<T> videoRecordEvent, appendBackupVideoProfile appendbackupvideoprofile) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new UnsubscribeSubscriber(audioConfig, this.TuitionPaymentFragmentbindingInflater1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements VideoRecordEventPause<T>, OutputTransform {
        private static final long serialVersionUID = 1015244841293359600L;
        final AudioConfig<? super T> downstream;
        final appendBackupVideoProfile scheduler;
        OutputTransform upstream;

        UnsubscribeSubscriber(AudioConfig<? super T> audioConfig, appendBackupVideoProfile appendbackupvideoprofile) {
            this.downstream = audioConfig;
            this.scheduler = appendbackupvideoprofile;
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.upstream, outputTransform)) {
                this.upstream = outputTransform;
                this.downstream.b(this);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            if (get()) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            this.upstream.b(j);
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            if (compareAndSet(false, true)) {
                this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeSubscriber.this.upstream.b();
            }
        }
    }
}
