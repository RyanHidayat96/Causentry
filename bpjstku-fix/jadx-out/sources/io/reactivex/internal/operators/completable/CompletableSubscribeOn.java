package io.reactivex.internal.operators.completable;

import defpackage.BufferProviderState;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.appendBackupVideoProfile;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableSubscribeOn extends VideoEncoderSession1 {
    private appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;
    private VideoEncoderSessionExternalSyntheticLambda6 b;

    public CompletableSubscribeOn(VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6, appendBackupVideoProfile appendbackupvideoprofile) {
        this.b = videoEncoderSessionExternalSyntheticLambda6;
        this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(videoOutputSourceState, this.b);
        videoOutputSourceState.onSubscribe(subscribeOnObserver);
        DisposableHelper.b((AtomicReference<BufferProviderState>) subscribeOnObserver.task, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(subscribeOnObserver));
    }

    static final class SubscribeOnObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final VideoOutputSourceState downstream;
        final VideoEncoderSessionExternalSyntheticLambda6 source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(VideoOutputSourceState videoOutputSourceState, VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
            this.downstream = videoOutputSourceState;
            this.source = videoEncoderSessionExternalSyntheticLambda6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.source.b(this);
        }

        @Override // defpackage.VideoOutputSourceState
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.VideoOutputSourceState
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.task.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }
}
