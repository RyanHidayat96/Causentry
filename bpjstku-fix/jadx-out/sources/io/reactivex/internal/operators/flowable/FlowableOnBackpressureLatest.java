package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableOnBackpressureLatest<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    public FlowableOnBackpressureLatest(VideoRecordEvent<T> videoRecordEvent) {
        super(videoRecordEvent);
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new BackpressureLatestSubscriber(audioConfig));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements VideoRecordEventPause<T>, OutputTransform {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final AudioConfig<? super T> downstream;
        Throwable error;
        OutputTransform upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        BackpressureLatestSubscriber(AudioConfig<? super T> audioConfig) {
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
            this.current.lazySet(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.requested, j);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.b();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() == 0) {
                AudioConfig<? super T> audioConfig = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int iAddAndGet = 1;
                do {
                    long j = 0;
                    while (true) {
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!b(z, z2, audioConfig, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            audioConfig.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        if (b(this.done, atomicReference.get() == null, audioConfig, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        isSonyG3125.b(atomicLong, j);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        private boolean b(boolean z, boolean z2, AudioConfig<?> audioConfig, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                atomicReference.lazySet(null);
                audioConfig.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            audioConfig.onComplete();
            return true;
        }
    }
}
