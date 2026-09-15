package io.reactivex.internal.operators.mixed;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.errorToString;
import defpackage.getBytesPerFrame;
import defpackage.notifyError;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatMapMaybe<T, R> extends VideoRecordEventStart<R> {
    private int TuitionPaymentFragmentbindingInflater1;
    private VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ErrorMode TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> b;

    public ObservableConcatMapMaybe(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, ErrorMode errorMode, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStart;
        this.b = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorMode;
        this.TuitionPaymentFragmentbindingInflater1 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        if (notifyError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, derivemediatype)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new ConcatMapMaybeMainObserver(derivemediatype, this.b, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);
        R item;
        final readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> mapper;
        final getBytesPerFrame<T> queue;
        volatile int state;
        BufferProviderState upstream;

        ConcatMapMaybeMainObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, int i, ErrorMode errorMode) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.errorMode = errorMode;
            this.queue = new createMediaMuxer(i);
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
            this.queue.TuitionPaymentFragmentbindingInflater1(t);
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
                }
                this.done = true;
                TuitionPaymentFragmentbindingInflater1();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
            if (getAndIncrement() == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                this.item = null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super R> derivemediatype = this.downstream;
                ErrorMode errorMode = this.errorMode;
                getBytesPerFrame<T> getbytesperframe = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int iAddAndGet = 1;
                while (true) {
                    if (this.cancelled) {
                        getbytesperframe.TuitionPaymentFragmentbindingInflater1();
                        this.item = null;
                    } else {
                        int i = this.state;
                        if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i == 0))) {
                            break;
                        }
                        if (i == 0) {
                            boolean z = this.done;
                            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                            if (z && z2) {
                                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                    derivemediatype.onComplete();
                                    return;
                                } else {
                                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    VideoSpecBuilder videoSpecBuilder = (VideoSpecBuilder) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null MaybeSource");
                                    this.state = 1;
                                    videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(this.inner);
                                } catch (Throwable th) {
                                    dumpMediaCodecListForFormat.b(th);
                                    this.upstream.dispose();
                                    getbytesperframe.TuitionPaymentFragmentbindingInflater1();
                                    ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th);
                                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                                    return;
                                }
                            }
                        } else if (i == 2) {
                            R r = this.item;
                            this.item = null;
                            derivemediatype.onNext(r);
                            this.state = 0;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                getbytesperframe.TuitionPaymentFragmentbindingInflater1();
                this.item = null;
                derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
            }
        }

        static final class ConcatMapMaybeObserver<R> extends AtomicReference<BufferProviderState> implements errorToString<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapMaybeMainObserver<?, R> parent;

            ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.parent = concatMapMaybeMainObserver;
            }

            @Override // defpackage.errorToString
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.b(this, bufferProviderState);
            }

            @Override // defpackage.errorToString
            public final void b(R r) {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.parent;
                concatMapMaybeMainObserver.item = r;
                concatMapMaybeMainObserver.state = 2;
                concatMapMaybeMainObserver.TuitionPaymentFragmentbindingInflater1();
            }

            @Override // defpackage.errorToString
            public final void onError(Throwable th) {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.parent;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(concatMapMaybeMainObserver.errors, th)) {
                    if (concatMapMaybeMainObserver.errorMode != ErrorMode.END) {
                        concatMapMaybeMainObserver.upstream.dispose();
                    }
                    concatMapMaybeMainObserver.state = 0;
                    concatMapMaybeMainObserver.TuitionPaymentFragmentbindingInflater1();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.errorToString
            public final void onComplete() {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.parent;
                concatMapMaybeMainObserver.state = 0;
                concatMapMaybeMainObserver.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }
}
