package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class getRemainingBufferSizeInBytes<T> extends notifySuspended<T, isSamsungJ4<T>> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TimeUnit b;

    public getRemainingBufferSizeInBytes(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.b = timeUnit;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super isSamsungJ4<T>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T>, BufferProviderState {
        private appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super isSamsungJ4<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private long b;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super isSamsungJ4<T>> derivemediatype, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = timeUnit;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.b = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            long j = this.b;
            this.b = jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(new isSamsungJ4(t, jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
