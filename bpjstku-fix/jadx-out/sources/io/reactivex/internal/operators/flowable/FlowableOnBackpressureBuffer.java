package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.createMediaMuxer;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.formatInterval;
import defpackage.getBytesPerFrame;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableOnBackpressureBuffer<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    private formatInterval TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public FlowableOnBackpressureBuffer(VideoRecordEvent<T> videoRecordEvent, int i, boolean z, boolean z2, formatInterval formatinterval) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.b = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        this.TuitionPaymentFragmentbindingInflater1 = formatinterval;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new BackpressureBufferSubscriber(audioConfig, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements VideoRecordEventPause<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final AudioConfig<? super T> downstream;
        Throwable error;
        final formatInterval onOverflow;
        boolean outputFused;
        final getBytesPerFrame<T> queue;
        final AtomicLong requested = new AtomicLong();
        OutputTransform upstream;

        BackpressureBufferSubscriber(AudioConfig<? super T> audioConfig, int i, boolean z, boolean z2, formatInterval formatinterval) {
            getBytesPerFrame<T> spscArrayQueue;
            this.downstream = audioConfig;
            this.onOverflow = formatinterval;
            this.delayError = z2;
            if (z) {
                spscArrayQueue = new createMediaMuxer<>(i);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(i);
            }
            this.queue = spscArrayQueue;
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
            if (!this.queue.TuitionPaymentFragmentbindingInflater1(t)) {
                this.upstream.b();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (this.outputFused || !SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                return;
            }
            isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.requested, j);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.b();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.TuitionPaymentFragmentbindingInflater1();
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (getAndIncrement() == 0) {
                getBytesPerFrame<T> getbytesperframe = this.queue;
                AudioConfig<? super T> audioConfig = this.downstream;
                int iAddAndGet = 1;
                while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.done, getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), audioConfig)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(z, z2, audioConfig)) {
                            if (z2) {
                                break;
                            }
                            audioConfig.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.done, getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), audioConfig)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z, boolean z2, AudioConfig<? super T> audioConfig) {
            if (this.cancelled) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    audioConfig.onError(th);
                } else {
                    audioConfig.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                audioConfig.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            audioConfig.onComplete();
            return true;
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            return this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.queue.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
