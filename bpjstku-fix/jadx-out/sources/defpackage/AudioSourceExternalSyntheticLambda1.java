package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda1<T, U extends Collection<? super T>, B> extends notifySuspended<T, U> {
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<B> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AudioSourceExternalSyntheticLambda1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy2, Callable<U> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, U extends Collection<? super T>, B> extends stopSendingAudio<T, U, U> implements BufferProviderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<U> f74a;
        private BufferProviderState asBinder;
        private U asInterface;
        private AutoValue_VideoValidatedEncoderProfilesProxy<B> d;
        private BufferProviderState notify;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType derivemediatype, Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((Collection) obj);
        }

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super U> derivemediatype, Callable<U> callable, AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy) {
            super(derivemediatype, new MpscLinkedQueue());
            this.f74a = callable;
            this.d = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.notify, bufferProviderState)) {
                this.notify = bufferProviderState;
                try {
                    this.asInterface = (U) share.b(this.f74a.call(), "The buffer supplied is null");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                    this.asBinder = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                    if (this.TuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                    this.d.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    bufferProviderState.dispose();
                    EmptyDisposable.b(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.asInterface;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            dispose();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            synchronized (this) {
                U u = this.asInterface;
                if (u == null) {
                    return;
                }
                this.asInterface = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(u);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (this.g.getAndIncrement() == 0) {
                    isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false, this, this);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.asBinder.dispose();
            this.notify.dispose();
            if (this.g.getAndIncrement() == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            try {
                U u = (U) share.b(this.f74a.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.asInterface;
                    if (u2 == null) {
                        return;
                    }
                    this.asInterface = u;
                    b(u2, this);
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, U extends Collection<? super T>, B> extends isProblematicMimeType<B> {
        private TuitionPaymentFragmentbindingInflater1<T, U, B> TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1<T, U, B> tuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(B b) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }
    }
}
