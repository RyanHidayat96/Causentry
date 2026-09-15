package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class checkNotReleasedOrThrow<T, S> extends VideoRecordEventStart<T> {
    private dumpCodecCapabilities<S, getRecordingStats<T>, S> TuitionPaymentFragmentbindingInflater1;
    private Callable<S> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private logToString<? super S> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public checkNotReleasedOrThrow(Callable<S> callable, dumpCodecCapabilities<S, getRecordingStats<T>, S> dumpcodeccapabilities, logToString<? super S> logtostring) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
        this.TuitionPaymentFragmentbindingInflater1 = dumpcodeccapabilities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = logtostring;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            b bVar = new b(derivemediatype, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.call());
            derivemediatype.onSubscribe(bVar);
            S sB = bVar.asInterface;
            if (bVar.b) {
                bVar.asInterface = null;
                try {
                    bVar.TuitionPaymentFragmentbindingInflater1.accept(sB);
                    return;
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    return;
                }
            }
            dumpCodecCapabilities<S, ? super getRecordingStats<T>, S> dumpcodeccapabilities = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            while (!bVar.b) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                try {
                    sB = dumpcodeccapabilities.b(sB, bVar);
                    if (bVar.g) {
                        bVar.b = true;
                        bVar.asInterface = null;
                        try {
                            bVar.TuitionPaymentFragmentbindingInflater1.accept(sB);
                            return;
                        } catch (Throwable th2) {
                            dumpMediaCodecListForFormat.b(th2);
                            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    dumpMediaCodecListForFormat.b(th3);
                    bVar.asInterface = null;
                    bVar.b = true;
                    if (bVar.g) {
                        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th3);
                    } else {
                        bVar.g = true;
                        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th3);
                    }
                    try {
                        bVar.TuitionPaymentFragmentbindingInflater1.accept(sB);
                        return;
                    } catch (Throwable th4) {
                        dumpMediaCodecListForFormat.b(th4);
                        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th4);
                        return;
                    }
                }
            }
            bVar.asInterface = null;
            try {
                bVar.TuitionPaymentFragmentbindingInflater1.accept(sB);
            } catch (Throwable th5) {
                dumpMediaCodecListForFormat.b(th5);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th5);
            }
        } catch (Throwable th6) {
            dumpMediaCodecListForFormat.b(th6);
            EmptyDisposable.b(th6, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, S> implements getRecordingStats<T>, BufferProviderState {
        final logToString<? super S> TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final dumpCodecCapabilities<S, ? super getRecordingStats<T>, S> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        S asInterface;
        volatile boolean b;
        boolean g;

        b(deriveMediaType<? super T> derivemediatype, dumpCodecCapabilities<S, ? super getRecordingStats<T>, S> dumpcodeccapabilities, logToString<? super S> logtostring, S s) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dumpcodeccapabilities;
            this.TuitionPaymentFragmentbindingInflater1 = logtostring;
            this.asInterface = s;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.b = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b;
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            if (this.g) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                IllegalStateException illegalStateException = new IllegalStateException("onNext already called in this generate turn");
                if (this.g) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(illegalStateException);
                    return;
                } else {
                    this.g = true;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(illegalStateException);
                    return;
                }
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (this.g) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                    return;
                } else {
                    this.g = true;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(nullPointerException);
                    return;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(t);
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            if (this.g) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.g = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
            }
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }
}
