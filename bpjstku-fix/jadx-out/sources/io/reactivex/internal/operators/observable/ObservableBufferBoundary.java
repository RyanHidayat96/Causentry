package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.acquireBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends notifySuspended<T, U> {
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private readableMs<? super Open, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends Close>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends Open> b;

    public ObservableBufferBoundary(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends Open> autoValue_VideoValidatedEncoderProfilesProxy2, readableMs<? super Open, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends Close>> readablems, Callable<U> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        derivemediatype.onSubscribe(bufferBoundaryObserver);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(bufferBoundaryObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -8466418554264089604L;
        final readableMs<? super Open, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends Close>> bufferClose;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends Open> bufferOpen;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final deriveMediaType<? super C> downstream;
        long index;
        final createMediaMuxer<C> queue = new createMediaMuxer<>(VideoRecordEventStart.bufferSize());
        final acquireBuffer observers = new acquireBuffer();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final AtomicThrowable errors = new AtomicThrowable();

        BufferBoundaryObserver(deriveMediaType<? super C> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<? extends Open> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super Open, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends Close>> readablems, Callable<C> callable) {
            this.downstream = derivemediatype;
            this.bufferSupplier = callable;
            this.bufferOpen = autoValue_VideoValidatedEncoderProfilesProxy;
            this.bufferClose = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferOpenObserver);
                this.bufferOpen.subscribe(bufferOpenObserver);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.TuitionPaymentFragmentbindingInflater1(it.next());
                }
                this.buffers = null;
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.TuitionPaymentFragmentbindingInflater1();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferCloseObserver<T, C> bufferCloseObserver, long j) {
            boolean z;
            this.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferCloseObserver);
            if (this.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == 0) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.TuitionPaymentFragmentbindingInflater1(map.remove(Long.valueOf(j)));
                if (z) {
                    this.done = true;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super C> derivemediatype = this.downstream;
                createMediaMuxer<C> createmediamuxer = this.queue;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (z && this.errors.get() != null) {
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                        return;
                    }
                    C cTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    boolean z2 = cTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                    if (z && z2) {
                        derivemediatype.onComplete();
                        return;
                    } else if (!z2) {
                        derivemediatype.onNext(cTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        static final class BufferOpenObserver<Open> extends AtomicReference<BufferProviderState> implements deriveMediaType<Open>, BufferProviderState {
            private static final long serialVersionUID = -8498650778633225126L;
            final BufferBoundaryObserver<?, ?, Open, ?> parent;

            BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.parent = bufferBoundaryObserver;
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(Open open) {
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.parent;
                try {
                    Collection collection = (Collection) share.b(bufferBoundaryObserver.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                    AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(bufferBoundaryObserver.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
                    long j = bufferBoundaryObserver.index;
                    bufferBoundaryObserver.index = 1 + j;
                    synchronized (bufferBoundaryObserver) {
                        Map<Long, C> map = bufferBoundaryObserver.buffers;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j), (C) collection);
                        BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(bufferBoundaryObserver, j);
                        bufferBoundaryObserver.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferCloseObserver);
                        autoValue_VideoValidatedEncoderProfilesProxy.subscribe(bufferCloseObserver);
                    }
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferBoundaryObserver.upstream);
                    bufferBoundaryObserver.onError(th);
                }
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                lazySet(DisposableHelper.DISPOSED);
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.parent;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferBoundaryObserver.upstream);
                bufferBoundaryObserver.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.parent;
                bufferBoundaryObserver.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (bufferBoundaryObserver.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == 0) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferBoundaryObserver.upstream);
                    bufferBoundaryObserver.done = true;
                    bufferBoundaryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            }

            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<BufferProviderState> implements deriveMediaType<Object>, BufferProviderState {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final BufferBoundaryObserver<T, C, ?, ?> parent;

        BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j) {
            this.parent = bufferBoundaryObserver;
            this.index = j;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            BufferProviderState bufferProviderState = get();
            if (bufferProviderState != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                bufferProviderState.dispose();
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.index);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver = this.parent;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferBoundaryObserver.upstream);
                bufferBoundaryObserver.observers.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                bufferBoundaryObserver.onError(th);
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.index);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }
    }
}
