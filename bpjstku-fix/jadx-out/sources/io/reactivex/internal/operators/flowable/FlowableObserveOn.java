package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.AudioSettings;
import defpackage.AudioSettingsBuilder;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.appendBackupVideoProfile;
import defpackage.autoBuild;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isSonyG3125;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableObserveOn<T> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, T> {
    private int TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile b;

    public FlowableObserveOn(VideoRecordEvent<T> videoRecordEvent, appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) {
        super(videoRecordEvent);
        this.b = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        this.TuitionPaymentFragmentbindingInflater1 = i;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (audioConfig instanceof AudioSettings) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new ObserveOnConditionalSubscriber((AudioSettings) audioConfig, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1));
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new ObserveOnSubscriber(audioConfig, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements VideoRecordEventPause<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        AudioSettingsBuilder<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        OutputTransform upstream;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;

        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        abstract void a();

        abstract void g();

        BaseObserveOnSubscriber(appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z, int i) {
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                if (!this.queue.TuitionPaymentFragmentbindingInflater1(t)) {
                    this.upstream.b();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                if (getAndIncrement() == 0) {
                    this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                    return;
                }
                return;
            }
            if (getAndIncrement() == 0) {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            if (this.done) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.requested, j);
                if (getAndIncrement() == 0) {
                    this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                }
            }
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.b();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                g();
            } else if (this.sourceMode == 1) {
                a();
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, boolean z2, AudioConfig<?> audioConfig) {
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
                this.cancelled = true;
                Throwable th = this.error;
                if (th != null) {
                    audioConfig.onError(th);
                } else {
                    audioConfig.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.cancelled = true;
                this.queue.TuitionPaymentFragmentbindingInflater1();
                audioConfig.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            audioConfig.onComplete();
            this.worker.dispose();
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
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.queue.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final AudioConfig<? super T> downstream;

        ObserveOnSubscriber(AudioConfig<? super T> audioConfig, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z, int i) {
            super(tuitionPaymentFragmentspecialinlinedviewModeldefault3, z, i);
            this.downstream = audioConfig;
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.upstream, outputTransform)) {
                this.upstream = outputTransform;
                if (outputTransform instanceof autoBuild) {
                    autoBuild autobuild = (autoBuild) outputTransform;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = autobuild.TuitionPaymentFragmentspecialinlinedviewModeldefault1(7);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.sourceMode = 1;
                        this.queue = autobuild;
                        this.done = true;
                        this.downstream.b(this);
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.sourceMode = 2;
                        this.queue = autobuild;
                        this.downstream.b(this);
                        outputTransform.b(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.b(this);
                outputTransform.b(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void a() {
            AudioConfig<? super T> audioConfig = this.downstream;
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (this.cancelled) {
                            return;
                        }
                        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            this.cancelled = true;
                            audioConfig.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        audioConfig.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        j++;
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.cancelled = true;
                        this.upstream.b();
                        audioConfig.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    this.cancelled = true;
                    audioConfig.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.produced = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            AudioConfig<? super T> audioConfig = this.downstream;
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j != jAddAndGet) {
                    boolean z = this.done;
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(z, z2, audioConfig)) {
                            if (z2) {
                                break;
                            }
                            audioConfig.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            j++;
                            if (j == this.limit) {
                                if (jAddAndGet != Long.MAX_VALUE) {
                                    jAddAndGet = this.requested.addAndGet(-j);
                                }
                                this.upstream.b(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.cancelled = true;
                        this.upstream.b();
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        audioConfig.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.done, audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), audioConfig)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void g() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    this.upstream.b(j);
                    return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                this.produced = j;
            }
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final AudioSettings<? super T> downstream;

        ObserveOnConditionalSubscriber(AudioSettings<? super T> audioSettings, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z, int i) {
            super(tuitionPaymentFragmentspecialinlinedviewModeldefault3, z, i);
            this.downstream = audioSettings;
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.upstream, outputTransform)) {
                this.upstream = outputTransform;
                if (outputTransform instanceof autoBuild) {
                    autoBuild autobuild = (autoBuild) outputTransform;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = autobuild.TuitionPaymentFragmentspecialinlinedviewModeldefault1(7);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.sourceMode = 1;
                        this.queue = autobuild;
                        this.done = true;
                        this.downstream.b(this);
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.sourceMode = 2;
                        this.queue = autobuild;
                        this.downstream.b(this);
                        outputTransform.b(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.b(this);
                outputTransform.b(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void a() {
            AudioSettings<? super T> audioSettings = this.downstream;
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (this.cancelled) {
                            return;
                        }
                        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            this.cancelled = true;
                            audioSettings.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (audioSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.cancelled = true;
                        this.upstream.b();
                        audioSettings.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    this.cancelled = true;
                    audioSettings.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.produced = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            AudioSettings<? super T> audioSettings = this.downstream;
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(z, z2, audioSettings)) {
                            if (z2) {
                                break;
                            }
                            if (audioSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                                j++;
                            }
                            j2++;
                            if (j2 == this.limit) {
                                this.upstream.b(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.cancelled = true;
                        this.upstream.b();
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        audioSettings.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j3 && TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.done, audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), audioSettings)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    this.consumed = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void g() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.sourceMode != 1) {
                long j = this.consumed + 1;
                if (j == this.limit) {
                    this.consumed = 0L;
                    this.upstream.b(j);
                    return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                this.consumed = j;
            }
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
