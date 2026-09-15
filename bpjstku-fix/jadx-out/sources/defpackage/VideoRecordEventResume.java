package defpackage;

import io.reactivex.internal.operators.maybe.MaybeCreate;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoRecordEventResume<T> implements VideoSpecBuilder<T> {
    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring);

    public static <T> VideoRecordEventResume<T> b(VideoSpec<T> videoSpec) {
        share.b(videoSpec, "onSubscribe is null");
        return new MaybeCreate(videoSpec);
    }

    public static <T> VideoRecordEventResume<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Callable<? extends T> callable) {
        share.b(callable, "callable is null");
        return new notifySilenced(callable);
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        AudioSource audioSource = new AudioSource();
        TuitionPaymentFragmentbindingInflater1(audioSource);
        return (T) audioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.VideoSpecBuilder
    public final void TuitionPaymentFragmentbindingInflater1(errorToString<? super T> errortostring) {
        share.b(errortostring, "observer is null");
        share.b(errortostring, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(errortostring);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
