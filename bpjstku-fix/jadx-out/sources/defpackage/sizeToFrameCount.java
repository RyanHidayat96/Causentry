package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class sizeToFrameCount<T> extends notifySuspended<T, T> {
    private readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public sizeToFrameCount(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        b bVar = new b(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b);
        derivemediatype.onSubscribe(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(bVar);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T> {
        private readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentbindingInflater1;
        final SequentialDisposable TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SequentialDisposable();
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1403a;
        private boolean b;

        b(deriveMediaType<? super T> derivemediatype, readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = readablems;
            this.b = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.f1403a) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    return;
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
                    return;
                }
            }
            this.f1403a = true;
            if (this.b && !(th instanceof Exception)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
                return;
            }
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxyApply = this.TuitionPaymentFragmentbindingInflater1.apply(th);
                if (autoValue_VideoValidatedEncoderProfilesProxyApply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(nullPointerException);
                    return;
                }
                autoValue_VideoValidatedEncoderProfilesProxyApply.subscribe(this);
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.f1403a = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }
    }
}
