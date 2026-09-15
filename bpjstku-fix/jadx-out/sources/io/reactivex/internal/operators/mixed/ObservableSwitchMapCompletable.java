package io.reactivex.internal.operators.mixed;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifyError;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMapCompletable<T> extends VideoEncoderSession1 {
    private readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> TuitionPaymentFragmentbindingInflater1;
    private VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean b;

    public ObservableSwitchMapCompletable(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStart;
        this.TuitionPaymentFragmentbindingInflater1 = readablems;
        this.b = z;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        if (notifyError.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, videoOutputSourceState)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new SwitchMapCompletableObserver(videoOutputSourceState, this.TuitionPaymentFragmentbindingInflater1, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SwitchMapCompletableObserver<T> implements deriveMediaType<T>, BufferProviderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SwitchMapInnerObserver f1208a = new SwitchMapInnerObserver(null);
        final boolean TuitionPaymentFragmentbindingInflater1;
        volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final VideoOutputSourceState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState asInterface;
        private readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> d;
        final AtomicThrowable b = new AtomicThrowable();
        final AtomicReference<SwitchMapInnerObserver> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReference<>();

        SwitchMapCompletableObserver(VideoOutputSourceState videoOutputSourceState, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoOutputSourceState;
            this.d = readablems;
            this.TuitionPaymentFragmentbindingInflater1 = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.asInterface, bufferProviderState)) {
                this.asInterface = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = (VideoEncoderSessionExternalSyntheticLambda6) share.b(this.d.apply(t), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                    if (switchMapInnerObserver == f1208a) {
                        return;
                    }
                } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(switchMapInnerObserver);
                }
                videoEncoderSessionExternalSyntheticLambda6.b(switchMapInnerObserver2);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.asInterface.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.b, th)) {
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    onComplete();
                    return;
                }
                AtomicReference<SwitchMapInnerObserver> atomicReference = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                SwitchMapInnerObserver switchMapInnerObserver = f1208a;
                SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
                if (andSet != null && andSet != switchMapInnerObserver) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
                }
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == null) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.asInterface.dispose();
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            SwitchMapInnerObserver switchMapInnerObserver = f1208a;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(andSet);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == f1208a;
        }

        static final class SwitchMapInnerObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, null) && ExceptionHelper.TuitionPaymentFragmentbindingInflater1(switchMapCompletableObserver.b, th)) {
                    if (switchMapCompletableObserver.TuitionPaymentFragmentbindingInflater1) {
                        if (switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(switchMapCompletableObserver.b));
                            return;
                        }
                        return;
                    }
                    switchMapCompletableObserver.dispose();
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(switchMapCompletableObserver.b);
                    if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                        switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
            public final void onComplete() {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, null) && switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(switchMapCompletableObserver.b);
                    if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                    } else {
                        switchMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }
            }
        }
    }
}
