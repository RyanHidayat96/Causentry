package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class SilentAudioStream<T> extends deriveCodec<T> {
    private Callable<? extends Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SilentAudioStream(Callable<? extends Throwable> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = callable;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        try {
            th = (Throwable) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            dumpMediaCodecListForFormat.b(th);
        }
        EmptyDisposable.b(th, getdefaultvideoprofile);
    }
}
