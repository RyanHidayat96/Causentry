package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioStream<T> extends deriveCodec<T> implements newSharedInstance<T> {
    private T TuitionPaymentFragmentbindingInflater1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.TuitionPaymentFragmentbindingInflater1 = t;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new AudioStreamAudioStreamException(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1, true);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private long TuitionPaymentFragmentbindingInflater1;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState asBinder;
        private getDefaultVideoProfile<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile, long j, T t) {
            this.b = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.asBinder, bufferProviderState)) {
                this.asBinder = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.asBinder.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.asBinder.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            long j = this.TuitionPaymentFragmentbindingInflater1;
            if (j == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.asBinder.dispose();
                this.b.b(t);
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = j + 1;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.b.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (t != null) {
                this.b.b(t);
            } else {
                this.b.onError(new NoSuchElementException());
            }
        }
    }
}
