package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class onSuspendStateChanged<T, K> extends notifySuspended<T, T> {
    private readableMs<? super T, K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Callable<? extends Collection<? super K>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public onSuspendStateChanged(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, K> readablems, Callable<? extends Collection<? super K>> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Collection) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, K> extends getAudioFormat<T, T> {
        private Collection<? super K> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private readableMs<? super T, K> g;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype, readableMs<? super T, K> readablems, Collection<? super K> collection) {
            super(derivemediatype);
            this.g = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = collection;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                try {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(share.b(this.g.apply(t), "The keySelector returned a null key"))) {
                        this.TuitionPaymentFragmentbindingInflater1.onNext((Object) t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                    return;
                }
            }
            this.TuitionPaymentFragmentbindingInflater1.onNext(null);
        }

        @Override // defpackage.getAudioFormat, defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }

        @Override // defpackage.getAudioFormat, defpackage.deriveMediaType
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            do {
                tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    break;
                }
            } while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add((Object) share.b(this.g.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The keySelector returned a null key")));
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.getAudioFormat, defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
            super.TuitionPaymentFragmentbindingInflater1();
        }
    }
}
