package io.reactivex.internal.operators.observable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.Absent;
import defpackage.AudioSettingsBuilder;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMap<T, R> extends notifySuspended<T, R> {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableSwitchMap(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        if (ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new SwitchMapObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SwitchMapObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static SwitchMapInnerObserver<Object, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> mapper;
        volatile long unique;
        BufferProviderState upstream;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = switchMapInnerObserver;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapInnerObserver);
        }

        SwitchMapObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, boolean z) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.bufferSize = i;
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
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            if (switchMapInnerObserver2 != null) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapInnerObserver2);
            }
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.mapper.apply(t), "The ObservableSource returned is null");
                SwitchMapInnerObserver switchMapInnerObserver3 = new SwitchMapInnerObserver(this, j, this.bufferSize);
                do {
                    switchMapInnerObserver = this.active.get();
                    if (switchMapInnerObserver == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        return;
                    }
                } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerObserver, switchMapInnerObserver3));
                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(switchMapInnerObserver3);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (!this.done && ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (!this.delayErrors) {
                    TuitionPaymentFragmentbindingInflater1();
                }
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void TuitionPaymentFragmentbindingInflater1() {
            SwitchMapInnerObserver<T, R> andSet;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (switchMapInnerObserver == switchMapInnerObserver2 || (andSet = this.active.getAndSet((SwitchMapInnerObserver<T, R>) switchMapInnerObserver2)) == switchMapInnerObserver2 || andSet == null) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AudioSettingsBuilder<R> audioSettingsBuilder;
            Absent absentTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (getAndIncrement() == 0) {
                deriveMediaType<? super R> derivemediatype = this.downstream;
                AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                boolean z = this.delayErrors;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (this.done) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            if (z2) {
                                Throwable th = this.errors.get();
                                if (th != null) {
                                    derivemediatype.onError(th);
                                    return;
                                } else {
                                    derivemediatype.onComplete();
                                    return;
                                }
                            }
                        } else if (this.errors.get() != null) {
                            derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                            return;
                        } else if (z2) {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                    SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                    if (switchMapInnerObserver != null && (audioSettingsBuilder = switchMapInnerObserver.queue) != null) {
                        if (switchMapInnerObserver.done) {
                            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            if (z) {
                                if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                }
                            } else if (this.errors.get() != null) {
                                derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                                return;
                            } else if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                            }
                        }
                        boolean z3 = false;
                        while (!this.cancelled) {
                            if (switchMapInnerObserver != atomicReference.get()) {
                                continue;
                            } else {
                                if (!z && this.errors.get() != null) {
                                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                                    return;
                                }
                                boolean z4 = switchMapInnerObserver.done;
                                try {
                                    absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                } catch (Throwable th2) {
                                    dumpMediaCodecListForFormat.b(th2);
                                    ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th2);
                                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                    if (!z) {
                                        TuitionPaymentFragmentbindingInflater1();
                                        this.upstream.dispose();
                                        this.done = true;
                                    } else {
                                        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapInnerObserver);
                                    }
                                    z3 = true;
                                    absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                                }
                                boolean z5 = absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                                if (z4 && z5) {
                                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                } else if (!z5) {
                                    derivemediatype.onNext(absentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                } else if (z3) {
                                    continue;
                                }
                            }
                        }
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SwitchMapInnerObserver<T, R> extends AtomicReference<BufferProviderState> implements deriveMediaType<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile AudioSettingsBuilder<R> queue;

        SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.parent = switchMapObserver;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                if (bufferProviderState instanceof SharedByteBuffer) {
                    SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(7);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.queue = sharedByteBuffer;
                        this.done = true;
                        this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return;
                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.queue = sharedByteBuffer;
                        return;
                    }
                }
                this.queue = new createMediaMuxer(this.bufferSize);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.TuitionPaymentFragmentbindingInflater1(r);
                }
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            SwitchMapObserver<T, R> switchMapObserver = this.parent;
            if (this.index == switchMapObserver.unique && ExceptionHelper.TuitionPaymentFragmentbindingInflater1(switchMapObserver.errors, th)) {
                if (!switchMapObserver.delayErrors) {
                    switchMapObserver.upstream.dispose();
                    switchMapObserver.done = true;
                }
                this.done = true;
                switchMapObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }
}
