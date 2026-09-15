package defpackage;

import android.os.Process;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioSourceExternalSyntheticLambda9<T> extends notifySuspended<T, T> {
    public AudioSourceExternalSyntheticLambda9(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype));
    }

    public static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T>, BufferProviderState {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int b;
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = EmptyComponent.INSTANCE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = EmptyComponent.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            bufferProviderState.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            deriveMediaType<? super T> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentbindingInflater1 = EmptyComponent.INSTANCE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = EmptyComponent.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            derivemediatype.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            deriveMediaType<? super T> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentbindingInflater1 = EmptyComponent.INSTANCE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = EmptyComponent.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            derivemediatype.onComplete();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 8435383;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int iMyTid = Process.myTid();
            b = iMyTid;
            return iMyTid;
        }
    }
}
