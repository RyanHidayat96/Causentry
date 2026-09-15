package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceAudioSourceCallback<T> extends notifySuspended<T, T> {
    private final formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final logToString<? super BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioSourceAudioSourceCallback(VideoRecordEventStart<T> videoRecordEventStart, logToString<? super BufferProviderState> logtostring, formatInterval formatinterval) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = logtostring;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = formatinterval;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new resetBufferProvider(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }
}
