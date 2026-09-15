package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda7<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public AudioSourceExternalSyntheticLambda7(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(!this.b ? new ExcludeStretchedVideoQualityQuirk(derivemediatype) : derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private TimeUnit TuitionPaymentFragmentbindingInflater1;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BufferProviderState f75a;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.TuitionPaymentFragmentbindingInflater1 = timeUnit;
            this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.f75a, bufferProviderState)) {
                this.f75a = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.b.TuitionPaymentFragmentbindingInflater1(new RunnableC0000TuitionPaymentFragmentspecialinlinedviewModeldefault2(t), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(th), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : 0L, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.b.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.f75a.dispose();
            this.b.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        /* JADX INFO: renamed from: AudioSourceExternalSyntheticLambda7$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: collision with other inner class name */
        final class RunnableC0000TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Runnable {
            private final T TuitionPaymentFragmentbindingInflater1;

            RunnableC0000TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
                this.TuitionPaymentFragmentbindingInflater1 = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(this.TuitionPaymentFragmentbindingInflater1);
            }
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
            private final Throwable TuitionPaymentFragmentbindingInflater1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
                this.TuitionPaymentFragmentbindingInflater1 = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(this.TuitionPaymentFragmentbindingInflater1);
                } finally {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.b.dispose();
                }
            }
        }

        final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
            TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                } finally {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.b.dispose();
                }
            }
        }
    }
}
