package io.reactivex.internal.operators.completable;

import defpackage.BufferProviderState;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.appendBackupVideoProfile;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableObserveOn extends VideoEncoderSession1 {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private VideoEncoderSessionExternalSyntheticLambda6 b;

    public CompletableObserveOn(VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6, appendBackupVideoProfile appendbackupvideoprofile) {
        this.b = videoEncoderSessionExternalSyntheticLambda6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        this.b.b(new ObserveOnCompletableObserver(videoOutputSourceState, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    static final class ObserveOnCompletableObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final VideoOutputSourceState downstream;
        Throwable error;
        final appendBackupVideoProfile scheduler;

        ObserveOnCompletableObserver(VideoOutputSourceState videoOutputSourceState, appendBackupVideoProfile appendbackupvideoprofile) {
            this.downstream = videoOutputSourceState;
            this.scheduler = appendbackupvideoprofile;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // defpackage.VideoOutputSourceState
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.VideoOutputSourceState
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this));
        }

        @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
        public final void onComplete() {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
