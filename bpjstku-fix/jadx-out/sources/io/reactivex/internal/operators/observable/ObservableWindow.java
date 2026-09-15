package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindow<T> extends notifySuspended<T, VideoRecordEventStart<T>> {
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private long b;

    public ObservableWindow(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, long j2, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype) {
        if (this.b == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new WindowExactObserver(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new WindowSkipObserver(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WindowExactObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final deriveMediaType<? super VideoRecordEventStart<T>> downstream;
        long size;
        BufferProviderState upstream;
        UnicastSubject<T> window;

        WindowExactObserver(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, long j, int i) {
            this.downstream = derivemediatype;
            this.count = j;
            this.capacityHint = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.window;
            if (unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && !this.cancelled) {
                unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.capacityHint, this);
                this.window = unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.downstream.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            if (unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(t);
                long j = this.size + 1;
                this.size = j;
                if (j >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WindowSkipObserver<T> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final deriveMediaType<? super VideoRecordEventStart<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        BufferProviderState upstream;
        final AtomicInteger wip = new AtomicInteger();
        final ArrayDeque<UnicastSubject<T>> windows = new ArrayDeque<>();

        WindowSkipObserver(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, long j, long j2, int i) {
            this.downstream = derivemediatype;
            this.count = j;
            this.skip = j2;
            this.capacityHint = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            long j = this.index;
            long j2 = this.skip;
            if (j % j2 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.capacityHint, this);
                arrayDeque.offer(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                this.downstream.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            long j3 = this.firstEmission + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j3 - j2;
            } else {
                this.firstEmission = j3;
            }
            this.index = j + 1;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
}
