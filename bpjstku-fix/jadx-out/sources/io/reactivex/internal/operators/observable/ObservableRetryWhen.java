package io.reactivex.internal.operators.observable;

import android.content.Context;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExtraSupportedQualityQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isRealmeC2;
import defpackage.isSamsungJ7Nxt;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableRetryWhen<T> extends notifySuspended<T, T> {
    private readableMs<? super VideoRecordEventStart<Throwable>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ObservableRetryWhen(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super VideoRecordEventStart<Throwable>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        isSamsungJ7Nxt issamsungj7nxt = new isSamsungJ7Nxt(PublishSubject.b());
        try {
            AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(issamsungj7nxt), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(derivemediatype, issamsungj7nxt, this.TuitionPaymentFragmentbindingInflater1);
            derivemediatype.onSubscribe(repeatWhenObserver);
            autoValue_VideoValidatedEncoderProfilesProxy.subscribe(repeatWhenObserver.inner);
            repeatWhenObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class RepeatWhenObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final deriveMediaType<? super T> downstream;
        final ExtraSupportedQualityQuirk<Throwable> signaller;
        final AutoValue_VideoValidatedEncoderProfilesProxy<T> source;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicThrowable error = new AtomicThrowable();
        final RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        RepeatWhenObserver(deriveMediaType<? super T> derivemediatype, ExtraSupportedQualityQuirk<Throwable> extraSupportedQualityQuirk, AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.signaller = extraSupportedQualityQuirk;
            this.source = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.b(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            isRealmeC2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.downstream, t, this, this.error);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.b(this.upstream, (BufferProviderState) null);
            this.active = false;
            this.signaller.onNext(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
            deriveMediaType<? super T> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (getAndIncrement() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final class InnerRepeatObserver extends AtomicReference<BufferProviderState> implements deriveMediaType<Object> {
            public static int TuitionPaymentFragmentbindingInflater1 = 0;
            public static int b = 0;
            private static final long serialVersionUID = 3254781284376480842L;

            InnerRepeatObserver() {
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(Object obj) {
                RepeatWhenObserver.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(repeatWhenObserver.upstream);
                deriveMediaType<? super T> derivemediatype = repeatWhenObserver.downstream;
                AtomicThrowable atomicThrowable = repeatWhenObserver.error;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                    if (repeatWhenObserver.getAndIncrement() == 0) {
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(repeatWhenObserver.upstream);
                deriveMediaType<? super T> derivemediatype = repeatWhenObserver.downstream;
                AtomicThrowable atomicThrowable = repeatWhenObserver.error;
                if (repeatWhenObserver.getAndIncrement() == 0) {
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                    if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        derivemediatype.onComplete();
                    }
                }
            }

            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                int i = b;
                int i2 = i % 9566739;
                b = i + 1;
                if (i2 != 0) {
                    return TuitionPaymentFragmentbindingInflater1;
                }
                int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                TuitionPaymentFragmentbindingInflater1 = i3;
                return i3;
            }
        }
    }
}
