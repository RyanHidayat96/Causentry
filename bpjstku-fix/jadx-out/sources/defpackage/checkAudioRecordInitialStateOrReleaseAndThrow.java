package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class checkAudioRecordInitialStateOrReleaseAndThrow<T, R> extends notifySuspended<T, R> {
    private readableMs<? super T, ? extends Iterable<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public checkAudioRecordInitialStateOrReleaseAndThrow(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends Iterable<? extends R>> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, R> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super R> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private readableMs<? super T, ? extends Iterable<? extends R>> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends Iterable<? extends R>> readablems) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
            this.b = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DisposableHelper.DISPOSED) {
                try {
                    Iterator<? extends R> it = this.b.apply(t).iterator();
                    deriveMediaType<? super R> derivemediatype = this.TuitionPaymentFragmentbindingInflater1;
                    while (it.hasNext()) {
                        try {
                            try {
                                derivemediatype.onNext((Object) share.b(it.next(), "The iterator returned a null value"));
                            } catch (Throwable th) {
                                dumpMediaCodecListForFormat.b(th);
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            dumpMediaCodecListForFormat.b(th2);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    dumpMediaCodecListForFormat.b(th3);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                    onError(th3);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DisposableHelper.DISPOSED) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DisposableHelper.DISPOSED;
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DisposableHelper.DISPOSED) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DisposableHelper.DISPOSED;
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DisposableHelper.DISPOSED;
        }
    }
}
