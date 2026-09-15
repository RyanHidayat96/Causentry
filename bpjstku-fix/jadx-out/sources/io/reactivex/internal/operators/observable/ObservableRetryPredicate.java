package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.findQualityInTargetQualities;
import defpackage.notifySuspended;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRetryPredicate<T> extends notifySuspended<T, T> {
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private findQualityInTargetQualities<? super Throwable> b;

    public ObservableRetryPredicate(VideoRecordEventStart<T> videoRecordEventStart, long j, findQualityInTargetQualities<? super Throwable> findqualityintargetqualities) {
        super(videoRecordEventStart);
        this.b = findqualityintargetqualities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        derivemediatype.onSubscribe(sequentialDisposable);
        new RepeatObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, sequentialDisposable, this.TuitionPaymentFragmentbindingInflater1).b();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RepeatObserver<T> extends AtomicInteger implements deriveMediaType<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final deriveMediaType<? super T> downstream;
        final findQualityInTargetQualities<? super Throwable> predicate;
        long remaining;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> source;
        final SequentialDisposable upstream;

        RepeatObserver(deriveMediaType<? super T> derivemediatype, long j, findQualityInTargetQualities<? super Throwable> findqualityintargetqualities, SequentialDisposable sequentialDisposable, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.upstream = sequentialDisposable;
            this.source = autoValue_VideoValidatedEncoderProfilesProxy;
            this.predicate = findqualityintargetqualities;
            this.remaining = j;
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
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.b(th)) {
                    this.downstream.onError(th);
                } else {
                    b();
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

        final void b() {
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
