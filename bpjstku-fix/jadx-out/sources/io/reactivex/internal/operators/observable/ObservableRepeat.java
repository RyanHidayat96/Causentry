package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRepeat<T> extends notifySuspended<T, T> {
    private long b;

    public ObservableRepeat(VideoRecordEventStart<T> videoRecordEventStart, long j) {
        super(videoRecordEventStart);
        this.b = j;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        derivemediatype.onSubscribe(sequentialDisposable);
        long j = this.b;
        new RepeatObserver(derivemediatype, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RepeatObserver<T> extends AtomicInteger implements deriveMediaType<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final deriveMediaType<? super T> downstream;
        long remaining;
        final SequentialDisposable sd;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> source;

        RepeatObserver(deriveMediaType<? super T> derivemediatype, long j, SequentialDisposable sequentialDisposable, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.sd = sequentialDisposable;
            this.source = autoValue_VideoValidatedEncoderProfilesProxy;
            this.remaining = j;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.sd, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                this.downstream.onComplete();
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.sd.isDisposed()) {
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
