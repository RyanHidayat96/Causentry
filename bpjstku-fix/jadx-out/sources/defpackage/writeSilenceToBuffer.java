package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class writeSilenceToBuffer<T, U, V> extends VideoRecordEventStart<V> {
    private VideoRecordEventStart<? extends T> TuitionPaymentFragmentbindingInflater1;
    private dumpCodecCapabilities<? super T, ? super U, ? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Iterable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public writeSilenceToBuffer(VideoRecordEventStart<? extends T> videoRecordEventStart, Iterable<U> iterable, dumpCodecCapabilities<? super T, ? super U, ? extends V> dumpcodeccapabilities) {
        this.TuitionPaymentFragmentbindingInflater1 = videoRecordEventStart;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iterable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpcodeccapabilities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super V> derivemediatype) {
        try {
            Iterator it = (Iterator) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                } else {
                    this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, it, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                EmptyDisposable.b(th, derivemediatype);
            }
        } catch (Throwable th2) {
            dumpMediaCodecListForFormat.b(th2);
            EmptyDisposable.b(th2, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, U, V> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super V> TuitionPaymentFragmentbindingInflater1;
        private dumpCodecCapabilities<? super T, ? super U, ? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Iterator<U> b;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super V> derivemediatype, Iterator<U> it, dumpCodecCapabilities<? super T, ? super U, ? extends V> dumpcodeccapabilities) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
            this.b = it;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpcodeccapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            try {
                try {
                    this.TuitionPaymentFragmentbindingInflater1.onNext(share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t, share.b(this.b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.b.hasNext()) {
                            return;
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                        this.TuitionPaymentFragmentbindingInflater1.onComplete();
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                        this.TuitionPaymentFragmentbindingInflater1.onError(th);
                    }
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                    this.TuitionPaymentFragmentbindingInflater1.onError(th2);
                }
            } catch (Throwable th3) {
                dumpMediaCodecListForFormat.b(th3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                this.TuitionPaymentFragmentbindingInflater1.onError(th3);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }
    }
}
