package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getMinBufferSize<T> extends VideoRecordEventStart<T> {
    private Iterable<? extends T> b;

    public getMinBufferSize(Iterable<? extends T> iterable) {
        this.b = iterable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            Iterator<? extends T> it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                    return;
                }
                b bVar = new b(derivemediatype, it);
                derivemediatype.onSubscribe(bVar);
                if (bVar.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                while (!bVar.isDisposed()) {
                    try {
                        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(share.b(bVar.b.next(), "The iterator returned a null value"));
                        if (bVar.isDisposed()) {
                            return;
                        }
                        try {
                            if (!bVar.b.hasNext()) {
                                if (bVar.isDisposed()) {
                                    return;
                                }
                                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            dumpMediaCodecListForFormat.b(th);
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        dumpMediaCodecListForFormat.b(th2);
                        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                dumpMediaCodecListForFormat.b(th3);
                EmptyDisposable.b(th3, derivemediatype);
            }
        } catch (Throwable th4) {
            dumpMediaCodecListForFormat.b(th4);
            EmptyDisposable.b(th4, derivemediatype);
        }
    }

    static final class b<T> extends getCurrentSystemTimeNs<T> {
        boolean TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Iterator<? extends T> b;
        private boolean d;

        b(deriveMediaType<? super T> derivemediatype, Iterator<? extends T> it) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.b = it;
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            return 1;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            if (this.d) {
                return null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (!this.b.hasNext()) {
                    this.d = true;
                    return null;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            }
            return (T) share.b(this.b.next(), "The iterator returned a null value");
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.d;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.d = true;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
