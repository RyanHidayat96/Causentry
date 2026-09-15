package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceInternalState<T> extends notifySuspended<T, T> {
    private logToString<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public AudioSourceInternalState(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, logToString<? super T> logtostring) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = logtostring;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> extends getAudioFormat<T, T> {
        private logToString<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super T> derivemediatype, logToString<? super T> logtostring) {
            super(derivemediatype);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = logtostring;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentbindingInflater1.onNext((Object) t);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.accept(t);
                } catch (Throwable th) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                }
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.accept(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
