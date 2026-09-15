package defpackage;

import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableCreate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoEncoderSession1 implements VideoEncoderSessionExternalSyntheticLambda6 {
    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState);

    public static VideoEncoderSession1 TuitionPaymentFragmentbindingInflater1() {
        return getCurrentAudioStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static VideoEncoderSession1 TuitionPaymentFragmentbindingInflater1(VideoOutput videoOutput) {
        share.b(videoOutput, "source is null");
        return new CompletableCreate(videoOutput);
    }

    public static VideoEncoderSession1 b(formatInterval formatinterval) {
        share.b(formatinterval, "run is null");
        return new lambdapostMaxAmplitude11androidxcameravideointernalaudioAudioSource(formatinterval);
    }

    public static VideoEncoderSession1 TuitionPaymentFragmentbindingInflater1(VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
        share.b(videoEncoderSessionExternalSyntheticLambda6, "source is null");
        if (videoEncoderSessionExternalSyntheticLambda6 instanceof VideoEncoderSession1) {
            return (VideoEncoderSession1) videoEncoderSessionExternalSyntheticLambda6;
        }
        return new lambdarelease5androidxcameravideointernalaudioAudioSource(videoEncoderSessionExternalSyntheticLambda6);
    }

    public final BufferProviderState b() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        b(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @Override // defpackage.VideoEncoderSessionExternalSyntheticLambda6
    public final void b(VideoOutputSourceState videoOutputSourceState) {
        share.b(videoOutputSourceState, "observer is null");
        try {
            share.b(videoOutputSourceState, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(videoOutputSourceState);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final BufferProviderState b(formatInterval formatinterval, logToString<? super Throwable> logtostring) {
        share.b(logtostring, "onError is null");
        share.b(formatinterval, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(logtostring, formatinterval);
        b(callbackCompletableObserver);
        return callbackCompletableObserver;
    }
}
