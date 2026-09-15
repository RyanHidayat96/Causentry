package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSource2<T, K> extends notifySuspended<T, T> {
    private readableMs<? super T, K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private dumpEncoderCapabilities<? super K, ? super K> b;

    public AudioSource2(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, K> readablems, dumpEncoderCapabilities<? super K, ? super K> dumpencodercapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.b = dumpencodercapabilities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, K> extends getAudioFormat<T, T> {
        private dumpEncoderCapabilities<? super K, ? super K> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f68a;
        private readableMs<? super T, K> asInterface;
        private K d;

        b(deriveMediaType<? super T> derivemediatype, readableMs<? super T, K> readablems, dumpEncoderCapabilities<? super K, ? super K> dumpencodercapabilities) {
            super(derivemediatype);
            this.asInterface = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpencodercapabilities;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                this.TuitionPaymentFragmentbindingInflater1.onNext((Object) t);
                return;
            }
            try {
                K kApply = this.asInterface.apply(t);
                if (this.f68a) {
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.d, kApply);
                    this.d = kApply;
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        return;
                    }
                } else {
                    this.f68a = true;
                    this.d = kApply;
                }
                this.TuitionPaymentFragmentbindingInflater1.onNext((Object) t);
            } catch (Throwable th) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            while (true) {
                T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    return null;
                }
                K kApply = this.asInterface.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                if (!this.f68a) {
                    this.f68a = true;
                    this.d = kApply;
                    return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.d, kApply)) {
                    this.d = kApply;
                    return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                this.d = kApply;
            }
        }
    }
}
