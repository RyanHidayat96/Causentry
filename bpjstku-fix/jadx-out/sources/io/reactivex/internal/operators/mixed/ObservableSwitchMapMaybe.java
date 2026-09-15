package io.reactivex.internal.operators.mixed;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.errorToString;
import defpackage.notifyError;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMapMaybe<T, R> extends VideoRecordEventStart<R> {
    private VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableSwitchMapMaybe(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoRecordEventStart;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        if (notifyError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, derivemediatype)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(new SwitchMapMaybeMainObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static SwitchMapMaybeObserver<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
        final readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> mapper;
        BufferProviderState upstream;

        SwitchMapMaybeMainObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
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
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
            if (switchMapMaybeObserver2 != null) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapMaybeObserver2);
            }
            try {
                VideoSpecBuilder videoSpecBuilder = (VideoSpecBuilder) share.b(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.inner.get();
                    if (switchMapMaybeObserver == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        return;
                    }
                } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.inner, switchMapMaybeObserver, switchMapMaybeObserver3));
                videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(switchMapMaybeObserver3);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapMaybeObserver<R>) TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (!this.delayErrors) {
                    b();
                }
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        final void b() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super R> derivemediatype = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    boolean z = this.done;
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                    boolean z2 = switchMapMaybeObserver == null;
                    if (!z || !z2) {
                        if (!z2 && switchMapMaybeObserver.item != null) {
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapMaybeObserver, null);
                            derivemediatype.onNext(switchMapMaybeObserver.item);
                        } else {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    } else {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            return;
                        } else {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                }
            }
        }

        static final class SwitchMapMaybeObserver<R> extends AtomicReference<BufferProviderState> implements errorToString<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapMaybeMainObserver<?, R> parent;

            SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.parent = switchMapMaybeMainObserver;
            }

            @Override // defpackage.errorToString
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.errorToString
            public final void b(R r) {
                this.item = r;
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }

            @Override // defpackage.errorToString
            public final void onError(Throwable th) {
                SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.parent;
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeMainObserver.inner, this, null) && ExceptionHelper.TuitionPaymentFragmentbindingInflater1(switchMapMaybeMainObserver.errors, th)) {
                    if (!switchMapMaybeMainObserver.delayErrors) {
                        switchMapMaybeMainObserver.upstream.dispose();
                        switchMapMaybeMainObserver.b();
                    }
                    switchMapMaybeMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.errorToString
            public final void onComplete() {
                SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.parent;
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeMainObserver.inner, this, null)) {
                    switchMapMaybeMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        }
    }
}
