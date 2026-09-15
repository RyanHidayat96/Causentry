package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class overrideBySilence<T, U> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, U> {
    private readableMs<? super T, ? extends U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public overrideBySilence(VideoRecordEvent<T> videoRecordEvent, readableMs<? super T, ? extends U> readablems) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super U> audioConfig) {
        if (audioConfig instanceof AudioSettings) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new b((AudioSettings) audioConfig, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new TuitionPaymentFragmentbindingInflater1(audioConfig, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1<T, U> extends isLgK10<T, U> {
        private readableMs<? super T, ? extends U> TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentbindingInflater1(AudioConfig<? super U> audioConfig, readableMs<? super T, ? extends U> readablems) {
            super(audioConfig);
            this.TuitionPaymentFragmentbindingInflater1 = readablems;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            if (this.b != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(null);
                return;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext((Object) share.b(this.TuitionPaymentFragmentbindingInflater1.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                TuitionPaymentFragmentbindingInflater1(th);
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final U TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                return (U) share.b(this.TuitionPaymentFragmentbindingInflater1.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class b<T, U> extends AudioEncoderIgnoresInputTimestampQuirk<T, U> {
        private readableMs<? super T, ? extends U> b;

        b(AudioSettings<? super U> audioSettings, readableMs<? super T, ? extends U> readablems) {
            super(audioSettings);
            this.b = readablems;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(null);
                return;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((Object) share.b(this.b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.AudioSettings
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return false;
            }
            try {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Object) share.b(this.b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentbindingInflater1(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final U TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                return (U) share.b(this.b.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
