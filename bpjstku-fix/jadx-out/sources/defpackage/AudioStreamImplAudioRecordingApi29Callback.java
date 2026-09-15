package defpackage;

import io.reactivex.internal.operators.observable.ObservableScalarXMap;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioStreamImplAudioRecordingApi29Callback<T> extends VideoRecordEventStart<T> implements setAudioFormat<T> {
    private final T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioStreamImplAudioRecordingApi29Callback(T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        derivemediatype.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    @Override // defpackage.setAudioFormat, java.util.concurrent.Callable
    public final T call() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
