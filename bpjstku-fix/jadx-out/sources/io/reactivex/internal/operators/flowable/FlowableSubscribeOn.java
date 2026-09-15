package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.ImageProxyTransformFactory;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.appendBackupVideoProfile;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableSubscribeOn<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public FlowableSubscribeOn(VideoRecordEvent<T> videoRecordEvent, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(audioConfig, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        audioConfig.b(subscribeOnSubscriber);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(subscribeOnSubscriber);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements VideoRecordEventPause<T>, OutputTransform, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final AudioConfig<? super T> downstream;
        final boolean nonScheduledRequests;
        ImageProxyTransformFactory<T> source;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;
        final AtomicReference<OutputTransform> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        SubscribeOnSubscriber(AudioConfig<? super T> audioConfig, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, ImageProxyTransformFactory<T> imageProxyTransformFactory, boolean z) {
            this.downstream = audioConfig;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.source = imageProxyTransformFactory;
            this.nonScheduledRequests = !z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            ImageProxyTransformFactory<T> imageProxyTransformFactory = this.source;
            this.source = null;
            imageProxyTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream, outputTransform)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    TuitionPaymentFragmentbindingInflater1(andSet, outputTransform);
                }
            }
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                OutputTransform outputTransform = this.upstream.get();
                if (outputTransform != null) {
                    TuitionPaymentFragmentbindingInflater1(j, outputTransform);
                    return;
                }
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.requested, j);
                OutputTransform outputTransform2 = this.upstream.get();
                if (outputTransform2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        TuitionPaymentFragmentbindingInflater1(andSet, outputTransform2);
                    }
                }
            }
        }

        private void TuitionPaymentFragmentbindingInflater1(long j, OutputTransform outputTransform) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                outputTransform.b(j);
            } else {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(outputTransform, j));
            }
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(this.upstream);
            this.worker.dispose();
        }

        static final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
            private OutputTransform TuitionPaymentFragmentbindingInflater1;
            private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            TuitionPaymentFragmentbindingInflater1(OutputTransform outputTransform, long j) {
                this.TuitionPaymentFragmentbindingInflater1 = outputTransform;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.TuitionPaymentFragmentbindingInflater1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }
}
