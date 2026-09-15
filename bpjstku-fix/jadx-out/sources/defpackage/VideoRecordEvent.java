package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.subscribers.StrictSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoRecordEvent<T> implements ImageProxyTransformFactory<T> {
    public static final int BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    protected abstract void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig);

    public static int b() {
        return BUFFER_SIZE;
    }

    public static <T> VideoRecordEvent<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(status<T> statusVar, BackpressureStrategy backpressureStrategy) {
        share.b(statusVar, "source is null");
        share.b(backpressureStrategy, "mode is null");
        return new FlowableCreate(statusVar, backpressureStrategy);
    }

    @Override // defpackage.ImageProxyTransformFactory
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioConfig<? super T> audioConfig) {
        if (audioConfig instanceof VideoRecordEventPause) {
            b((VideoRecordEventPause) audioConfig);
        } else {
            share.b(audioConfig, "s is null");
            b(new StrictSubscriber(audioConfig));
        }
    }

    public final void b(VideoRecordEventPause<? super T> videoRecordEventPause) {
        share.b(videoRecordEventPause, "s is null");
        try {
            share.b(videoRecordEventPause, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            TuitionPaymentFragmentbindingInflater1(videoRecordEventPause);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
