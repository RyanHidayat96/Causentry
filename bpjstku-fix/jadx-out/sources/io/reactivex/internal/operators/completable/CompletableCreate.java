package io.reactivex.internal.operators.completable;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionVideoEncoderState;
import defpackage.VideoOutput;
import defpackage.VideoOutputSourceState;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.readableUs;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class CompletableCreate extends VideoEncoderSession1 {
    private VideoOutput TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public CompletableCreate(VideoOutput videoOutput) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoOutput;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        Emitter emitter = new Emitter(videoOutputSourceState);
        videoOutputSourceState.onSubscribe(emitter);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(emitter);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    static final class Emitter extends AtomicReference<BufferProviderState> implements VideoEncoderSessionVideoEncoderState, BufferProviderState {
        private static final long serialVersionUID = -2467358622224974244L;
        final VideoOutputSourceState downstream;

        Emitter(VideoOutputSourceState videoOutputSourceState) {
            this.downstream = videoOutputSourceState;
        }

        @Override // defpackage.VideoEncoderSessionVideoEncoderState
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            BufferProviderState andSet;
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // defpackage.VideoEncoderSessionVideoEncoderState
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.VideoEncoderSessionVideoEncoderState
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            BufferProviderState andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // defpackage.VideoEncoderSessionVideoEncoderState
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(readableUs readableus) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, new CancellableDisposable(readableus));
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
