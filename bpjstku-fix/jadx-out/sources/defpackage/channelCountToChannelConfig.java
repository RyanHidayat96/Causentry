package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class channelCountToChannelConfig<T, U> extends notifySuspended<T, U> {
    private readableMs<? super T, ? extends U> b;

    public channelCountToChannelConfig(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends U> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.b));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, U> extends getAudioFormat<T, U> {
        private readableMs<? super T, ? extends U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super U> derivemediatype, readableMs<? super T, ? extends U> readablems) {
            super(derivemediatype);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                this.TuitionPaymentFragmentbindingInflater1.onNext(null);
                return;
            }
            try {
                this.TuitionPaymentFragmentbindingInflater1.onNext((Object) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final U TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                return (U) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
