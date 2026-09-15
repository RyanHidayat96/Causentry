package io.reactivex.internal.operators.mixed;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.generateBackupProfile;
import defpackage.getBytesPerFrame;
import defpackage.getDefaultVideoProfile;
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
public final class ObservableConcatMapSingle<T, R> extends VideoRecordEventStart<R> {
    private VideoRecordEventStart<T> TuitionPaymentFragmentbindingInflater1;
    private ErrorMode TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super T, ? extends generateBackupProfile<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    public ObservableConcatMapSingle(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, ErrorMode errorMode, int i) {
        this.TuitionPaymentFragmentbindingInflater1 = videoRecordEventStart;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = errorMode;
        this.b = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        if (notifyError.b(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, derivemediatype)) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatMapSingleMainObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
        R item;
        final readableMs<? super T, ? extends generateBackupProfile<? extends R>> mapper;
        final getBytesPerFrame<T> queue;
        volatile int state;
        BufferProviderState upstream;

        ConcatMapSingleMainObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, int i, ErrorMode errorMode) {
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
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
                }
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
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

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
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
                                    generateBackupProfile generatebackupprofile = (generateBackupProfile) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null SingleSource");
                                    this.state = 1;
                                    generatebackupprofile.TuitionPaymentFragmentbindingInflater1(this.inner);
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

        static final class ConcatMapSingleObserver<R> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleMainObserver<?, R> parent;

            ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.parent = concatMapSingleMainObserver;
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.b(this, bufferProviderState);
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void b(R r) {
                ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.parent;
                concatMapSingleMainObserver.item = r;
                concatMapSingleMainObserver.state = 2;
                concatMapSingleMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onError(Throwable th) {
                ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.parent;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(concatMapSingleMainObserver.errors, th)) {
                    if (concatMapSingleMainObserver.errorMode != ErrorMode.END) {
                        concatMapSingleMainObserver.upstream.dispose();
                    }
                    concatMapSingleMainObserver.state = 0;
                    concatMapSingleMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
