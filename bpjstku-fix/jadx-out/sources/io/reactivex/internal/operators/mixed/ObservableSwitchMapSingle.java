package io.reactivex.internal.operators.mixed;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.notifyError;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMapSingle<T, R> extends VideoRecordEventStart<R> {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private readableMs<? super T, ? extends generateBackupProfile<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private VideoRecordEventStart<T> b;

    public ObservableSwitchMapSingle(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, boolean z) {
        this.b = videoRecordEventStart;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        if (notifyError.b(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, derivemediatype)) {
            return;
        }
        this.b.subscribe(new SwitchMapSingleMainObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static SwitchMapSingleObserver<Object> TuitionPaymentFragmentbindingInflater1 = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final readableMs<? super T, ? extends generateBackupProfile<? extends R>> mapper;
        BufferProviderState upstream;

        SwitchMapSingleMainObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, boolean z) {
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
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapSingleObserver2);
            }
            try {
                generateBackupProfile generatebackupprofile = (generateBackupProfile) share.b(this.mapper.apply(t), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == TuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
                generatebackupprofile.TuitionPaymentFragmentbindingInflater1(switchMapSingleObserver3);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapSingleObserver<R>) TuitionPaymentFragmentbindingInflater1);
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (!this.delayErrors) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                this.done = true;
                b();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            b();
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = TuitionPaymentFragmentbindingInflater1;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = TuitionPaymentFragmentbindingInflater1;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void b() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super R> derivemediatype = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    boolean z = this.done;
                    SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    boolean z2 = switchMapSingleObserver == null;
                    if (!z || !z2) {
                        if (!z2 && switchMapSingleObserver.item != null) {
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapSingleObserver, null);
                            derivemediatype.onNext(switchMapSingleObserver.item);
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

        static final class SwitchMapSingleObserver<R> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleMainObserver<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void b(R r) {
                this.item = r;
                this.parent.b();
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver = this.parent;
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapSingleMainObserver.inner, this, null) && ExceptionHelper.TuitionPaymentFragmentbindingInflater1(switchMapSingleMainObserver.errors, th)) {
                    if (!switchMapSingleMainObserver.delayErrors) {
                        switchMapSingleMainObserver.upstream.dispose();
                        switchMapSingleMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    }
                    switchMapSingleMainObserver.b();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
