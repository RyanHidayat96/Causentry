package io.reactivex.internal.operators.observable;

import defpackage.AudioSettingsBuilder;
import defpackage.AudioTimestampFramePositionIncorrectQuirk;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.appendBackupVideoProfile;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableObserveOn<T> extends notifySuspended<T, T> {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    public ObservableObserveOn(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        this.b = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        appendBackupVideoProfile appendbackupvideoprofile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (appendbackupvideoprofile instanceof AudioTimestampFramePositionIncorrectQuirk) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(derivemediatype);
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new ObserveOnObserver(derivemediatype, appendbackupvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
        }
    }

    static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements deriveMediaType<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final deriveMediaType<? super T> downstream;
        Throwable error;
        boolean outputFused;
        AudioSettingsBuilder<T> queue;
        int sourceMode;
        BufferProviderState upstream;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;

        ObserveOnObserver(deriveMediaType<? super T> derivemediatype, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z, int i) {
            this.downstream = derivemediatype;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.delayError = z;
            this.bufferSize = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                if (bufferProviderState instanceof SharedByteBuffer) {
                    SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(7);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                            return;
                        }
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new createMediaMuxer(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.TuitionPaymentFragmentbindingInflater1(t);
            }
            if (getAndIncrement() == 0) {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        }

        @Override // defpackage.deriveMediaType
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

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                int iAddAndGet = 1;
                while (!this.disposed) {
                    boolean z = this.done;
                    Throwable th = this.error;
                    if (!this.delayError && z && th != null) {
                        this.disposed = true;
                        this.downstream.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
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
                return;
            }
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            deriveMediaType<? super T> derivemediatype = this.downstream;
            int iAddAndGet2 = 1;
            while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.done, audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), derivemediatype)) {
                while (true) {
                    boolean z2 = this.done;
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z3 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(z2, z3, derivemediatype)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            derivemediatype.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    } catch (Throwable th3) {
                        dumpMediaCodecListForFormat.b(th3);
                        this.disposed = true;
                        this.upstream.dispose();
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(th3);
                        this.worker.dispose();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, boolean z2, deriveMediaType<? super T> derivemediatype) {
            if (this.disposed) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.disposed = true;
                if (th != null) {
                    derivemediatype.onError(th);
                } else {
                    derivemediatype.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th != null) {
                this.disposed = true;
                this.queue.TuitionPaymentFragmentbindingInflater1();
                derivemediatype.onError(th);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.disposed = true;
            derivemediatype.onComplete();
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
