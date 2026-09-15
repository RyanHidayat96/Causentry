package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class updateSendingAudio<T, U extends Collection<? super T>, B> extends notifySuspended<T, U> {
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> b;

    public updateSendingAudio(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable, Callable<U> callable2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = callable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, U extends Collection<? super T>, B> extends stopSendingAudio<T, U, U> implements BufferProviderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> f1422a;
        private U asBinder;
        private Callable<U> asInterface;
        private BufferProviderState cancelAll;
        private AtomicReference<BufferProviderState> d;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType derivemediatype, Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((Collection) obj);
        }

        b(deriveMediaType<? super U> derivemediatype, Callable<U> callable, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable2) {
            super(derivemediatype, new MpscLinkedQueue());
            this.d = new AtomicReference<>();
            this.asInterface = callable;
            this.f1422a = callable2;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.cancelAll, bufferProviderState)) {
                this.cancelAll = bufferProviderState;
                deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    this.asBinder = (U) share.b(this.asInterface.call(), "The buffer supplied is null");
                    try {
                        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.f1422a.call(), "The boundary ObservableSource supplied is null");
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                        this.d.set(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        derivemediatype.onSubscribe(this);
                        if (this.TuitionPaymentFragmentbindingInflater1) {
                            return;
                        }
                        autoValue_VideoValidatedEncoderProfilesProxy.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.TuitionPaymentFragmentbindingInflater1 = true;
                        bufferProviderState.dispose();
                        EmptyDisposable.b(th, derivemediatype);
                    }
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    bufferProviderState.dispose();
                    EmptyDisposable.b(th2, derivemediatype);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.asBinder;
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
                U u = this.asBinder;
                if (u == null) {
                    return;
                }
                this.asBinder = null;
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
            this.cancelAll.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
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
                U u = (U) share.b(this.asInterface.call(), "The buffer supplied is null");
                try {
                    AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.f1422a.call(), "The boundary ObservableSource supplied is null");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                    if (DisposableHelper.b(this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        synchronized (this) {
                            U u2 = this.asBinder;
                            if (u2 == null) {
                                return;
                            }
                            this.asBinder = u;
                            autoValue_VideoValidatedEncoderProfilesProxy.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            b(u2, this);
                        }
                    }
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    this.cancelAll.dispose();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th2);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, U extends Collection<? super T>, B> extends isProblematicMimeType<B> {
        private b<T, U, B> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(b<T, U, B> bVar) {
            this.TuitionPaymentFragmentbindingInflater1 = bVar;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(B b) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            dispose();
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
