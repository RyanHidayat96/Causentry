package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSource1<T> extends VideoRecordEventStart<T> {
    private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AudioSource1(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            ((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.call(), "null ObservableSource supplied")).subscribe(derivemediatype);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }
}
