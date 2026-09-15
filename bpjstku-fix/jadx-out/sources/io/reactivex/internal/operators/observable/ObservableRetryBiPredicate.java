package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpEncoderCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRetryBiPredicate<T> extends notifySuspended<T, T> {
    private dumpEncoderCapabilities<? super Integer, ? super Throwable> b;

    public ObservableRetryBiPredicate(VideoRecordEventStart<T> videoRecordEventStart, dumpEncoderCapabilities<? super Integer, ? super Throwable> dumpencodercapabilities) {
        super(videoRecordEventStart);
        this.b = dumpencodercapabilities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        derivemediatype.onSubscribe(sequentialDisposable);
        new RetryBiObserver(derivemediatype, this.b, sequentialDisposable, this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RetryBiObserver<T> extends AtomicInteger implements deriveMediaType<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final deriveMediaType<? super T> downstream;
        final dumpEncoderCapabilities<? super Integer, ? super Throwable> predicate;
        int retries;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> source;
        final SequentialDisposable upstream;

        RetryBiObserver(deriveMediaType<? super T> derivemediatype, dumpEncoderCapabilities<? super Integer, ? super Throwable> dumpencodercapabilities, SequentialDisposable sequentialDisposable, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.upstream = sequentialDisposable;
            this.source = autoValue_VideoValidatedEncoderProfilesProxy;
            this.predicate = dumpencodercapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            try {
                dumpEncoderCapabilities<? super Integer, ? super Throwable> dumpencodercapabilities = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (!dumpencodercapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer.valueOf(i), th)) {
                    this.downstream.onError(th);
                } else {
                    TuitionPaymentFragmentbindingInflater1();
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.downstream.onComplete();
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
