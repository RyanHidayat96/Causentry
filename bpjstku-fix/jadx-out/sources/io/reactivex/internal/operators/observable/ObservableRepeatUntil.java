package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableBufferInfo;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRepeatUntil<T> extends notifySuspended<T, T> {
    private readableBufferInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ObservableRepeatUntil(VideoRecordEventStart<T> videoRecordEventStart, readableBufferInfo readablebufferinfo) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablebufferinfo;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        derivemediatype.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, sequentialDisposable, this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RepeatUntilObserver<T> extends AtomicInteger implements deriveMediaType<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final deriveMediaType<? super T> downstream;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> source;
        final readableBufferInfo stop;
        final SequentialDisposable upstream;

        RepeatUntilObserver(deriveMediaType<? super T> derivemediatype, readableBufferInfo readablebufferinfo, SequentialDisposable sequentialDisposable, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.upstream = sequentialDisposable;
            this.source = autoValue_VideoValidatedEncoderProfilesProxy;
            this.stop = readablebufferinfo;
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
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            try {
                if (this.stop.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    this.downstream.onComplete();
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.downstream.onError(th);
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }
}
