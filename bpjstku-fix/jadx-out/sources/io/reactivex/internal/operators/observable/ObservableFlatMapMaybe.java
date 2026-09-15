package io.reactivex.internal.operators.observable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.Absent;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.acquireBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.errorToString;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapMaybe<T, R> extends notifySuspended<T, R> {
    private readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean b;

    public ObservableFlatMapMaybe(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new FlatMapMaybeObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final deriveMediaType<? super R> downstream;
        final readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> mapper;
        BufferProviderState upstream;
        final acquireBuffer set = new acquireBuffer();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<createMediaMuxer<R>> queue = new AtomicReference<>();

        FlatMapMaybeObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.delayErrors = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            try {
                VideoSpecBuilder videoSpecBuilder = (VideoSpecBuilder) share.b(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver)) {
                    return;
                }
                videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(innerObserver);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                if (getAndIncrement() == 0) {
                    TuitionPaymentFragmentbindingInflater1();
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.active.decrementAndGet();
            if (getAndIncrement() == 0) {
                TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            deriveMediaType<? super R> derivemediatype = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<createMediaMuxer<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.delayErrors || this.errors.get() == null) {
                    boolean z = atomicInteger.get() == 0;
                    createMediaMuxer<R> createmediamuxer = atomicReference.get();
                    Absent absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer != null ? createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
                    boolean z2 = absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                    if (z && z2) {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            return;
                        } else {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        derivemediatype.onNext(absentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                    createMediaMuxer<R> createmediamuxer2 = this.queue.get();
                    if (createmediamuxer2 != null) {
                        createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                    }
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
            }
            createMediaMuxer<R> createmediamuxer3 = this.queue.get();
            if (createmediamuxer3 != null) {
                createmediamuxer3.TuitionPaymentFragmentbindingInflater1();
            }
        }

        final class InnerObserver extends AtomicReference<BufferProviderState> implements errorToString<R>, BufferProviderState {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // defpackage.errorToString
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x005b  */
            /* JADX WARN: Code duplicated, block: B:33:0x007d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:39:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:41:0x006d A[EDGE_INSN: B:41:0x006d->B:28:0x006d BREAK  A[LOOP:0: B:23:0x0050->B:44:?], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
            @Override // defpackage.errorToString
            public final void b(R r) {
                createMediaMuxer<R> createmediamuxer;
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        flatMapMaybeObserver.downstream.onNext(r);
                        boolean z = flatMapMaybeObserver.active.decrementAndGet() == 0;
                        createMediaMuxer<R> createmediamuxer2 = flatMapMaybeObserver.queue.get();
                        if (!z || (createmediamuxer2 != null && !createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                            if (flatMapMaybeObserver.decrementAndGet() == 0) {
                                return;
                            }
                        } else {
                            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flatMapMaybeObserver.errors);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                flatMapMaybeObserver.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            } else {
                                flatMapMaybeObserver.downstream.onComplete();
                                return;
                            }
                        }
                    } else {
                        do {
                            createmediamuxer = flatMapMaybeObserver.queue.get();
                            if (createmediamuxer != null) {
                                break;
                            } else {
                                createmediamuxer = new createMediaMuxer<>(VideoRecordEventStart.bufferSize());
                            }
                        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapMaybeObserver.queue, null, createmediamuxer));
                        synchronized (createmediamuxer) {
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1(r);
                        }
                        flatMapMaybeObserver.active.decrementAndGet();
                        if (flatMapMaybeObserver.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    do {
                        createmediamuxer = flatMapMaybeObserver.queue.get();
                        if (createmediamuxer != null) {
                            break;
                            break;
                        }
                        createmediamuxer = new createMediaMuxer<>(VideoRecordEventStart.bufferSize());
                    } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapMaybeObserver.queue, null, createmediamuxer));
                    synchronized (createmediamuxer) {
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1(r);
                        flatMapMaybeObserver.active.decrementAndGet();
                        if (flatMapMaybeObserver.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapMaybeObserver.TuitionPaymentFragmentbindingInflater1();
            }

            @Override // defpackage.errorToString
            public final void onError(Throwable th) {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(flatMapMaybeObserver.errors, th)) {
                    if (!flatMapMaybeObserver.delayErrors) {
                        flatMapMaybeObserver.upstream.dispose();
                        flatMapMaybeObserver.set.dispose();
                    }
                    flatMapMaybeObserver.active.decrementAndGet();
                    if (flatMapMaybeObserver.getAndIncrement() == 0) {
                        flatMapMaybeObserver.TuitionPaymentFragmentbindingInflater1();
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.errorToString
            public final void onComplete() {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeObserver.active.decrementAndGet() == 0;
                        createMediaMuxer<R> createmediamuxer = flatMapMaybeObserver.queue.get();
                        if (!z || (createmediamuxer != null && !createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                            if (flatMapMaybeObserver.decrementAndGet() != 0) {
                                flatMapMaybeObserver.TuitionPaymentFragmentbindingInflater1();
                                return;
                            }
                            return;
                        } else {
                            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flatMapMaybeObserver.errors);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                flatMapMaybeObserver.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            } else {
                                flatMapMaybeObserver.downstream.onComplete();
                                return;
                            }
                        }
                    }
                }
                flatMapMaybeObserver.active.decrementAndGet();
                if (flatMapMaybeObserver.getAndIncrement() == 0) {
                    flatMapMaybeObserver.TuitionPaymentFragmentbindingInflater1();
                }
            }

            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() {
                return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            }
        }
    }
}
