package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda3<T, U> extends notifySuspended<T, T> {
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public AudioSourceExternalSyntheticLambda3(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, U> implements deriveMediaType<T>, BufferProviderState {
        private boolean TuitionPaymentFragmentbindingInflater1;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        volatile long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private AtomicReference<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicReference<>();
        private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> b;
        private BufferProviderState d;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.b = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.d, bufferProviderState)) {
                this.d = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.b.apply(t), "The ObservableSource supplied is null");
                b bVar = new b(this, j, t);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState, bVar)) {
                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(bVar);
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (bufferProviderState != DisposableHelper.DISPOSED) {
                b bVar = (b) bufferProviderState;
                if (bVar != null && bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(false, true)) {
                    TuitionPaymentFragmentbindingInflater1<T, U> tuitionPaymentFragmentbindingInflater1 = bVar.b;
                    long j = bVar.TuitionPaymentFragmentbindingInflater1;
                    T t = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (j == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
                    }
                }
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.d.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.d.isDisposed();
        }

        static final class b<T, U> extends isProblematicMimeType<U> {
            final long TuitionPaymentFragmentbindingInflater1;
            final T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicBoolean();
            private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final TuitionPaymentFragmentbindingInflater1<T, U> b;

            b(TuitionPaymentFragmentbindingInflater1<T, U> tuitionPaymentFragmentbindingInflater1, long j, T t) {
                this.b = tuitionPaymentFragmentbindingInflater1;
                this.TuitionPaymentFragmentbindingInflater1 = j;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(U u) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                dispose();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }

            private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(false, true)) {
                    TuitionPaymentFragmentbindingInflater1<T, U> tuitionPaymentFragmentbindingInflater1 = this.b;
                    long j = this.TuitionPaymentFragmentbindingInflater1;
                    T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (j == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
                    }
                }
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    this.b.onError(th);
                }
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }
}
