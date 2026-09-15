package io.reactivex.internal.operators.observable;

import defpackage.AudioSettingsBuilder;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.lambdanotifySuspended10;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatMapEager<T, R> extends notifySuspended<T, R> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ErrorMode TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> b;

    public ObservableConcatMapEager(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, ErrorMode errorMode, int i, int i2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatMapEagerMainObserver(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState, lambdanotifySuspended10<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        InnerQueuedObserver<R> current;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final ErrorMode errorMode;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        AudioSettingsBuilder<T> queue;
        int sourceMode;
        BufferProviderState upstream;
        final AtomicThrowable error = new AtomicThrowable();
        final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

        ConcatMapEagerMainObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, int i2, ErrorMode errorMode) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                if (bufferProviderState instanceof SharedByteBuffer) {
                    SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new createMediaMuxer(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1(t);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                do {
                    this.queue.TuitionPaymentFragmentbindingInflater1();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> innerQueuedObserverPoll = this.observers.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    innerQueuedObserverPoll.dispose();
                }
            }
        }

        @Override // defpackage.lambdanotifySuspended10
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.lambdanotifySuspended10
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() != 0) {
                return;
            }
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
            deriveMediaType<? super R> derivemediatype = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                int i = this.activeCount;
                while (i != this.maxConcurrency) {
                    if (this.cancelled) {
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                        return;
                    }
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            break;
                        }
                        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null ObservableSource");
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                        arrayDeque.offer(innerQueuedObserver);
                        autoValue_VideoValidatedEncoderProfilesProxy.subscribe(innerQueuedObserver);
                        i++;
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.upstream.dispose();
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th);
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                        return;
                    }
                }
                this.activeCount = i;
                if (this.cancelled) {
                    audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                    audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.error.get() != null) {
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                        return;
                    }
                    boolean z = this.done;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z2 = innerQueuedObserverPoll == null;
                    if (z && z2) {
                        if (this.error.get() != null) {
                            audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                            return;
                        }
                        derivemediatype.onComplete();
                        return;
                    }
                    if (!z2) {
                        this.current = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    AudioSettingsBuilder<R> audioSettingsBuilder2 = innerQueuedObserver2.queue;
                    while (true) {
                        if (this.cancelled) {
                            audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            return;
                        }
                        boolean z3 = innerQueuedObserver2.done;
                        if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                            audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                            return;
                        }
                        try {
                            R rTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            boolean z4 = rTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                            if (z3 && z4) {
                                this.current = null;
                                this.activeCount--;
                            } else if (!z4) {
                                derivemediatype.onNext(rTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        } catch (Throwable th2) {
                            dumpMediaCodecListForFormat.b(th2);
                            ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th2);
                            this.current = null;
                            this.activeCount--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.lambdanotifySuspended10
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.lambdanotifySuspended10
        public final void b(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.queue.TuitionPaymentFragmentbindingInflater1(r);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
