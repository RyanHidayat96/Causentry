package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventStart;
import defpackage.acquireBuffer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.newSharedInstance;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends VideoEncoderSession1 implements newSharedInstance<T> {
    private readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableFlatMapCompletableCompletable(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(new FlatMapCompletableMainObserver(videoOutputSourceState, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new ObservableFlatMapCompletable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements BufferProviderState, deriveMediaType<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final VideoOutputSourceState downstream;
        final readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> mapper;
        BufferProviderState upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final acquireBuffer set = new acquireBuffer();

        FlatMapCompletableMainObserver(VideoOutputSourceState videoOutputSourceState, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
            this.downstream = videoOutputSourceState;
            this.mapper = readablems;
            this.delayErrors = z;
            lazySet(1);
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
                VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = (VideoEncoderSessionExternalSyntheticLambda6) share.b(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.disposed || !this.set.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver)) {
                    return;
                }
                videoEncoderSessionExternalSyntheticLambda6.b(innerObserver);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    this.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        final class InnerObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
            public final void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            }

            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() {
                return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
            }
        }
    }
}
