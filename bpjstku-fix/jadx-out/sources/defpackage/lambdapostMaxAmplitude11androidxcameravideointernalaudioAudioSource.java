package defpackage;

import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.functions.Functions;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdapostMaxAmplitude11androidxcameravideointernalaudioAudioSource extends VideoEncoderSession1 {
    private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public lambdapostMaxAmplitude11androidxcameravideointernalaudioAudioSource(formatInterval formatinterval) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = formatinterval;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        Runnable runnable = Functions.b;
        share.b(runnable, "run is null");
        RunnableDisposable runnableDisposable = new RunnableDisposable(runnable);
        videoOutputSourceState.onSubscribe(runnableDisposable);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.run();
            if (runnableDisposable.isDisposed()) {
                return;
            }
            videoOutputSourceState.onComplete();
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (!runnableDisposable.isDisposed()) {
                videoOutputSourceState.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
