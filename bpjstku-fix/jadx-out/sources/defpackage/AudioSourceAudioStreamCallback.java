package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceAudioStreamCallback<T> extends notifySuspended<T, T> {
    private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private logToString<? super Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private logToString<? super T> b;

    public AudioSourceAudioStreamCallback(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval, formatInterval formatinterval2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = logtostring;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = logtostring2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = formatinterval;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = formatinterval2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private formatInterval TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private logToString<? super T> f69a;
        private logToString<? super Throwable> b;
        private BufferProviderState g;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval, formatInterval formatinterval2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.f69a = logtostring;
            this.b = logtostring2;
            this.TuitionPaymentFragmentbindingInflater1 = formatinterval;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = formatinterval2;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.g, bufferProviderState)) {
                this.g = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.g.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.g.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            try {
                this.f69a.accept(t);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                th = new CompositeException(th, th2);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
            } catch (Throwable th3) {
                dumpMediaCodecListForFormat.b(th3);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th3);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            try {
                this.TuitionPaymentFragmentbindingInflater1.run();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                onError(th2);
            }
        }
    }
}
