package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.isRealmeC2;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableMergeWithCompletable<T> extends notifySuspended<T, T> {
    private VideoEncoderSessionExternalSyntheticLambda6 b;

    public ObservableMergeWithCompletable(VideoRecordEventStart<T> videoRecordEventStart, VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
        super(videoRecordEventStart);
        this.b = videoEncoderSessionExternalSyntheticLambda6;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(derivemediatype);
        derivemediatype.onSubscribe(mergeWithObserver);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(mergeWithObserver);
        this.b.b(mergeWithObserver.otherObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class MergeWithObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -4592979584110982903L;
        final deriveMediaType<? super T> downstream;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final AtomicReference<BufferProviderState> mainDisposable = new AtomicReference<>();
        final OtherObserver otherObserver = new OtherObserver(this);
        final AtomicThrowable error = new AtomicThrowable();

        MergeWithObserver(deriveMediaType<? super T> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.mainDisposable, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            isRealmeC2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.downstream, t, this, this.error);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
            deriveMediaType<? super T> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                if (getAndIncrement() == 0) {
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                deriveMediaType<? super T> derivemediatype = this.downstream;
                AtomicThrowable atomicThrowable = this.error;
                if (getAndIncrement() == 0) {
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                    if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        derivemediatype.onComplete();
                    }
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.mainDisposable.get());
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.mainDisposable);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
        }

        static final class OtherObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<?> parent;

            OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onError(Throwable th) {
                MergeWithObserver<?> mergeWithObserver = this.parent;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mergeWithObserver.mainDisposable);
                deriveMediaType<? super Object> derivemediatype = mergeWithObserver.downstream;
                AtomicThrowable atomicThrowable = mergeWithObserver.error;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
            public final void onComplete() {
                MergeWithObserver<?> mergeWithObserver = this.parent;
                mergeWithObserver.otherDone = true;
                if (mergeWithObserver.mainDone) {
                    deriveMediaType<? super Object> derivemediatype = mergeWithObserver.downstream;
                    AtomicThrowable atomicThrowable = mergeWithObserver.error;
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        } else {
                            derivemediatype.onComplete();
                        }
                    }
                }
            }
        }
    }
}
